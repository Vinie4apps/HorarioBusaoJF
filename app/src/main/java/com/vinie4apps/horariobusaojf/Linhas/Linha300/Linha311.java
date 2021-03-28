package com.vinie4apps.horariobusaojf.Linhas.Linha300;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;
import com.vinie4apps.horariobusaojf.Itens.itemAZUL.Horarios_Adapter;
import com.vinie4apps.horariobusaojf.Itens.itemAZUL.Horarios_Model;
import com.vinie4apps.horariobusaojf.R;

import java.util.ArrayList;
import java.util.List;

public class Linha311 extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Horarios_Model> models;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horarios);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.vermelho));

        }


        final Toolbar toolbar = findViewById(R.id.toobar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Filgueiras");
        toolbar.setBackgroundColor(Color.parseColor("#D00B08"));
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));


        models = new ArrayList<>();
        models.add(new Horarios_Model("Saída Bairro","05:40 \t07:50 \t10:00 \t14:20 \t17:45 \t20:50 \n06:05 \t08:15 \t12:10 \t16:30 \t18:40 \t23:00 ","Saída Centro", "bláblá blá"));
        models.add(new Horarios_Model("S", "k","uuu","ooo"));
        models.add(new Horarios_Model("S", "k","po","vv"));


        adapter = (Adapter) new Horarios_Adapter(models, this);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter((PagerAdapter) adapter);
        viewPager.setPadding(5, 0, 5, 0);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
