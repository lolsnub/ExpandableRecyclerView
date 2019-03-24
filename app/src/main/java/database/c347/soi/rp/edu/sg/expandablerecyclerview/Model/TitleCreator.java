package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {
    static TitleCreator titleCreator;
    List<TitleParent> titleParentList;

    public TitleCreator(Context mContext){
        titleParentList = new ArrayList<>();
        String[] imgURL = {"https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2Froselia_logo.png?alt=media&token=6474a7de-fe6d-4d38-923f-e871f1104b53",
        "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FPoppin'Party.png?alt=media&token=744d3c66-2b93-4f70-bb68-8e73268e8866",
        "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FPastel_Palettes.png?alt=media&token=35655b1b-eaf2-449a-bc9d-9a6410768f65",
        "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FAfterglow.png?alt=media&token=a71798a8-9706-43d5-b939-5aa9839064de",
        "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FHello%2C%20Happy%20World!.png?alt=media&token=02c51201-7191-4167-a308-8b7dba053b5e"};
        String[] bangName = {"Roselia", "Poppin' Party", "Pastel Palettes", "Afterglow","Hello, Happy World!"};
        String[] bangColor = {"#5B67FF", "#FF3B72", "#2AF6B1", "#E53343", "#FFC02A"};
        for(int i=0; i<imgURL.length; i++){
//            TitleParent title = new TitleParent(String.format("Caller #%d", i));
//            titleParentList.add(title);
            TitleParent img = new TitleParent(imgURL[i], bangName[i], bangColor[i]);
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
