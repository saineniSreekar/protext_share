package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by lenovo on 7/30/2017.
 */

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void launchScanner(View view) {
        Intent intent = new Intent(this, OcrCaptureActivity.class);
        startActivity(intent);
    }

  /*  public void encryptAndDecrypt{
        Intent intent = new Intent(this, OcrCaptureActivity.class);
        startActivity(intent);
    }*/

}
