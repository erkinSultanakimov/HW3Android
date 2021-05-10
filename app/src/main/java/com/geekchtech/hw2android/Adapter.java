package com.geekchtech.hw2android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    private  ArrayList<Data> recycle;

    public Adapter(ArrayList<Data> recycle) {
        this.recycle = recycle;
    }



    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
       return  new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
     String number = recycle.get(position).getNumber();
     holder.number.setText(number);
     String title = recycle.get(position).getTitle();
     holder.title.setText(title);
     String smallTitle = recycle.get(position).getSmallTitle();
        holder.smallTitle.setText(smallTitle);
     String date = recycle.get(position).getDate();
        holder.date.setText(date);
    }

    @Override
    public int getItemCount() {
        return recycle.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private  TextView number;
        private  TextView title;
        private  TextView smallTitle;
        private  TextView date;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number);
            title = itemView.findViewById(R.id.main_word);
            smallTitle = itemView.findViewById(R.id.smallText);
            date = itemView.findViewById(R.id.date);
        }
    }
}
