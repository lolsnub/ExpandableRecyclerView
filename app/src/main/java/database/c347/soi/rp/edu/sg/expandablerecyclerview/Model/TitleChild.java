package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import java.util.ArrayList;

public class TitleChild {
    public String title;
    ArrayList<HorizontalModel> arrayList;

    public TitleChild(String title, ArrayList<HorizontalModel> arrayList) {
        this.title = title;
        this.arrayList = arrayList;
    }

    public TitleChild(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<HorizontalModel> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<HorizontalModel> arrayList) {
        this.arrayList = arrayList;
    }
}
