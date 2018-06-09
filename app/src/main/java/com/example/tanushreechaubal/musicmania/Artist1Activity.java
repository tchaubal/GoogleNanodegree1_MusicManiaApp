package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TanushreeChaubal on 2/10/18.
 */

public class Artist1Activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist1);

        Button viewArtistAlbumList = findViewById(R.id.browseArtistsAlbums_Button);
        viewArtistAlbumList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewArtistAlbumList = new Intent(Artist1Activity.this, ArtistsAlbumsActivity.class);
                startActivity(viewArtistAlbumList);
            }
        });
    }
}
