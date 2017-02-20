package com.qqdemo.administrator.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yls on 2017/2/20.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Dog> dogList;

    public MyAdapter(List<Dog> dogList) {
        this.dogList = dogList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dog dog = dogList.get(position);
        holder.dogImg.setImageResource(dog.imgId);
        holder.dogName.setText(dog.name);
    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView dogImg;
        TextView dogName;

        public ViewHolder(View itemView) {
            super(itemView);
            dogImg = (ImageView) itemView.findViewById(R.id.dogImg);
            dogName = (TextView) itemView.findViewById(R.id.dogName);
        }
    }


}
