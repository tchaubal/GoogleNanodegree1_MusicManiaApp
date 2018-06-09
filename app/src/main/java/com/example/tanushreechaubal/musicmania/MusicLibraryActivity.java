package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TanushreeChaubal on 2/10/18.
 */

public class MusicLibraryActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        ListView listOfSongs = findViewById(R.id.musicLibrary_listView);
        String[] songsArray = getResources().getStringArray(R.array.listOfSongs);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray);
        listOfSongs.setAdapter(arrayAdapter);

        listOfSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] toastMessages = getResources().getStringArray(R.array.toastMessageForSongNumberPlaying);

                if(position == 0){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[0], Toast.LENGTH_SHORT).show();
                }
                if(position == 1){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[1], Toast.LENGTH_SHORT).show();
                }
                if(position == 2){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[2], Toast.LENGTH_SHORT).show();
                }
                if(position == 3){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[3], Toast.LENGTH_SHORT).show();
                }
                if(position == 4){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[4], Toast.LENGTH_SHORT).show();
                }
                if(position == 5){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[5], Toast.LENGTH_SHORT).show();
                }
                if(position == 6){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[6], Toast.LENGTH_SHORT).show();
                }
                if(position == 7){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[7], Toast.LENGTH_SHORT).show();
                }
                if(position == 8){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[8], Toast.LENGTH_SHORT).show();
                }
                if(position == 9){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[9], Toast.LENGTH_SHORT).show();
                }
                if(position == 10){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[10], Toast.LENGTH_SHORT).show();
                }
                if(position == 11){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[11], Toast.LENGTH_SHORT).show();
                }
                if(position == 12){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[12], Toast.LENGTH_SHORT).show();
                }
                if(position == 13){
                    Toast.makeText(MusicLibraryActivity.this, toastMessages[13], Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button viewMainMenu = findViewById(R.id.viewMainScreen_Button2);
        viewMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMainScreenIntent = new Intent(MusicLibraryActivity.this, ArtistsAlbumsActivity.class);
                startActivity(viewMainScreenIntent);
            }
        });
    }
}
