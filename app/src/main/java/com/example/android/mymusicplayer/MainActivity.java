package com.example.android.mymusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.mymusicplayer.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the AlbumOneActivity category, set image and texts
        ImageView albumOne = (ImageView) findViewById(R.id.album1_icon);
        albumOne.setImageResource(R.drawable.cave);
        TextView artist1 = (TextView) findViewById(R.id.artist1_name);
        artist1.setText("Nick Cave");
        TextView album1 = (TextView) findViewById(R.id.album1_name);
        album1.setText("Push the sky away");


        albumOne.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album1Intent = new Intent(MainActivity.this, AlbumOneActivity.class);
                startActivity(album1Intent);
            }
        });

        final ImageView albumTwo = (ImageView) findViewById(R.id.album2_icon);
        albumTwo.setImageResource(R.drawable.clash);
        TextView artist2 = (TextView) findViewById(R.id.artist2_name);
        artist2.setText("The Clash");
        TextView album2 = (TextView) findViewById(R.id.album2_name);
        album2.setText("Sandinista!");

        albumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album2Intent = new Intent(MainActivity.this, AlbumTwoActivity.class);
                startActivity(album2Intent);
            }
        });

        final ImageView albumThree = (ImageView) findViewById(R.id.album3_icon);
        albumThree.setImageResource(R.drawable.growlers);
        TextView artist3 = (TextView) findViewById(R.id.artist3_name);
        artist3.setText("The Growlers");
        TextView album3 = (TextView) findViewById(R.id.album3_name);
        album3.setText("City Club");

        albumThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album3Intent = new Intent(MainActivity.this, AlbumThreeActivity.class);
                startActivity(album3Intent);
            }
        });

        final ImageView albumFour = (ImageView) findViewById(R.id.album4_icon);
        albumFour.setImageResource(R.drawable.beatles);
        TextView artist4 = (TextView) findViewById(R.id.artist4_name);
        artist4.setText("The Beatles");
        TextView album4 = (TextView) findViewById(R.id.album4_name);
        album4.setText("White Album");

        albumFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album4Intent = new Intent(MainActivity.this, AlbumFourActivity.class);
                startActivity(album4Intent);
            }
        });
    }
}
