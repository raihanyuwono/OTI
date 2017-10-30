package com.tugas.raihan.listtutorial;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by raihanyuwono on 10/30/17.
 */

public class AdapterHewan extends ArrayAdapter {
    String[] namaHewan;
    String[] descHewan;
    Integer[] gambarHewan;
    Context context;


    public AdapterHewan(String[] namaHewan, String[] descHewan, Integer[] gambarHewan, Context context) {
        super(context, R.layout.item_list, namaHewan);
        this.namaHewan = namaHewan;
        this.descHewan = descHewan;
        this.gambarHewan = gambarHewan;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, null, false);
        ImageView imageViewHewan = (ImageView) rootView.findViewById(R.id.imageHewan);
        TextView namaHewan = (TextView) rootView.findViewById(R.id.namaHewan);
        TextView descHewan = (TextView) rootView.findViewById(R.id.descHewan);

        imageViewHewan.setImageResource(gambarHewan[position]);
        namaHewan.setText(this.namaHewan[position]);
        descHewan.setText(this.descHewan[position]);

        return rootView;
    }
}