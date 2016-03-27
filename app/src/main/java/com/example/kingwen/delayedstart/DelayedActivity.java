package com.example.kingwen.delayedstart;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kingwen on 2016/3/26.
 */
public class DelayedActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delaystart_layout);

        tv= (TextView) findViewById(R.id.tv_delay_activity);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(DelayedActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        }, 1500);


    }
}
