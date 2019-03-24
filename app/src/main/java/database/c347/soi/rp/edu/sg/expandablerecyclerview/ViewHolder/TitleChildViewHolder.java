package database.c347.soi.rp.edu.sg.expandablerecyclerview.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import database.c347.soi.rp.edu.sg.expandablerecyclerview.R;

public class TitleChildViewHolder extends ChildViewHolder {

    public RecyclerView rvListHorizontal;
    public TextView tvTitle;
    public Button btnMore;

    public TitleChildViewHolder(View itemView) {
        super(itemView);
        rvListHorizontal = (RecyclerView) itemView.findViewById(R.id.rvListHorizontal);
        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        btnMore = (Button) itemView.findViewById(R.id.btnMore);
    }
}
