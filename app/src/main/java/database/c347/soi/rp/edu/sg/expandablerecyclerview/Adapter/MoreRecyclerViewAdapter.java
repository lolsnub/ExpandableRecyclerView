package database.c347.soi.rp.edu.sg.expandablerecyclerview.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.Book;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.R;

public class MoreRecyclerViewAdapter extends RecyclerView.Adapter<MoreRecyclerViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<Book> mData;
    Dialog myDialog;

    public MoreRecyclerViewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_row, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.tvTitle.setText(mData.get(position).getTitle());
//        holder.ivImage.setImageResource(mData.get(position).getImage());
        Glide.with(mContext).load(mData.get(position).getImageURL()).into(holder.ivImage);

        myDialog = new Dialog(mContext);

        holder.ivImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialogImage(mData.get(position).getImageURL());
            }
        });

//        holder.ivIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Create SnackBar
//                Snackbar snackbar = Snackbar.make(view, holder.tvTitle.getText().toString()+" Clicked", Snackbar.LENGTH_INDEFINITE)
//                        // Set action button
//                        .setAction("UNDO", new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                //Create SnackBar1
//                                Snackbar snackbar1 = Snackbar.make(view, "Undo Successful", Snackbar.LENGTH_SHORT);
//                                // Display SnackBar1
//                                snackbar1.show();
//                            }
//                        })
//                        // Set action button text color
//                        .setActionTextColor(Color.RED);
//
//                // set SnackBar color
//                View snackView = snackbar.getView();
//                TextView textView = snackView.findViewById(android.support.design.R.id.snackbar_text);
//                textView.setTextColor(Color.YELLOW);
//
//                // Display SnackBar
//                snackbar.show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageView ivImage;
        public MyViewHolder(View itemView){
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
//            ivIcon = (ImageView) itemView.findViewById(R.id.ivIcon);
        }
    }

    private void displayDialogImage(String id){
        ImageView ivDisplay;
        TextView tvDisplayClose;
        myDialog.setContentView(R.layout.customdisplay);
        tvDisplayClose = (TextView) myDialog.findViewById(R.id.tvDisplayClose);
        ivDisplay = (ImageView) myDialog.findViewById(R.id.ivDisplay);
//        ivDisplay.setImageResource(id);
        Glide.with(mContext).load(id).into(ivDisplay);
        tvDisplayClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

}
