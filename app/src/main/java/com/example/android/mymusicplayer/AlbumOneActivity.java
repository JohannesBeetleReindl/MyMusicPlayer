package com.example.android.mymusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by johan on 19.03.2018.
 */

public class AlbumOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artisttrack_list);
        // Create a list of words
        ArrayList<ArtistTrack> words = new ArrayList<ArtistTrack>();
        words.add(new ArtistTrack("Nick Cave", "We No Who U R"));
        words.add(new ArtistTrack("Nick Cave", "Wide Lovely Eyes"));
        words.add(new ArtistTrack("Nick Cave", "Water´s Edge"));
        words.add(new ArtistTrack("Nick Cave", "Jubilee Street"));
        words.add(new ArtistTrack("Nick Cave", "Mermaids"));
        words.add(new ArtistTrack("Nick Cave", "We Real Cool"));
        words.add(new ArtistTrack("Nick Cave", "Finishing Jubilee Street"));
        words.add(new ArtistTrack("Nick Cave", "Higgs Boson Blues"));
        words.add(new ArtistTrack("Nick Cave", "Push the Sky Away"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ArtistTrackAdapter adapter = new ArtistTrackAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // words_list.xmlt file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}