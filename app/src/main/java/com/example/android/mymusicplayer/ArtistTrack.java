package com.example.android.mymusicplayer;

import android.media.MediaPlayer;

/**
 * Created by johan on 19.03.2018.
 */
public class ArtistTrack {


    private String mTrack;


    private String mArtist;

    /**
     * Create a new ArtistTrack object.
     *
     * @param artist is the Artist which was chosen
     * @param track  is the track
     */
    public ArtistTrack(String artist, String track) {
        mArtist = artist;
        mTrack = track;

    }


    public String getArtist() {
        return mArtist;
    }


    public String getTrack() {
        return mTrack;
    }

}