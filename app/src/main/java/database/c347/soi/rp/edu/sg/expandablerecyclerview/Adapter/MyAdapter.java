package database.c347.soi.rp.edu.sg.expandablerecyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.HorizontalModel;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleChild;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleParent;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.MoreActivity;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.R;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.ViewHolder.TitleChildViewHolder;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.ViewHolder.TitleParentViewHolder;

public class MyAdapter extends ExpandableRecyclerAdapter<TitleParentViewHolder, TitleChildViewHolder> {

    LayoutInflater inflater;
    Context mContext;

    public MyAdapter(Context mContext, List<ParentObject> parentItemList) {
        super(mContext, parentItemList);
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public TitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_parent,viewGroup,false);
        return new TitleParentViewHolder(view);
    }

    @Override
    public TitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_child,viewGroup,false);
        return new TitleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {
        TitleParent title = (TitleParent) o;
        Glide.with(mContext).load(title.getImgURL()).into(titleParentViewHolder.ivLogoImg);
        titleParentViewHolder.cvPartentLayout.setCardBackgroundColor(Color.parseColor(title.getBgColor()));
//        titleParentViewHolder.tvParentTitle.setText(title.getTitle());
    }

    @Override
    public void onBindChildViewHolder(TitleChildViewHolder titleChildViewHolder, int i, Object o) {
        TitleChild titleChild = (TitleChild) o;
        final String title = titleChild.getTitle();
        ArrayList<HorizontalModel> singleItem = titleChild.getArrayList();

        titleChildViewHolder.tvTitle.setText(title);
        HorizontalRecyclerViewAdapter horizontalRecyclerViewAdapter = new HorizontalRecyclerViewAdapter(mContext, singleItem);
        titleChildViewHolder.rvListHorizontal.setHasFixedSize(true);
        titleChildViewHolder.rvListHorizontal.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        titleChildViewHolder.rvListHorizontal.setAdapter(horizontalRecyclerViewAdapter);

        titleChildViewHolder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, MoreActivity.class);
                i.putExtra("title", title);
                mContext.startActivity(i);
            }
        });

    }
}
