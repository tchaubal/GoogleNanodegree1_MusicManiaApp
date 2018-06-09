package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TanushreeChaubal on 2/10/18.
 */

public class ArtistsAlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists_albums);

        ListView listOfArtistsAlbums = findViewById(R.id.artistAlbums_listView);
        String[] artistsAlbumsArray = getResources().getStringArray(R.array.listOfArtistsAndAlbums);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artistsAlbumsArray);
        listOfArtistsAlbums.setAdapter(arrayAdapter);

        listOfArtistsAlbums.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent artist1Intent = new Intent(view.getContext(), Artist1Activity.class);
                    startActivityForResult(artist1Intent, 0);
                }
                if(position == 1){
                    Intent artist2Intent = new Intent(view.getContext(), Artist2Activity.class);
                    startActivityForResult(artist2Intent, 1);
                }
                if(position == 2){
                    Intent artist3Intent = new Intent(view.getContext(), Artist3Activity.class);
                    startActivityForResult(artist3Intent, 1);
                }
            }
        });

        Button viewMainMenu = findViewById(R.id.viewMainScreen_Button);
        viewMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMainScreenIntent = new Intent(ArtistsAlbumsActivity.this, MainActivity.class);
                startActivity(viewMainScreenIntent);
            }
        });
    }
}
