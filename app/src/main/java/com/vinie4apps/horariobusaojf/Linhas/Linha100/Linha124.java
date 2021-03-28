package com.vinie4apps.horariobusaojf.Linhas.Linha100;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;
import com.vinie4apps.horariobusaojf.Chat.login;
import com.vinie4apps.horariobusaojf.ChatLinhas.Linha100.Chat_linha124;
import com.vinie4apps.horariobusaojf.Itens.itemAZUL.Horarios_Adapter;
import com.vinie4apps.horariobusaojf.Itens.itemAZUL.Horarios_Model;
import com.vinie4apps.horariobusaojf.R;

import java.util.ArrayList;
import java.util.List;

import static com.vinie4apps.horariobusaojf.Fav.Fav.arrayList_fav;

public class Linha124 extends AppCompatActivity {

    ViewPager viewPager;
    Horarios_Adapter adapter;
    List<Horarios_Model> models;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private BottomSheetBehavior bottomSheetBehavior;
    private TextView mTextViewS;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horarios);



        final Toolbar toolbar = findViewById(R.id.toobar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        toolbar.setBackgroundColor(Color.parseColor("#031983"));
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        toolbar.setSubtitleTextColor(Color.parseColor("#FFFFFF"));


        models = new ArrayList<>();
        models.add(new Horarios_Model("Saída Bairro", "", "Saída Centro", ""));
        models.add(new Horarios_Model("Saída Bairro", "", "Saída Centro", ""));
        models.add(new Horarios_Model("Saída Bairro", "", "Saída Centro", ""));


        adapter = (Horarios_Adapter) new Horarios_Adapter(models, this);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter((PagerAdapter) adapter);
        viewPager.setPadding(5, 0, 5, 0);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);




        //copiar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrowleft);
        tabs.setBackgroundColor(Color.parseColor("#031983"));
        tabs.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        }


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE);
        final MenuItem favNO = menu.findItem(R.id.favNO);
        final MenuItem favSI = menu.findItem(R.id.favSI);
        final MenuItem chat = menu.findItem(R.id.chat);

        favNO.setVisible(prefs.getBoolean("linha1a",true));
        favSI.setVisible(prefs.getBoolean("linha1b",false));

        favNO.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                prefs.edit().putBoolean("linha1a", false).apply();
                prefs.edit().putBoolean("linha1b", true).apply();
                favNO.setVisible(false);
                favSI.setVisible(true);
                arrayList_fav.add("");
                saveData();
                Toast.makeText(Linha124.this, " adicionado aos favoritos !", Toast.LENGTH_LONG).show();

                return true;
            }
        });

        favSI.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                prefs.edit().putBoolean("linha1a", true).apply();
                prefs.edit().putBoolean("linha1b", false).apply();
                favNO.setVisible(true);
                favSI.setVisible(false);
                arrayList_fav.remove("");
                saveData();
                Toast.makeText(Linha124.this, " removido dos favoritos !", Toast.LENGTH_LONG).show();
                return true;
            }
        });


        MenuItem inti = menu.findItem(R.id.inti);
        View sheet = findViewById(R.id.sheet_inti);
        bottomSheetBehavior = BottomSheetBehavior.from(sheet);
        mTextViewS = findViewById(R.id.textstage);

        mTextViewS.setText(String.format(""));
        inti.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                return true;
            }
        });


        chat.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (FirebaseAuth.getInstance().getUid() == null) {
                    new AlertDialog.Builder(Linha124.this)
                            .setTitle("Deseja fazer login ?")
                            .setMessage("Você deve estar logado para acessar o chat !")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(Linha124.this, login.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(intent);
                                }
                            })

                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else {
                    Intent i = new Intent(Linha124.this, Chat_linha124.class);
                    startActivity(i);

                }
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

        }

        return super.onOptionsItemSelected(item);

    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(arrayList_fav);
        editor.putString("task list", json);
        editor.apply();
    }

}
