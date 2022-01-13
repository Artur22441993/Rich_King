package com.richvtro.kijnghred.richking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView v0, v1, v2, sp0, sp1;
    public final static String gigg  = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzL2JlMTg2MzI0ZTljNjllYTg4ZTNkODhiMmIwYTQ3YjNkL3Jhdy9SaWNoJTI1MjBLaW5n";
    public final static String oooo = "OTZhYzk3YmUtOGY1OS00YmM0LWI0NjAtYWVlOGIwNGJkMzA4";
    public final static String oreo = "eXdadkI0a1ZYY0pLZDJkQ3RERVB0ZA==";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(1024);

        sp0 = findViewById(R.id.imageView_sp0);
        sp1 = findViewById(R.id.imageView2_sp1);

        v0 = findViewById(R.id.imageView3);
        v1 = findViewById(R.id.imageView4);
        v2 = findViewById(R.id.imageView5);

        sp0.setOnClickListener(this::s);
        sp1.setOnClickListener(this::s);
    }

    int index = 0;

    private void s(View view) {
        Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
               index++;

                if (index > 47){
                    index = 0;
                    view.setClickable(true);

                    TextView textView = findViewById(R.id.textView);
                    int i = new Random().nextInt(44) + 60;
                    textView.setText("Score: " + i);

                }else{
                    v0.setImageResource(d());
                    v1.setImageResource(d());
                    v2.setImageResource(d());
                    handler.postDelayed(this::run, 13);
                }
            }
        });
    }

    private int d() {

        Random random =  new Random();
        int[] a = a();
        int r = random.nextInt(a.length);
        return a[r];
    }

    private int[] a() {
        return new int[]{
                R.drawable.ic_slot_1,
                R.drawable.ic_slot_2,
                R.drawable.ic_slot_3,
        };
    }

    public static void sta(SA16 sa16){
        sa16.startActivity(new Intent(sa16.getApplicationContext(),MainActivity.class));
        sa16.finishAffinity();
    }
}