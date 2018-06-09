package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TanushreeChaubal on 2/10/18.
 */

public class SearchSongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_songs);

        Button viewMainMenu = findViewById(R.id.viewMainScreen_Button3);
        viewMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMainScreenIntent = new Intent(SearchSongsActivity.this, MainActivity.class);
                startActivity(viewMainScreenIntent);
            }
        });

        Button viewMusicLibrary = findViewById(R.id.viewMusicLibrary_Button);
        viewMusicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMusicLibraryIntent = new Intent(SearchSongsActivity.this, MusicLibraryActivity.class);
                startActivity(viewMusicLibraryIntent);
            }
        });
    }
}
