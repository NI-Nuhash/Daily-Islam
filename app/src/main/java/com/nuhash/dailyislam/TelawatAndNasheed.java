package com.nuhash.dailyislam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TelawatAndNasheed extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telawat_and_nasheed);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        videoView=findViewById(R.id.tilawatVideo);

        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sura_al_fazr);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}