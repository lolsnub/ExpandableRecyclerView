package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {
    static TitleCreator titleCreator;
    List<TitleParent> titleParentList;
    ArrayList<Band> bandArrayList;

    public TitleCreator(Context mContext){
        titleParentList = new ArrayList<>();
        Band band = new Band();
        bandArrayList = new ArrayList<>();
        band.getBandData(bandArrayList);
        for(Band b : bandArrayList){
            TitleParent img = new TitleParent(b.getBandLogo(), b.getBandName(), b.getBandColor());
            titleParentList.add(img);
        }
    }

    public static TitleCreator get(Context context){
        if(titleCreator == null){
            titleCreator = new TitleCreator(context);
        }
        return titleCreator;
    }

    public List<TitleParent> getAll() {
        return titleParentList;
    }
}
