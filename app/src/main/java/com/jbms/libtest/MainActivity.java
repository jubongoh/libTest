package com.jbms.libtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jbms.testlibrary.LibTestActivity;
import com.jbms.testlibrary.ToastClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastClass.showToast(this, "aaaaaaaa");

        Button btn = findViewById(R.id.btn_text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LibTestActivity.class);
                startActivity(intent);
            }
        });
        Button btn2 = findViewById(R.id.btn_text2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastClass.showToast(MainActivity.this, "bbbbbbbbb");
            }
        });

    }
}