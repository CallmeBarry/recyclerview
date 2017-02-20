package com.qqdemo.administrator.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Dog> dogList = new ArrayList<Dog>();
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initViews();
    }

    private void initDogList() {
        dogList.add(new Dog("老狗", R.drawable.dog1));
        dogList.add(new Dog("小狗", R.drawable.dog2));
        dogList.add(new Dog("丑狗", R.drawable.dog3));
        dogList.add(new Dog("母狗", R.drawable.dog4));
        dogList.add(new Dog("银狐", R.drawable.dog5));
        dogList.add(new Dog("奶狗", R.drawable.dog6));
        dogList.add(new Dog("dog", R.drawable.dog7));
        dogList.add(new Dog("dog", R.drawable.dog8));
        dogList.add(new Dog("dog", R.drawable.dog9));
        dogList.add(new Dog("dog", R.drawable.dog10));
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mAdapter = new MyAdapter(dogList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
