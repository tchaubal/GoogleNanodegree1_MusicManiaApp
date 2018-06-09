package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Artist3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist3);

        Button viewArtistAlbumList = findViewById(R.id.browseArtistsAlbums_Button3);
        viewArtistAlbumList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewArtistAlbumList = new Intent(Artist3Activity.this, ArtistsAlbumsActivity.class);
                startActivity(viewArtistAlbumList);
            }
        });
    }

}
