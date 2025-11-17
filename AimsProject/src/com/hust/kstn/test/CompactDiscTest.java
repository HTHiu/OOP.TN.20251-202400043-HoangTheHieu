package com.hust.kstn.test;

import com.hust.kstn.models.Track;
import com.hust.kstn.models.CompactDisc;

public class CompactDiscTest {
    public static void main(String[] args) {
        String[] artists = {"Hoang The Hieu", "Bui Cong Hao"};
        String[] directors = {"Nguyen Hong Dat"};

        Track track1 = new Track("hello", 167);
        Track track2 = new Track("hallo", 168);
        Track track3 = new Track("holla", 170);
        Track track4 = new Track("hilllo", 190);

        Track[] tracks = {track1, track2};
        CompactDisc cd = new CompactDisc("hellloooee", "US", 16, artists, directors, tracks);
        System.out.println(cd);

        cd.addTrack(track3);
        System.out.println(cd);

        cd.removeTrack(track4);
        cd.removeTrack(track1);
        System.out.println(cd);

        cd.removeTrack(track2);
        cd.removeTrack(track3);
        System.out.println(cd);
    }
}