package com.example.relaxingmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //url musik yang ada pada firebase
        String url1="https://firebasestorage.googleapis.com/v0/b/relaxing-music-77db9.appspot.com/o/cold.mp3?alt=media&token=cf9752f6-013b-49e5-a537-b34c3eeee12c";
        String url2="https://firebasestorage.googleapis.com/v0/b/relaxing-music-77db9.appspot.com/o/moon.mp3?alt=media&token=7e3415a2-83c3-44f5-9c0d-cb875ead7224";

        //menhubungkan variabel JcPlayerView dengan komponen JcPlayerView Pada Layout
        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);

        //menambahkan item ke array
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("cold",url1));
        jcAudios.add(JcAudio.createFromURL("moon",url2));


        jcPlayerView.initPlaylist(jcAudios, null);
        jcPlayerView.createNotification();//membuat notifikasi pada aplikasi

    }
}