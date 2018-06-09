package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView library = findViewById(R.id.textView_musicLibrary);
        library.setOnClickListener(this);

        TextView artists_albums = findViewById(R.id.textView_artistsAlbums);
        artists_albums.setOnClickListener(this);

        TextView search = findViewById(R.id.textView_searchSongs);
        search.setOnClickListener(this);

        TextView store = findViewById(R.id.textView_store);
        store.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.textView_musicLibrary: Intent musicLibraryIntent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(musicLibraryIntent);
                break;

            case R.id.textView_artistsAlbums: Intent artistsAlbumsIntent = new Intent(MainActivity.this, ArtistsAlbumsActivity.class);
                startActivity(artistsAlbumsIntent);
                break;

            case R.id.textView_searchSongs: Intent searchIntent = new Intent(MainActivity.this, SearchSongsActivity.class);
                startActivity(searchIntent);
                break;

            case R.id.textView_store: Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(storeIntent);
                break;
        }
    }
}
