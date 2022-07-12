package com.example.mymainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
    ImageButton button = null;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                ViewFlipper flipper = findViewById(R.id.flipper);
                flipper.startFlipping();


                ViewFlipper flipper2 = findViewById(R.id.gun2);
                flipper2.startFlipping();

                ViewFlipper flipper3 = findViewById(R.id.gun3);
                flipper3.startFlipping();

                button = (ImageButton) findViewById(R.id.p1);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, shequhuodong.class);
                        startActivity(intent);
                    }
                });

            }

}



/*  private Button btn;
    private TextView textView1;
    private int count = 0;


      textView1 = this.findViewById(R.id.xinwenkuang1shuzi);
        btn = this.findViewById(R.id.zheng1);
        //给按钮添加点击事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;   //让count每点击1次加1
                textView1.setText(count + "");
            }
        });*/
