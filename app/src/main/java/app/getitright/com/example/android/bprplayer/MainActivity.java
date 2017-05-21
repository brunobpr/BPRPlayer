package app.getitright.com.example.android.bprplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView openTracks = (TextView) findViewById(R.id.tracks_button);
        openTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksActivity = new Intent(MainActivity.this, Tracks.class);
                startActivity(tracksActivity);
            }
        });

        TextView openArtists = (TextView) findViewById(R.id.artists_button);
        openArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsActivity = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsActivity);
            }
        });

        TextView openNowPlaying = (TextView) findViewById(R.id.now_playing_button);
        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingActivity = new Intent(MainActivity.this, Now_Playing.class);
                startActivity(nowPlayingActivity);
            }
        });



    }
}
