package com.codekopi.mypermission;

import android.Manifest;
import android.Manifest.permission;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.imgCamera)
  ImageView imgCamera;
  private static final int PERMISSION_CALLBACK_CONSTANT = 100;
  private static final int REQUEST_PERMISSION_SETTING = 101;
  private boolean sentToSettings = false;

  private String [] permission = new String[]{Manifest.permission.CAMERA,Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    requestPermissionsApp();
  }

  private void requestPermissionsApp() {
    if (ActivityCompat.checkSelfPermission(this,permission[0])!=PackageManager.PERMISSION_GRANTED
        || ActivityCompat.checkSelfPermission(this,permission[1])!=PackageManager.PERMISSION_GRANTED
          || ActivityCompat.checkSelfPermission(this,permission[2])!=PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,permission[0])
                || ActivityCompat.shouldShowRequestPermissionRationale(this,permission[1])
                  || ActivityCompat.shouldShowRequestPermissionRationale(this,permission[2])){
            }else {

            }
    }else {

    }
  }

  @OnClick(R.id.btnCamera)
  public void onViewClicked() {

  }
}
