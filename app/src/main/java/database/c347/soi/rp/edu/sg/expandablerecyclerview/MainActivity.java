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
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.BandMember;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.BandMemberImage;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.HorizontalModel;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleChild;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleCreator;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.TitleParent;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    ArrayList<BandMember> bandMemberArrayList;
    ArrayList<BandMemberImage> bandMemberImageArrayList;
    List<Object> childList;

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

        BandMember bm = new BandMember();
        BandMemberImage bmi = new BandMemberImage();

        for(TitleParent titleParent : title){
            childList = new ArrayList<>();
            bandMemberArrayList = new ArrayList<>();
            if(titleParent.getBangName().equals("Roselia")){
                bm.getRoseliaMember(bandMemberArrayList);
                for(BandMember b : bandMemberArrayList){
                    bandMemberImageArrayList = new ArrayList<>();
                    String name = b.getBandMemberName();
                    if(name.equals("Yukina")){
                        bmi.getYukinaRarity(4, bandMemberImageArrayList);
                    } else if(name.equals("Sayo")){
                        bmi.getSayoRarity(4, bandMemberImageArrayList);
                    } else if(name.equals("Lisa")){
                        bmi.getLisaRarity(4, bandMemberImageArrayList);
                    } else if(name.equals("Ako")){
                        bmi.getAkoRarity(4, bandMemberImageArrayList);
                    } else if(name.equals("Rinko")){
                        bmi.getRinkoRarity(4, bandMemberImageArrayList);
                    }
                    initData(name, bandMemberImageArrayList);
                }
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Poppin' Party")){
                bm.getPoppinMember(bandMemberArrayList);
                for(BandMember b : bandMemberArrayList){
                    bandMemberImageArrayList = new ArrayList<>();
                    String name = b.getBandMemberName();
                    if(name.equals("Kasumi")){
                        bmi.getKasumiRarity(4, bandMemberImageArrayList);
                        initData(name, bandMemberImageArrayList);
                    }
                }
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Pastel Palettes")){
                bm.getPastelMember(bandMemberArrayList);
                for(BandMember b : bandMemberArrayList){
                    bandMemberImageArrayList = new ArrayList<>();
                    String name = b.getBandMemberName();
                    if(name.equals("Aya")){
                        bmi.getAyaRarity(4, bandMemberImageArrayList);
                        initData(name, bandMemberImageArrayList);
                    }
                }
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Afterglow")){
                bm.getAfterglowMember(bandMemberArrayList);
                for(BandMember b : bandMemberArrayList){
                    bandMemberImageArrayList = new ArrayList<>();
                    String name = b.getBandMemberName();
                    if(name.equals("Ran")){
                        bmi.getRanRarity(4, bandMemberImageArrayList);
                        initData(name, bandMemberImageArrayList);
                    }
                }
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Hello, Happy World!")){
                bm.getHappyMember(bandMemberArrayList);
                for(BandMember b : bandMemberArrayList){
                    bandMemberImageArrayList = new ArrayList<>();
                    String name = b.getBandMemberName();
                    if(name.equals("Kokoro")){
                        bmi.getKokoroRarity(4, bandMemberImageArrayList);
                        initData(name, bandMemberImageArrayList);
                    }
                }
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            }

        }
        return parentObjects;
    }

    public void initData(String name, ArrayList<BandMemberImage> bmImg){
        TitleChild titleChild = new TitleChild();
        titleChild.setTitle(name);
        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
        for(int j=0; j<5; j++){
            HorizontalModel horizontalModel = new HorizontalModel();
            horizontalModel.setName(bmImg.get(j).getImgTItle());
            horizontalModel.setDescription("Description: " +j);
            horizontalModel.setImgURL(bmImg.get(j).getImgURL());
            arrayListHorizontal.add(horizontalModel);
        }
        titleChild.setArrayList(arrayListHorizontal);
        childList.add(titleChild);
    }

}