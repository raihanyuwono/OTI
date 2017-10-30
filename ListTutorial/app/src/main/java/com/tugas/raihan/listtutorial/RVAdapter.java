package com.tugas.raihan.listtutorial;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by raihanyuwono on 10/30/17.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {
    List<ModelHewan> modelHewanList;

    public RVAdapter(List<ModelHewan> modelHewanList) {
        this.modelHewanList = modelHewanList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarHewan;
        TextView descHewan;
        TextView namaHewan;

        public MyViewHolder(View itemView) {
            super(itemView);
            gambarHewan = itemView.findViewById(R.id.imageHewan);
            namaHewan = itemView.findViewById(R.id.namaHewan);
            descHewan = itemView.findViewById(R.id.descHewan);
        }
    }

    @Override
    public RVAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        RVAdapter.MyViewHolder viewHolder = new RVAdapter.MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RVAdapter.MyViewHolder holder, int position) {
        holder.gambarHewan.setImageResource(modelHewanList.get(position).gambarHewan);
        holder.namaHewan.setText(modelHewanList.get(position).namaHewan);
        holder.descHewan.setText(modelHewanList.get(position).descHewan);

    }

    @Override
    public int getItemCount() {
        return modelHewanList.size();
    }
}
