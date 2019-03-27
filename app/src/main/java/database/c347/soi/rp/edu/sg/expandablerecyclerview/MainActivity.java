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
        int[] kasumiImage = {R.drawable.kasumi_4_image_01, R.drawable.kasumi_4_image_02, R.drawable.kasumi_4_image_03, R.drawable.kasumi_4_image_04, R.drawable.kasumi_4_image_05};
        int[] ayaImage = {R.drawable.aya_4_image_06, R.drawable.aya_4_image_07, R.drawable.aya_4_image_08, R.drawable.aya_4_image_09, R.drawable.aya_4_image_10};
        int[] ranImage = {R.drawable.ran_4_image_01,R.drawable.ran_4_image_02,R.drawable.ran_4_image_03,R.drawable.ran_4_image_04,R.drawable.ran_4_image_05};
        int[] kokoroImage = {R.drawable.kokoro_4_image_01,R.drawable.kokoro_4_image_02,R.drawable.kokoro_4_image_03,R.drawable.kokoro_4_image_04,R.drawable.kokoro_4_image_05};



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
                for(int i=0; i<poppinTitleList.length; i++){
                    String name = poppinTitleList[i];
                    if(name.equals("Kasumi")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(kasumiImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    }
                }
//                List<Object> childList = new ArrayList<>();
//                HorizontalModel horizontalModel = new HorizontalModel();
//                childList.add(new TitleChild(poppinTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Pastel Palettes")){
//                List<Object> childList = new ArrayList<>();
                for(int i=0; i<pastelTitleList.length; i++){
                    String name = pastelTitleList[i];
                    if(name.equals("Aya")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(ayaImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    }
                }
//                HorizontalModel horizontalModel = new HorizontalModel();
//                childList.add(new TitleChild(pastelTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Afterglow")){
//                List<Object> childList = new ArrayList<>();
                for(int i=0; i<afterglowTitleList.length; i++){
                    String name = afterglowTitleList[i];
                    if(name.equals("Ran")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(ranImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    }
                }
//                HorizontalModel horizontalModel = new HorizontalModel();
//                childList.add(new TitleChild(afterglowTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            } else if(titleParent.getBangName().equals("Hello, Happy World!")){
//                List<Object> childList = new ArrayList<>();
                for(int i=0; i<helloTitleList.length; i++){
                    String name = helloTitleList[i];
                    if(name.equals("Kokoro")){
                        TitleChild titleChild = new TitleChild();
                        titleChild.setTitle(name);
                        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
                        int k = 1;

                        for(int j=0; j<5; j++){
                            HorizontalModel horizontalModel = new HorizontalModel();
                            horizontalModel.setName(name + " : 0" +k);
                            horizontalModel.setDescription("Description: " +j);
                            horizontalModel.setImg(kokoroImage[j]);
                            arrayListHorizontal.add(horizontalModel);
                            k++;
                        }
                        titleChild.setArrayList(arrayListHorizontal);
                        childList.add(titleChild);
                    }
                }
//                HorizontalModel horizontalModel = new HorizontalModel();
//                childList.add(new TitleChild(helloTitleList[0], arrayListHorizontal1));
                titleParent.setChildObjectList(childList);
                parentObjects.add(titleParent);
            }

        }
        return parentObjects;
    }


}
