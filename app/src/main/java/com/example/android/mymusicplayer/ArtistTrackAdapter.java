package com.example.android.mymusicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by johan on 19.03.2018.
 */

public class ArtistTrackAdapter extends ArrayAdapter<ArtistTrack> {


    public ArtistTrackAdapter(Activity context, ArrayList<ArtistTrack> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artisttrack_list, parent, false);
        }
        // Get the {@link ArtistTrack} object located at this position in the list
        ArtistTrack currenArtistTrack = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID artist_text_view
        TextView nameArtist = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist from the current ArtistTrack object and
        // set this text on the name Artist
        nameArtist.setText(currenArtistTrack.getArtist());


        // Find the TextView in the list_item.xml layout with the ID track_text_view
        TextView nameTrack = (TextView) listItemView.findViewById(R.id.track_text_view);
        // Get the Default translation from the current Word object and
        // set this text on the name Track
        nameTrack.setText(currenArtistTrack.getTrack());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;


    }
}


