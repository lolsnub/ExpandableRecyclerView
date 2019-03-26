package database.c347.soi.rp.edu.sg.expandablerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import database.c347.soi.rp.edu.sg.expandablerecyclerview.Adapter.MyAdapter;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.Band;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.BandMember;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.HorizontalModel;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleChild;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleCreator;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleParent;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((MyAdapter) rvList.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvList= (RecyclerView) findViewById(R.id.rvList);
        rvList.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this, initDate());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        rvList.setAdapter(adapter);
    }

    private List<ParentObject> initDate() {
        TitleCreator titleCreator = TitleCreator.get(this);
        List<TitleParent> title = titleCreator.getAll();
        List<ParentObject> parentObjects = new ArrayList<>();

        String[] roseliaTitleList = {"Yukina", "Sayo", "Lisa", "Ako", "Rinko"};
        String[] poppinTitleList = {"Kasumi", "Tae", "Rimi", "Saaya", "Arisa"};
        String[] pastelTitleList = {"Aya", "Hina", "Chisato", "Maya", "Eve"};
        String[] afterglowTitleList = {"Ran", "Moca", "Himari", "Tomoe", "Tsugumi"};
        String[] helloTitleList = {"Kokoro", "Kaoru", "Hagumi", "Kanon", "Misaki"};

        int[] yukinaImage = {R.drawable.y_image_01, R.drawable.y_image_02, R.drawable.y_image_03, R.drawable.y_image_04,R.drawable.y_image_05,
                R.drawable.y_image_06, R.drawable.y_image_07, R.drawable.y_image_08, R.drawable.y_image_09, R.drawable.y_image_10, R.drawable.y_image_11,
                R.drawable.y_image_12, R.drawable.y_image_13, R.drawable.y_image_14 };
        int[] rinkoImage = {R.drawable.rk_image_01, R.drawable.rk_image_02, R.drawable.rk_image_03, R.drawable.rk_image_04, R.drawable.rk_image_05,
                R.drawable.rk_image_06, R.drawable.rk_image_07, R.drawable.rk_image_08, R.drawable.rk_image_09, R.drawable.rk_image_10};
        int[] sayoImage = {R.drawable.sayo_image_01, R.drawable.sayo_image_02, R.drawable.sayo_image_03, R.drawable.sayo_image_04, R.drawable.sayo_image_05,
                R.drawable.sayo_image_06, R.drawable.sayo_image_07, R.drawable.sayo_image_08, R.drawable.sayo_image_09, R.drawable.sayo_image_10};
        int[] akoImage = {R.drawable.ako_image_01, R.drawable.ako_image_02, R.drawable.ako_image_03, R.drawable.ako_image_04, R.drawable.ako_image_05,
                R.drawable.ako_image_06, R.drawable.ako_image_07, R.drawable.ako_image_08, R.drawable.ako_image_09, R.drawable.ako_image_10};
        int[] lisaImage = {R.drawable.lisa_image_01, R.drawable.lisa_image_02, R.drawable.lisa_image_03, R.drawable.lisa_image_04, R.drawable.lisa_image_05,
                R.drawable.lisa_image_06, R.drawable.lisa_image_07, R.drawable.lisa_image_08, R.drawable.lisa_image_09, R.drawable.lisa_image_10,
                R.drawable.lisa_image_11, R.drawable.lisa_image_12};

        for(TitleParent titleParent : title){
            ArrayList<HorizontalModel> arrayListHorizontal1 = new ArrayList<>();
            List<Object> childList = new ArrayList<>();
            if(titleParent.getBangName().equals("Roselia")){
                for(int i=0; i<roseliaTitleList.length; i++){
                    String name = roseliaTitleList[i];
                    if(name.equals("Yukina")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(yukinaImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    } else if(name.equals("Sayo")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(sayoImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    } else if(name.equals("Lisa")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(lisaImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    } else if(name.equals("Ako")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(akoImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    } else if(name.equals("Rinko")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(rinkoImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    }
                }
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Poppin' Party")){
//                List<Object> childList = new ArrayList<>();
                HorizontalModel horizontalModel = new HorizontalModel();
                childList.add(new TitleChild(poppinTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Pastel Palettes")){
//                List<Object> childList = new ArrayList<>();
                HorizontalModel horizontalModel = new HorizontalModel();
                childList.add(new TitleChild(pastelTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Afterglow")){
//                List<Object> childList = new ArrayList<>();
                HorizontalModel horizontalModel = new HorizontalModel();
                childList.add(new TitleChild(afterglowTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Hello, Happy World!")){
//                List<Object> childList = new ArrayList<>();
                HorizontalModel horizontalModel = new HorizontalModel();
                childList.add(new TitleChild(helloTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            }

        }
        return parentObjects;
    }

    private void initData(){
        HashMap<ArrayList<Band>, ArrayList<BandMember>> map = new HashMap<>();
        ArrayList<Band> bandArrayList = new ArrayList<>();
        ArrayList<BandMember> roseliaMemberList = new ArrayList<>();
        ArrayList<BandMember> poppinMemberList = new ArrayList<>();
        ArrayList<BandMember> pastelMemberList = new ArrayList<>();
        ArrayList<BandMember> afterglowMemberList = new ArrayList<>();
        ArrayList<BandMember> happyMemberList = new ArrayList<>();

        bandArrayList.add(new Band("Roselia", "#5B67FF", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2Froselia_logo.png?alt=media&token=6474a7de-fe6d-4d38-923f-e871f1104b53"));
        bandArrayList.add(new Band("Poppin' Party", "#FF3B72", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FPoppin'Party.png?alt=media&token=744d3c66-2b93-4f70-bb68-8e73268e8866"));
        bandArrayList.add(new Band("Pastel Palettes", "#5B67FF", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FPastel_Palettes.png?alt=media&token=35655b1b-eaf2-449a-bc9d-9a6410768f65"));
        bandArrayList.add(new Band("Afterglow", "#E53343", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FAfterglow.png?alt=media&token=a71798a8-9706-43d5-b939-5aa9839064de"));
        bandArrayList.add(new Band("Hello, Happy World!", "#FFC02A", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FHello%2C%20Happy%20World!.png?alt=media&token=02c51201-7191-4167-a308-8b7dba053b5e"));


    }
}
