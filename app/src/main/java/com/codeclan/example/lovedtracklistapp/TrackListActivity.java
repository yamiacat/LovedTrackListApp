package com.codeclan.example.lovedtracklistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TrackListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TrackList trackList = new TrackList();
        ArrayList<Track> list = trackList.getList();

        TrackListAdapter trackListAdapter = new TrackListAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(trackListAdapter);
    }


    public void getTrack(View listItem) {
        Track track = (Track) listItem.getTag();
        Log.d("Track Title:", track.getTitle());
    }


}
