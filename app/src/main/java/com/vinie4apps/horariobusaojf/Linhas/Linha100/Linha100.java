package com.vinie4apps.horariobusaojf.Linhas.Linha100;

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

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;
import com.vinie4apps.horariobusaojf.Chat.login;
import com.vinie4apps.horariobusaojf.ChatLinhas.Linha100.Chat_linha100;
import com.vinie4apps.horariobusaojf.Itens.itemAZUL.Horarios_Adapter;
import com.vinie4apps.horariobusaojf.Itens.itemAZUL.Horarios_Model;
import com.vinie4apps.horariobusaojf.R;


import java.util.ArrayList;
import java.util.List;

import static com.vinie4apps.horariobusaojf.Fav.Fav.arrayList_fav;


public class Linha100 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Filgueiras");
        toolbar.setBackgroundColor(Color.parseColor("#031983"));
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        toolbar.setSubtitleTextColor(Color.parseColor("#FFFFFF"));


        models = new ArrayList<>();
        models.add(new Horarios_Model("Saída Bairro", "05:45 \t10:15 \t14:45 \t19:15 \t23:50 \n" +
                "08:00 \t12:30 \t17:00 \t21:35", "Saída Centro", "06:45 \t11:15 \t15:45 \t20:15 \t00:50 \n" +
                "09:00 \t13:30 \t18:00 \t22:35 \t"));
        models.add(new Horarios_Model("Saída Bairro", "05:40 \t10:00 \t14:20 \t18:40 \t23:00 \n" +
                "07:50 \t12:10 \t16:30 \t20:50 \t", "Saída Centro", "06:35 \t10:55 \t15:15 \t19:35 \t23:55 \n" +
                "08:45 \t13:05 \t17:25 \t21:45 \t"));
        models.add(new Horarios_Model("Saída Bairro", "05:40  \t10:00 \t14:20 \t18:40 \t23:00 \n" +
                "07:50 \t12:10 \t16:30 \t20:50 \t", "Saída Centro", "06:35 \t10:55 \t15:15 \t19:35 \t23:55 \n" +
                "08:45 \t13:05 \t17:25 \t21:45 \t"));


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

        favNO.setVisible(prefs.getBoolean("linha100a",true));
        favSI.setVisible(prefs.getBoolean("linha100b",false));

        favNO.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                prefs.edit().putBoolean("linha100a", false).apply();
                prefs.edit().putBoolean("linha100b", true).apply();
                favNO.setVisible(false);
                favSI.setVisible(true);
                arrayList_fav.add("100 - Filgueiras");
                saveData();
                Toast.makeText(Linha100.this, "Filgueiras adicionado aos favoritos !", Toast.LENGTH_LONG).show();

                return true;
            }
        });

        favSI.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                prefs.edit().putBoolean("linha100a", true).apply();
                prefs.edit().putBoolean("linha100b", false).apply();
                favNO.setVisible(true);
                favSI.setVisible(false);
                arrayList_fav.remove("100 - Filgueiras");
                saveData();
                Toast.makeText(Linha100.this, "Filgueiras removido dos favoritos !", Toast.LENGTH_LONG).show();
                return true;
            }
        });


        MenuItem inti = menu.findItem(R.id.inti);
        View sheet = findViewById(R.id.sheet_inti);
        bottomSheetBehavior = BottomSheetBehavior.from(sheet);
        mTextViewS = findViewById(R.id.textstage);

        mTextViewS.setText(String.format("IDA: Rua Aníbal Beligoli nº 409 Ponto Final\nRua Orlando Riani\nRua Diomar Monteiro\nAvenida Juiz de Fora\nRua Paracatu\nRua Alencar Tristão\nAvenida Rui Barbosa\nRua Santa Terezinha\nRua Dr.José Eutrópio\nPonte Domingos Alves Pereira\nAvenida Brasil M.D.\nAvenida Barão do Rio Branco\n até o trevo de acesso ao Carrefour (Ponto final).Observação: Em Dias Úteis\n Sábado\n Domingo e Feriado com extensão no primeiro horário até o Hospital Dr. João Penido.\n\nVOLTA: Avenida Barão do Rio Branco até o trevo de acesso ao Carrefour (Ponto final)\nRua Américo Lobo\nAvenida Brasil M.E.\nAvenida Rui Barbosa\nRua Alencar Tristão\nRua Paracatu\nAvenida Juiz de Fora\nRua Rio de Janeiro\nRua Diomar Monteiro\nRua Orlando Riani\nRua Ana Maria Fonseca\nRua José Alberto Castilho\nRua Antônio Alves de Morais\nRua José Alberto Castilho\nRua Aníbal Beligoli nº 409 Ponto Final."));
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
                    new AlertDialog.Builder(Linha100.this)
                            .setTitle("Deseja fazer login ?")
                            .setMessage("Você deve estar logado para acessar o chat !")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(Linha100.this, login.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(intent);
                                }
                            })

                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else {
                    Intent i = new Intent(Linha100.this, Chat_linha100.class);
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


