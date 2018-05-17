package com.wanghang.mypractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button top = findViewById(R.id.top);
        Button task = findViewById(R.id.task);
        Button instance = findViewById(R.id.instance);
        top.setOnClickListener(this);
        task.setOnClickListener(this);
        instance.setOnClickListener(this);

        Button top2 = findViewById(R.id.top2);
        Button task2 = findViewById(R.id.task2);
        Button instance2 = findViewById(R.id.instance2);
        top2.setOnClickListener(this);
        task2.setOnClickListener(this);
        instance2.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top:
                startActivity(SingleTop.class);
                break;
            case R.id.task:
                startActivity(SingleTask.class);
                break;
            case R.id.instance:
                startActivity(SingleInstance.class);
                break;
            case R.id.top2:
                startActivity2(SingleTop.class);
                break;
            case R.id.task2:
                startActivity2(SingleTask.class);
                break;
            case R.id.instance2:
                startActivity2(SingleInstance.class);
                break;
        }
    }
    
    private void startActivity(Class targetActivity) {
        Intent intent = new Intent(MainActivity.this, targetActivity);
        intent.putExtra("test", "test");
        startActivity(intent);
    }

    private void startActivity2(Class targetActivity) {
        Intent intent = new Intent(MainActivity.this, targetActivity);
        intent.putExtra("test", "test2");
        startActivity(intent);
    }
}
