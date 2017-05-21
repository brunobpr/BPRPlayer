package app.getitright.com.example.android.bprplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Now_Playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now__playing);

        TextView openTracks = (TextView) findViewById(R.id.tracks_button);
        openTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksActivity = new Intent(Now_Playing.this, Tracks.class);
                startActivity(tracksActivity);
            }
        });

        TextView openPlaylist = (TextView) findViewById(R.id.playlist_button);
        openPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistActivity = new Intent(Now_Playing.this, MainActivity.class);
                startActivity(playlistActivity);
            }
        });

        TextView openArtists = (TextView) findViewById(R.id.artists_button);
        openArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsActivity = new Intent(Now_Playing.this, Artists.class);
                startActivity(artistsActivity);
            }
        });
    }
}
