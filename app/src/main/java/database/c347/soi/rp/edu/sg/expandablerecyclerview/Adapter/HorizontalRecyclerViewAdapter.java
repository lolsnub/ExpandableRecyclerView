package database.c347.soi.rp.edu.sg.expandablerecyclerview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.HorizontalModel;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.R;

public class HorizontalRecyclerViewAdapter extends RecyclerView.Adapter<HorizontalRecyclerViewAdapter.HorizontalRVViewHolder> {

    private Context context;
    private ArrayList<HorizontalModel> arrayList;

    public HorizontalRecyclerViewAdapter(Context context, ArrayList<HorizontalModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public HorizontalRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        return new HorizontalRVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalRVViewHolder holder, int position) {
        final HorizontalModel horizontalModel = arrayList.get(position);
        holder.tvTitle.setText(horizontalModel.getName());
        if(horizontalModel.getImgURL() == null){
            holder.ivThumb.setImageResource(horizontalModel.getImg());
        } else {
            Glide.with(context).load(horizontalModel.getImgURL()).into(holder.ivThumb);
        }

//        holder.ivThumb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context,horizontalModel.getName(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class HorizontalRVViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;
        ImageView ivThumb;

        public HorizontalRVViewHolder(View itemView){
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivThumb = (ImageView) itemView.findViewById(R.id.ivThumbImg);
        }

    }
}
