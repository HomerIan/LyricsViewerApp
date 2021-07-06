package com.homerianreyes.lyricsviewerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private SongListAdapter mAdapter;
    private  final String[] mSongList = new String[]{"Harana", "Pare Ko", "Gitara", "Maniwala Ka Sana", "Barkada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerviewer);
        mAdapter = new SongListAdapter(mSongList, this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}