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
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.BandDataController;
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

        initDataController();
    }

    private void initDataController() {
        Band band = new Band();
        BandMember bandMember = new BandMember();
        BandMemberImage bandMemberImage = new BandMemberImage();

        ArrayList<Band> bandsList = new ArrayList<>();
        ArrayList<BandMember> bandMemberArrayList = new ArrayList<>();
        ArrayList<BandMemberImage> yukinaImage = new ArrayList<>();
        ArrayList<BandMemberImage> sayoImage = new ArrayList<>();
        ArrayList<BandMemberImage> lisaImage = new ArrayList<>();
        ArrayList<BandMemberImage> rinkoImage = new ArrayList<>();
        ArrayList<BandMemberImage> akoImage = new ArrayList<>();

        band.getBandData(bandsList);
        bandMember.getRoseliaMember(bandMemberArrayList);
        bandMemberImage.getYukinaRarity(4, yukinaImage);
        bandMemberImage.getSayoRarity(4, sayoImage);
        bandMemberImage.getLisaRarity(4, lisaImage);
        bandMemberImage.getAkoRarity(4, akoImage);
        bandMemberImage.getRinkoRarity(4, rinkoImage);

        HashMap<String, ArrayList<BandMemberImage>> roselia = new HashMap<>();
        HashMap<String, ArrayList<BandMemberImage>> poppin = new HashMap<>();
        HashMap<String, ArrayList<BandMemberImage>> pastel = new HashMap<>();
        HashMap<String, ArrayList<BandMemberImage>> afterglow = new HashMap<>();
        HashMap<String, ArrayList<BandMemberImage>> hellohappy = new HashMap<>();

        HashMap<String, HashMap<String, ArrayList<BandMemberImage>>> grp = new HashMap<>();
        HashMap<String, HashMap<String, ArrayList<BandMemberImage>>> grp1;

        for(BandMember bm : bandMemberArrayList){
            String name = bm.getBandMemberName();
            if(name.equals("Yukina")){
                roselia.put(name, yukinaImage);
            } else if(name.equals("Sayo")){
                roselia.put(name, sayoImage);
            } else if(name.equals("Lisa")){
                roselia.put(name, lisaImage);
            } else if(name.equals("Ako")){
                roselia.put(name, akoImage);
            } else if(name.equals("Rinko")){
                roselia.put(name, rinkoImage);
            }
        }

        for(Band b : bandsList){
            String bandName = b.getBandName();
            if(bandName.equals("Roselia")){
                grp.put(b.getBandName(), roselia);
            } else if (bandName.equals("Poppin' Party")){
                grp.put(b.getBandName(), poppin);
            } else if (bandName.equals("Pastel Palettes")){
                grp.put(b.getBandName(), pastel);
            } else if (bandName.equals("Afterglow")){
                grp.put(b.getBandName(), afterglow);
            } else if (bandName.equals("Hello, Happy World!")){
                grp.put(b.getBandName(), hellohappy);
            }
        }


//        for(Band b : bandsList){
//            System.out.println("Test: " + grp.get(b.getBandName()));
//            if(b.getBandName().equals("Roselia")){
//                for(BandMember bm : bandMemberArrayList){
//                    System.out.println("Test1: " + grp.get(b.getBandName()).get(bm.getBandMemberName()));
//                    for(BandMemberImage bmi : grp.get(b.getBandName()).get(bm.getBandMemberName())){
//                        System.out.println("Test2: " + bmi.getImgTItle());
//                    }
//                }
//            }
//        }

        BandDataController bDC = new BandDataController();
        ArrayList<Band> band1 = bDC.getBandArrayList();
        ArrayList<BandMember> member = new ArrayList<>();
        ArrayList<BandMemberImage> memberImages = new ArrayList<>();
        HashMap<String, ArrayList<BandMemberImage>> map1 = new HashMap<>();

        for(Band b : band1){
            member = bDC.getBandMembersArrayList(b.getBandName());
            for(BandMember bm : member){
                memberImages = bDC.getBandMemberImagesArrayList(b.getBandName(), bm.getBandMemberName());
            }
        }

        grp1 = bDC.getWholeBand();

//        for(String key : grp.keySet()){
//            System.out.println("Grp Key: " + key);
//            for(String key1 : grp.get(key).keySet()){
//                System.out.println("Grp Key1: " + key1);
//            }
//        }
//
//        for(String key : grp1.keySet()){
//            System.out.println("Grp1 Key: " + key);
//            for(String key1 : grp1.get(key).keySet()){
//                System.out.println("Grp1 Key1: " + key1);
//            }
//        }
    }

    private List<ParentObject> initDate() {
        BandDataController bDC = new BandDataController();
        HashMap<String, HashMap<String, ArrayList<BandMemberImage>>> wholeBand = new HashMap<>();
        TitleCreator titleCreator = TitleCreator.get(this);
        List<TitleParent> title = titleCreator.getAll();
        List<ParentObject> parentObjects = new ArrayList<>();

        BandMember bm = new BandMember();
        BandMemberImage bmi = new BandMemberImage();
        wholeBand = bDC.getWholeBand();

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