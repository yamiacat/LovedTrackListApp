package com.codeclan.example.lovedtracklistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TrackListAdapter extends ArrayAdapter<Track> {

    public TrackListAdapter(Context context, ArrayList<Track> tracks) {
        super(context, 0, tracks);
    }


    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.track_item, parent, false);
        }

        Track currentTrack = getItem(position);

        TextView rank = (TextView) listItemView.findViewById(R.id.rank);
        rank.setText(currentTrack.getRank().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentTrack.getTitle());

        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentTrack.getArtist().toString());

        listItemView.setTag(currentTrack);

        return listItemView;
    }




}
