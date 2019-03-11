package com.example.bookmark;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bookmark.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PlaceViewHolder> {

    Context mContext;
    private List<Recycle> listTeks;

    public MyAdapter(Context mContext, List<Recycle> listTeks) {
        this.mContext = mContext;
        this.listTeks = listTeks;
    }

    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,
                parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder( final PlaceViewHolder holder, int position) {
        Recycle item = listTeks.get(position);
        holder.mPlace.setImageResource(item.getIcon());
        holder.teks_picture1.setText(item.getJudulBesar());
        holder.teks_picture2.setText(listTeks.get(position).getJumlahAyat());
        holder.teks_picture3.setText(listTeks.get(position).getWaktuPutar());
    }

    @Override
    public int getItemCount() {
        return listTeks.size();
    }

    class PlaceViewHolder extends RecyclerView.ViewHolder {

        ImageView mPlace;
        TextView teks_picture1;
        TextView teks_picture2;
        TextView teks_picture3;

        public PlaceViewHolder(View itemView) {
            super(itemView);

            mPlace = itemView.findViewById(R.id.imageviewnya);
            teks_picture1 = (TextView)itemView.findViewById(R.id.judul1);
            teks_picture2 = (TextView)itemView.findViewById(R.id.judul2);
            teks_picture3 = (TextView)itemView.findViewById(R.id.judul3);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int i = getAdapterPosition();
                    Recycle item = listTeks.get(i);
                    Toast.makeText(mContext,"Gambar dipilih "+ item.getJudulBesar(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }

}




