package com.codeclan.example.lovedtracklistapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class TrackListTest {


    @Test
    public void getListTest() {
        TrackList trackList = new TrackList();
        assertEquals(10, trackList.getList().size());
    }

}