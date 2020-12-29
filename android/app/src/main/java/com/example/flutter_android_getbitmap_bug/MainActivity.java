package com.example.flutter_android_getbitmap_bug;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Handler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity
        extends FlutterActivity {
    Handler mHandler = new Handler();

    @Override
    public void onPostResume() {
        super.onPostResume();

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                FlutterEngine engine = getFlutterEngine();

                if (engine != null) {
                    try {
                        Bitmap bitmap = engine.getRenderer().getBitmap();
                        if (bitmap != null) {
                            FileOutputStream fos = new FileOutputStream("/sdcard/demo.png");
                            bitmap.compress(CompressFormat.PNG, 100, fos);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, 1000);
    }
}
