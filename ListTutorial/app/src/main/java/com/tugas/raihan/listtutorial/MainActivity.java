package com.tugas.raihan.listtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] arrayNama = {"Dove", "Hamster", "Sheep", "Swan"};
    String[] arrayDesc = {"Terbang", "Lucu", "Wedus", "Angsa"};
    Integer[] gambarHewan = {R.drawable.ic_dove, R.drawable.ic_hamster, R.drawable.ic_sheep, R.drawable.ic_swan};

    RecyclerView recyclerView;


    List<ModelHewan> hewan;

    void initData() {
        hewan = new ArrayList<>();
        hewan.add(new ModelHewan("Dove", "Terbang", R.drawable.ic_dove));
        hewan.add(new ModelHewan("Hamster", "Terbang", R.drawable.ic_hamster));
        hewan.add(new ModelHewan("Swan", "Terbang", R.drawable.ic_swan));
        hewan.add(new ModelHewan("Sheep", "Terbang", R.drawable.ic_sheep));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listView);
        initData();

        AdapterHewan adapterHewan = new AdapterHewan(arrayNama, arrayDesc, gambarHewan, this);
        RVAdapter adapter = new RVAdapter(hewan);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

    }
}
