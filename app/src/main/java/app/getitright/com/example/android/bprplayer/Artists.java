package app.getitright.com.example.android.bprplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView openPlaylist = (TextView) findViewById(R.id.playlist_button);
        openPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistActivity = new Intent(Artists.this, MainActivity.class);
                startActivity(playlistActivity);
            }
        });

        TextView openTracks = (TextView) findViewById(R.id.tracks_button);
        openTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksActivity = new Intent(Artists.this, Tracks.class);
                startActivity(tracksActivity);
            }
        });

        TextView openNowPlaying = (TextView) findViewById(R.id.now_playing_button);
        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingActivity = new Intent(Artists.this, Now_Playing.class);
                startActivity(nowPlayingActivity);
            }
        });
    }
}
