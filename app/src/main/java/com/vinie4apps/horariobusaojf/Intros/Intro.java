package com.vinie4apps.horariobusaojf.Intros;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.vinie4apps.horariobusaojf.R;

public class Intro extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout linearDot;
    private TextView[] textView;
    private int[] layouts;
    private Button bskip;
    private Button bnext;
    private IntroPageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        if (!isFistTimeStart()){
            StartMainActivity();
            finish();
        }



        setStatusBar();


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.welcome);


        viewPager = findViewById(R.id.view_pager);
        linearDot = findViewById(R.id.dot_Layout);
        bnext = findViewById(R.id.bnext);
        bskip = findViewById(R.id.skip);

        bskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartMainActivity();
            }
        });

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPage = viewPager.getCurrentItem()+1;
                if (currentPage < layouts.length){
                    viewPager.setCurrentItem(currentPage);
                }else {
                    StartMainActivity();
                }
            }
        });

        layouts = new int[]{R.layout.welcome_slide1,R.layout.welcome_slide2,R.layout.welcome_slide3};
        pageAdapter = new IntroPageAdapter(layouts, getApplicationContext());
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == layouts.length-1){
                    bnext.setText("COMEÇAR");
                    bskip.setVisibility(View.GONE);
                }else {
                    bnext.setText("CONTINUAR");
                    bskip.setVisibility(View.VISIBLE);
                }
                setDotStatus(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setDotStatus(0);

    }

    private boolean isFistTimeStart(){
        SharedPreferences ref = getApplicationContext().getSharedPreferences("IntroSliperApp", Context.MODE_PRIVATE);
        return ref.getBoolean("FirstTimeStartFlag", true);
    }

    private  void setFirstTimeStartStatus(boolean stt){
        SharedPreferences ref = getApplicationContext().getSharedPreferences("IntroSliperApp", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = ref.edit();
        editor.putBoolean("FirstTimeStartFlag", stt);
        editor.commit();
    }

    private void setDotStatus(int page){
        linearDot.removeAllViews();
        textView= new TextView[layouts.length];
        for (int i = 0; i < textView.length; i++){
            textView[i] = new TextView(this);
            textView[i].setText(Html.fromHtml("&#8226"));
            textView[i].setTextSize(30);
            textView[i].setTextColor(Color.parseColor("#a9b4bb"));
            linearDot.addView(textView[i]);
        }
        if (textView.length>0){
            textView[page].setTextColor(Color.parseColor("#ffffff"));
        }
    }

    private void StartMainActivity(){
        setFirstTimeStartStatus (false);
        startActivity(new Intent(Intro.this,SplashScreen.class));
        finish();
    }

    private void setStatusBar(){
        if (Build.VERSION.SDK_INT >21){
            getWindow().getDecorView().setSystemUiVisibility(TextView.SYSTEM_UI_FLAG_LAYOUT_STABLE| View.SYSTEM_UI_FLAG_FULLSCREEN);
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

}

