package com.codeclan.example.lovedtracklistapp;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * Created by user on 24/05/2017.
 */

public class TrackList {

    private ArrayList<Track> list;

    public TrackList() {
        this.list = new ArrayList<Track>();
        this.list.add(new Track(1, "Boards of Canada", "Everything You Do Is A Balloon"));
        this.list.add(new Track(2, "Super Minerals", "Photic"));
        this.list.add(new Track(3, "Phosphorescent", "A Picture Of Our Torn Up Praise"));
        this.list.add(new Track(4, "Have A Nice Life", "The Big Gloom"));
        this.list.add(new Track(5, "Yeasayer", "2080"));
        this.list.add(new Track(6, "Christine Owman", "Wait, No"));
        this.list.add(new Track(7, "Melvins", "A History Of Bad Men"));
        this.list.add(new Track(8, "Nicolas Jaar", "Space Is Only Noise If You Can See"));
        this.list.add(new Track(9, "Matt Elliott", "Bomb The Stock Exchange"));
        this.list.add(new Track(10, "The Great Northwest", "Chief John"));

    }

    public ArrayList<Track> getList() {
        return this.list;
    }
}
