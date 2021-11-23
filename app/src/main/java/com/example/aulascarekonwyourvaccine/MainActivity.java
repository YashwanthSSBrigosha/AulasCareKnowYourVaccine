package com.example.aulascarekonwyourvaccine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Vaccine> cardInfo;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager cardLayoutManager;
    RecyclerView.Adapter cardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCard();
        buildRecyclerView();
    }

    public void createCard(){
        cardInfo = new ArrayList<>();

        cardInfo.add(new Vaccine("Covishield","Serum Institute of India",R.drawable.seruminstitute));
        cardInfo.add(new Vaccine("Covaxin","Bharat Biotech",R.drawable.covaxin));
        cardInfo.add(new Vaccine("Sputnik V","Gamaleya",R.drawable.sputnik));
        cardInfo.add(new Vaccine("mRNA-1273","Moderna",R.drawable.moderna));
        cardInfo.add(new Vaccine("ZyCoV-D","Zydus Cadila",R.drawable.zycovid));
        cardInfo.add(new Vaccine("Ad26.COV2.S","Johnson & Johnson’s Janssen",R.drawable.janssen));
        cardInfo.add(new Vaccine("AZD1222","Oxford/AstraZeneca",R.drawable.astrazeneca));
    }

    public void buildRecyclerView(){

        recyclerView = findViewById(R.id.cardRecyclerView);
        recyclerView.setHasFixedSize(true);
        cardLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(cardLayoutManager);
        cardAdapter = new CardAdapter(cardInfo);
        recyclerView.setAdapter(cardAdapter);

    }
}