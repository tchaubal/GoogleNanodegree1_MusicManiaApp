package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by TanushreeChaubal on 2/10/18.
 */

public class Artist2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist2);

        Button viewArtistAlbumList = findViewById(R.id.browseArtistsAlbums_Button2);
        viewArtistAlbumList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewArtistAlbumList = new Intent(Artist2Activity.this, ArtistsAlbumsActivity.class);
                startActivity(viewArtistAlbumList);
            }
        });
    }
}
