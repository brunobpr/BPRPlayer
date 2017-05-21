package app.getitright.com.example.android.bprplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Tracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        TextView openNowPlaying = (TextView) findViewById(R.id.now_playing_button);
        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingActivity = new Intent(Tracks.this, Now_Playing.class);
                startActivity(nowPlayingActivity);
            }
        });

        TextView openArtists = (TextView) findViewById(R.id.artists_button);
        openArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsActivity = new Intent(Tracks.this, Artists.class);
                startActivity(artistsActivity);
            }
        });

        TextView openPlaylist = (TextView) findViewById(R.id.playlist_button);
        openPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistActivity = new Intent(Tracks.this, MainActivity.class);
                startActivity(playlistActivity);
            }
        });
    }
}
