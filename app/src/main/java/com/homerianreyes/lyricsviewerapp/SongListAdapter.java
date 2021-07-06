package com.homerianreyes.lyricsviewerapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

public class SongListAdapter extends RecyclerView.Adapter<SongListAdapter.SongViewHolder>{

    private final String[] mSongList;
    private LayoutInflater mInflater;

    public SongListAdapter(String[] mSongList, Context context) {
        this.mSongList = mSongList;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public SongListAdapter.SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.lyricslist_view, parent, false);
        return new SongViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(SongListAdapter.SongViewHolder holder, int position) {
        String mCurrent = mSongList[position];
        holder.songItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mSongList.length;
    }

    class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView songItemView;
        final SongListAdapter mAdapter;

        public SongViewHolder(View itemView, SongListAdapter mAdapter) {
            super(itemView);
            songItemView = itemView.findViewById(R.id.song_title_textview);
            this.mAdapter = mAdapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            //get position was clicked
            int mPosition = getLayoutPosition();
            switch (mPosition) {
                case 0:
                    getIntent(view, song_activity_1.class);
                    break;
                case 1:
                    getIntent(view, song_activity_2.class);
                    break;
                case 2:
                    getIntent(view, song_activity_3.class);
                    break;
                case 3:
                    getIntent(view, song_activity_4.class);
                    break;
                case 4:
                    getIntent(view, song_activity_5.class);
                    break;
                default:
                    break;
            }
        }

        public void getIntent(View view, Class song_activity) {
            Intent intent = new Intent(view.getContext(), song_activity);
            view.getContext().startActivity(intent);
        }
    }
}
