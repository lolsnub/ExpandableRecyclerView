package database.c347.soi.rp.edu.sg.expandablerecyclerview;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import database.c347.soi.rp.edu.sg.expandablerecyclerview.Adapter.MoreRecyclerViewAdapter;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.BandMember;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.BandMemberImage;
import database.c347.soi.rp.edu.sg.expandablerecyclerview.Model.Book;

public class MoreActivity extends AppCompatActivity {

    List<Book> bookList;
    RecyclerView rvBookList;
    CoordinatorLayout clLayout;

    ArrayList<BandMemberImage> yukinaImage = new ArrayList<>();
    ArrayList<BandMemberImage> sayoImage = new ArrayList<>();
    ArrayList<BandMemberImage> lisaImage = new ArrayList<>();
    ArrayList<BandMemberImage> akoImage = new ArrayList<>();
    ArrayList<BandMemberImage> rinkoImage = new ArrayList<>();
    ArrayList<BandMemberImage> kasumiImage = new ArrayList<>();
    ArrayList<BandMemberImage> ayaImage = new ArrayList<>();
    ArrayList<BandMemberImage> ranImage = new ArrayList<>();
    ArrayList<BandMemberImage> kokoroImage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_more);
        setTitle(getIntent().getStringExtra("title"));

        rvBookList = (RecyclerView) findViewById(R.id.rvBookList);
        clLayout = (CoordinatorLayout) findViewById(R.id.clLayout);

        bookList = new ArrayList<>();

        BandMemberImage bmi = new BandMemberImage();
        bmi.getYukinaRarity(4,yukinaImage);
        bmi.getSayoRarity(4, sayoImage);
        bmi.getLisaRarity(4,lisaImage);
        bmi.getAkoRarity(4, akoImage);
        bmi.getRinkoRarity(4, rinkoImage);
        bmi.getKasumiRarity(4, kasumiImage);
        bmi.getAyaRarity(4, ayaImage);
        bmi.getRanRarity(4, ranImage);
        bmi.getKokoroRarity(4, kokoroImage);

//        int[] yukinaImage = {R.drawable.y_image_01, R.drawable.y_image_02, R.drawable.y_image_03, R.drawable.y_image_04,R.drawable.y_image_05,
//                R.drawable.y_image_06, R.drawable.y_image_07, R.drawable.y_image_08, R.drawable.y_image_09, R.drawable.y_image_10, R.drawable.y_image_11,
//                R.drawable.y_image_12, R.drawable.y_image_13, R.drawable.y_image_14 };
//        int[] rinkoImage = {R.drawable.rk_image_01, R.drawable.rk_image_02, R.drawable.rk_image_03, R.drawable.rk_image_04, R.drawable.rk_image_05,
//                R.drawable.rk_image_06, R.drawable.rk_image_07, R.drawable.rk_image_08, R.drawable.rk_image_09, R.drawable.rk_image_10};
//        int[] sayoImage = {R.drawable.sayo_image_01, R.drawable.sayo_image_02, R.drawable.sayo_image_03, R.drawable.sayo_image_04, R.drawable.sayo_image_05,
//                R.drawable.sayo_image_06, R.drawable.sayo_image_07, R.drawable.sayo_image_08, R.drawable.sayo_image_09, R.drawable.sayo_image_10};
//        int[] akoImage = {R.drawable.ako_image_01, R.drawable.ako_image_02, R.drawable.ako_image_03, R.drawable.ako_image_04, R.drawable.ako_image_05,
//                R.drawable.ako_image_06, R.drawable.ako_image_07, R.drawable.ako_image_08, R.drawable.ako_image_09, R.drawable.ako_image_10};
//        int[] lisaImage = {R.drawable.lisa_image_01, R.drawable.lisa_image_02, R.drawable.lisa_image_03, R.drawable.lisa_image_04, R.drawable.lisa_image_05,
//                R.drawable.lisa_image_06, R.drawable.lisa_image_07, R.drawable.lisa_image_08, R.drawable.lisa_image_09, R.drawable.lisa_image_10,
//                R.drawable.lisa_image_11, R.drawable.lisa_image_12};
//
//        int[] kasumiImage = {R.drawable.kasumi_4_image_01, R.drawable.kasumi_4_image_02, R.drawable.kasumi_4_image_03, R.drawable.kasumi_4_image_04, R.drawable.kasumi_4_image_05};
//        int[] ayaImage = {R.drawable.aya_4_image_06, R.drawable.aya_4_image_07, R.drawable.aya_4_image_08, R.drawable.aya_4_image_09, R.drawable.aya_4_image_10};
//        int[] ranImage = {R.drawable.ran_4_image_01,R.drawable.ran_4_image_02,R.drawable.ran_4_image_03,R.drawable.ran_4_image_04,R.drawable.ran_4_image_05};
//        int[] kokoroImage = {R.drawable.kokoro_4_image_01,R.drawable.kokoro_4_image_02,R.drawable.kokoro_4_image_03,R.drawable.kokoro_4_image_04,R.drawable.kokoro_4_image_05};

        init("Yukina", yukinaImage);
        init("Rinko", rinkoImage);
        init("Ako", akoImage);
        init("Lisa", lisaImage);
        init("Sayo", sayoImage);
        init("Kasumi", kasumiImage);
        init("Aya", ayaImage);
        init("Ran", ranImage);
        init("Kokoro", kokoroImage);


        rvBookList.setHasFixedSize(true);
        rvBookList.setLayoutManager(new GridLayoutManager(this, 3));
        MoreRecyclerViewAdapter myAdapter = new MoreRecyclerViewAdapter(this, bookList);
        rvBookList.setAdapter(myAdapter);
    }

    public void init(String title, ArrayList<BandMemberImage> bmImage) {
        int count = 1;
        if (getIntent().getStringExtra("title").equals(title)) {
            for (int i = 0; i < bmImage.size(); i++) {
//                if (count < 10) {
//                    bookList.add(new Book(title +" 0" + count, "Caregorie", "Description Book", imgArray[i]));
//                } else {
//                    bookList.add(new Book(title + " " + count, "Caregorie", "Description Book", imgArray[i]));
//                }
//                count++;
                bookList.add(new Book(bmImage.get(i).getImgTItle(), "Caregorie", "Description Book", bmImage.get(i).getImgURL()));
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
