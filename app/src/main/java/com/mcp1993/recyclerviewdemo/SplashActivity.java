package com.mcp1993.recyclerviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mcp1993.recyclerviewdemo.Main.MainActivity;
import com.mcp1993.recyclerviewdemo.Main.Main2Activity;
import com.mcp1993.recyclerviewdemo.Main.Main3Activity;
import com.mcp1993.recyclerviewdemo.good.GoodListActivity;


/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class SplashActivity extends AppCompatActivity {
    private Button btn_1,btn_2,btn_3;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        btn_1= (Button) findViewById(R.id.btn_1);
        btn_2= (Button) findViewById(R.id.btn_2);
        btn_3= (Button) findViewById(R.id.btn_3);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(SplashActivity.this, GoodListActivity.class);
                startActivity(intent);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(SplashActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(SplashActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
