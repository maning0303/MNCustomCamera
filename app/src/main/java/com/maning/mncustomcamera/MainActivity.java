package com.maning.mncustomcamera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.maning.cameralibrary.constant.Constants;
import com.maning.cameralibrary.utils.BitmapUtils;
import com.maning.cameralibrary.utils.CameraUtil;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private String img_path;

    private ImageView iv_show_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        iv_show_result = (ImageView) findViewById(R.id.iv_show_result);

    }

    public void btn01(View view) {
        CameraUtil.getInstance().startCamera(this, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data == null){
            return;
        }
        if (requestCode == 100) {
            img_path = data.getStringExtra(Constants.IntentKeyFilePath);
            updateImageView();
        }
    }

    private void updateImageView() {
        Bitmap bitemapFromFile = BitmapUtils.getBitemapFromFile(new File(img_path));
        iv_show_result.setImageBitmap(bitemapFromFile);
    }
}
