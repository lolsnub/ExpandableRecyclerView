package database.c347.soi.rp.edu.sg.expandablerecyclerview.ViewHolder;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import database.c347.soi.rp.edu.sg.expandablerecyclerview.R;

public class TitleParentViewHolder extends ParentViewHolder {

//    public TextView tvParentTitle;
    public ImageView ivLogoImg;
    public ImageButton ibExpandArrow;
    public CardView cvPartentLayout;

    public TitleParentViewHolder(View itemView) {
        super(itemView);
        ivLogoImg = (ImageView) itemView.findViewById(R.id.ivLogoImg);
        ibExpandArrow = (ImageButton) itemView.findViewById(R.id.ibExpandArrow);
        cvPartentLayout = (CardView) itemView.findViewById(R.id.cvPartentLayout);
    }


}
