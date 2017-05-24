package com.codeclan.example.lovedtracklistapp;

/**
 * Created by user on 24/05/2017.
 */

public class Track {

    private Integer rank;
    private String artist;
    private String title;

    public Track(Integer rank, String artist, String title) {
        this.rank = rank;
        this.artist = artist;
        this.title = title;
    }

    public Integer getRank() {
        return this.rank;
    }


    public String getArtist() {
        return this.artist;
    }


    public String getTitle() {
        return this.title;
    }
}
