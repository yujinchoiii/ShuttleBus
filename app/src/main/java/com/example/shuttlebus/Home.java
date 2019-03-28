package com.example.shuttlebus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void location(View view) {
    }

    public void showBusRoute(View view) {
    }
    public void dialCreate(String phoneNumber){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));

        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
    public void dialDriver(View view) {
        dialCreate("0000000000");
    }

    public void dialOffice(View view) {
        dialCreate("0000000000");
    }
}
