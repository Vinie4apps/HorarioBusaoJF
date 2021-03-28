package com.vinie4apps.horariobusaojf.Fav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha100;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha101;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha102;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha103;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha104;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha105;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha106;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha107;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha108;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha109;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha110;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha111;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha112;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha113;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha114;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha115;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha116;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha117;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha118;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha119;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha120;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha121;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha122;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha123;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha124;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha125;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha126;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha129;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha130;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha131;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha132;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha133;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha134;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha135;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha136;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha137;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha140;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha141;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha142;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha143;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha145;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha150;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha155;
import com.vinie4apps.horariobusaojf.Linhas.Linha100.Linha190;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha201;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha202;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha203;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha204;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha205;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha206;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha207;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha208;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha209;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha210;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha211;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha213;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha214;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha215;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha216;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha218;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha220;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha222;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha226;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha230;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha231;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha232;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha233;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha239;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha249;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha259;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.Linha299;
import com.vinie4apps.horariobusaojf.Linhas.Linha200.linha221;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha301;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha302;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha303;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha305;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha306;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha307;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha308;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha309;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha311;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha313;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha315;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha321;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha322;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha325;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha326;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha331;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha332;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha333;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha335;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.Linha399;
import com.vinie4apps.horariobusaojf.Linhas.Linha300.linha304;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha400;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha402;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha403;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha404;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha405;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha406;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha407;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha411;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha412;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha413;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha415;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha416;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha420;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha422;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha423;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha424;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha425;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha426;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha427;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha428;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha429;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha430;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha431;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha432;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha433;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha435;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha436;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha437;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha438;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha439;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha440;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha441;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha444;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha445;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha447;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.Linha499;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.linha434;
import com.vinie4apps.horariobusaojf.Linhas.Linha400.linha443;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha501;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha503;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha505;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha508;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha509;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha510;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha511;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha512;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha514;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha515;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha516;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha518;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha519;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha520;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha521;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha522;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha523;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha524;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha525;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha526;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha527;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha528;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha529;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha530;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha531;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha532;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha533;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha534;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha535;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha537;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha538;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha539;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha540;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha541;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha542;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha543;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha544;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha545;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha546;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha547;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha548;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha549;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha555;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha560;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha590;
import com.vinie4apps.horariobusaojf.Linhas.Linha500.Linha599;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha600;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha601;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha602;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha603;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha604;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha605;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha606;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha607;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha608;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha609;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha610;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha611;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha612;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha613;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha614;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha615;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha616;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha620;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha621;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha626;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha630;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha636;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha640;
import com.vinie4apps.horariobusaojf.Linhas.Linha600.Linha646;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha700;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha701;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha702;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha703;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha704;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha705;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha706;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha707;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha708;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha709;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha710;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha711;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha712;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha713;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha714;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha715;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha716;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha717;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha718;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha719;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha720;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha721;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha722;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha723;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha724;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha725;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha726;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha727;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha728;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha729;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha730;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha731;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha732;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha733;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha734;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha735;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha736;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha737;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha738;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha739;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha740;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha741;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha742;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha743;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha744;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha745;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha746;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha747;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha748;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha749;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha751;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha752;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha753;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha754;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha755;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha757;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha758;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha760;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha766;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha767;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha775;
import com.vinie4apps.horariobusaojf.Linhas.Linha700.Linha785;
import com.vinie4apps.horariobusaojf.R;
import com.vinie4apps.horariobusaojf.Extras.Sobre;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Fav extends AppCompatActivity {

    ListView listView;



    public static ArrayList<String> arrayList_fav = new ArrayList<>();
    public static ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData();
        setContentView(R.layout.activity_fav);






        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.Sbcolor));
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }


        // Actionbar Configurações

        Toolbar toolbar = findViewById(R.id.toobarfv);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Favoritos");


        //Config da ListView

        listView = findViewById(R.id.lv_fav);


        arrayAdapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, arrayList_fav);

        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String intem = (String) listView.getItemAtPosition(position);
                if (intem.equals("100 - Filgueiras")) {
                    Intent i = new Intent(Fav.this, Linha100.class);
                    startActivity(i);
                    finish();

                }
                if (intem.equals("101 - Grama")) {
                    Intent intent = new Intent(Fav.this, Linha101.class);
                    Fav.this.startActivity(intent);
                    finish();
                    finish();
                }
                if (intem.equals("102 - Grama Via Garganta do Dilermando")) {
                    Intent intent = new Intent(Fav.this, Linha102.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("103 - Filgueiras")) {
                    Intent intent = new Intent(Fav.this, Linha103.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("104 - Granjas Betânia / Santa Luzia")) {
                    Intent intent = new Intent(Fav.this, Linha104.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("105 - Filgueiras")) {
                    Intent intent = new Intent(Fav.this, Linha105.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("106 - Parque Independência / Jardim Gaúcho")) {
                    Intent intent = new Intent(Fav.this, Linha106.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("107 - Vila Montanhesa")) {
                    Intent intent = new Intent(Fav.this, Linha107.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("108 - Granjas Betânia / Santa Luzia")) {
                    Intent intent = new Intent(Fav.this, Linha108.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("109 - Granjas Triunfo")) {
                    Intent intent = new Intent(Fav.this, Linha109.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("110 - Recanto dos Lagos")) {
                    Intent intent = new Intent(Fav.this, Linha110.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("111 - Mundo Novo / Santa Terezinha")) {
                    Intent intent = new Intent(Fav.this, Linha111.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("112  - Mundo Novo / Santa Terezinha")) {
                    Intent intent = new Intent(Fav.this, Linha112.class);
                    Fav.this.startActivity(intent);
                    finish();
                }

                if (intem.equals("113 - Vila Montanhesa / Jardim Gaúcho")) {
                    Intent intent = new Intent(Fav.this, Linha113.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("114 - Sagrado Coração de Jesus / Granjas Betânia")) {
                    Intent intent = new Intent(Fav.this, Linha114.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("115 - Mundo Novo / Quintas da Avenida")) {
                    Intent intent = new Intent(Fav.this, Linha115.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("116 - Vivendas da Serra / Via Garganta do Dilermando")) {
                    Intent intent = new Intent(Fav.this, Linha116.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("117 - Vivendas da Serra / Via Garganta do Dilermando")) {
                    Intent intent = new Intent(Fav.this, Linha117.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("118 - Parque Independência / Cidade Nova / Vale Verde")) {
                    Intent intent = new Intent(Fav.this, Linha118.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("119 - Nossa Senhora das Graças / Santa Luzia")) {
                    Intent intent = new Intent(Fav.this, Linha119.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("120 - Vista Alegre / Santa Luzia")) {
                    Intent intent = new Intent(Fav.this, Linha120.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("121 - Nossa Senhora das Graças / Santa Luzia")) {
                    Intent intent = new Intent(Fav.this, Linha121.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("122 - Eldorado / Jardim de Alá")) {
                    Intent intent = new Intent(Fav.this, Linha122.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("123 - Alto Eldorado / Santa Luzia")) {
                    Intent intent = new Intent(Fav.this, Linha123.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("124 - Eldorado / Alto Jardim de Alá")) {
                    Intent intent = new Intent(Fav.this, Linha124.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("125 - Eldorado / Jardim América")) {
                    Intent intent = new Intent(Fav.this, Linha125.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("126 - Eldorado / Jardim América")) {
                    Intent intent = new Intent(Fav.this, Linha126.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("129 - Previdenciários")) {
                    Intent intent = new Intent(Fav.this, Linha129.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("130 - Bandeirantes / Via Garganta do Dilermando / Alto São Geraldo")) {
                    Intent intent = new Intent(Fav.this, Linha130.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("131 - Bandeirantes / São Geraldo")) {
                    Intent intent = new Intent(Fav.this, Linha131.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("132 - Bandeirantes / Ipiranga")) {
                    Intent intent = new Intent(Fav.this, Linha132.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("133 - Bandeirantes / Ipiranga / Arco-irís")) {
                    Intent intent = new Intent(Fav.this, Linha133.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("134 - Bandeirantes / Santa Efigênia")) {
                    Intent intent = new Intent(Fav.this, Linha134.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("135 - Parque Guarani / Sagrado Coração de Jesus")) {
                    Intent intent = new Intent(Fav.this, Linha135.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("136 - Bandeirantes / Via Garganta do Dilermando / Santa Efigênia")) {
                    Intent intent = new Intent(Fav.this, Linha136.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("137 - Sagrado Coração de Jesus / Manoel Honório")) {
                    Intent intent = new Intent(Fav.this, Linha137.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("140 - Santa Efigênia / Monoel Honório")) {
                    Intent intent = new Intent(Fav.this, Linha140.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("141 - Bandeirantes / Bela Aurora")) {
                    Intent intent = new Intent(Fav.this, Linha141.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("142 - Bandeirantes / Bela Aurora")) {
                    Intent intent = new Intent(Fav.this, Linha142.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("143 - Bela Aurora / Centro")) {
                    Intent intent = new Intent(Fav.this, Linha143.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("145  - Centenário / Santa Efigênia")) {
                    Intent intent = new Intent(Fav.this, Linha145.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("150 - Grama")) {
                    Intent intent = new Intent(Fav.this, Linha150.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("155 - Jardim Emaús")) {
                    Intent intent = new Intent(Fav.this, Linha155.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("190 - Zona Sul / UFJF / CAS")) {
                    Intent intent = new Intent(Fav.this, Linha190.class);
                    Fav.this.startActivity(intent);
                    finish();
                }

                // Linhas 200

                if (intem.equals("201 - Progresso")) {
                    Intent intent = new Intent(Fav.this, Linha201.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("202 - Progresso")) {
                    Intent intent = new Intent(Fav.this, Linha202.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("203 - Marumbi")) {
                    Intent intent = new Intent(Fav.this, Linha203.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("204 - Santa Paula")) {
                    Intent intent = new Intent(Fav.this, Linha204.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("205 - Santa Paula")) {
                    Intent intent = new Intent(Fav.this, Linha205.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("206 - Borborema")) {
                    Intent intent = new Intent(Fav.this, Linha206.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("207 - Marumbi")) {
                    Intent intent = new Intent(Fav.this, Linha207.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("208 - Progresso")) {
                    Intent intent = new Intent(Fav.this, Linha208.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("209 - Marumbi")) {
                    Intent intent = new Intent(Fav.this, Linha209.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("210 - Santa Paula")) {
                    Intent intent = new Intent(Fav.this, Linha210.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("211 - Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha211.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("213 - Bairu / Cruzeiro do Sul")) {
                    Intent intent = new Intent(Fav.this, Linha213.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("214 - Bairu / Cruzeiro do Sul")) {
                    Intent intent = new Intent(Fav.this, Linha214.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("215 - Bairu / Cruzeiro do Sul")) {
                    Intent intent = new Intent(Fav.this, Linha215.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("216 - Bairu / Boa Vista")) {
                    Intent intent = new Intent(Fav.this, Linha216.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("218 - Graminha")) {
                    Intent intent = new Intent(Fav.this, Linha218.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("220 - Bom Pastor")) {
                    Intent intent = new Intent(Fav.this, Linha220.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("221 - Bom Pastor / Santa Catarina")) {
                    Intent intent = new Intent(Fav.this, linha221.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("222 - Bom Pastor / Santa Catarina")) {
                    Intent intent = new Intent(Fav.this, Linha222.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("226 - Guaruá / Bairu")) {
                    Intent intent = new Intent(Fav.this, Linha226.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("230 - Santa Paula")) {
                    Intent intent = new Intent(Fav.this, Linha230.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("231 - Progresso")) {
                    Intent intent = new Intent(Fav.this, Linha231.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("232 - Bonfim / Via Av. Brasil")) {
                    Intent intent = new Intent(Fav.this, Linha232.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("233 - Marumbi")) {
                    Intent intent = new Intent(Fav.this, Linha233.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("239 - Progresso / Av. Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha239.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("249 - Marumbi / Av. Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha249.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("259 - Santa Paula / Av. Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha259.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("299 - Alto Bairu / Cruzeiro do Sul")) {
                    Intent intent = new Intent(Fav.this, Linha299.class);
                    Fav.this.startActivity(intent);
                    finish();
                }

                // Linhas 300
                if (intem.equals("301 - Usina Quatro")) {
                    Intent intent = new Intent(Fav.this, Linha301.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("302 - Floresta")) {
                    Intent intent = new Intent(Fav.this, Linha302.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("303 - Jardim Esperança")) {
                    Intent intent = new Intent(Fav.this, Linha303.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("304 - Caeté")) {
                    Intent intent = new Intent(Fav.this, linha304.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("305 - Jardim Esperança")) {
                    Intent intent = new Intent(Fav.this, Linha305.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("306 - Retiro")) {
                    Intent intent = new Intent(Fav.this, Linha306.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("307 - Retiro / Floresta")) {
                    Intent intent = new Intent(Fav.this, Linha307.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("308 - Retiro")) {
                    Intent intent = new Intent(Fav.this, Linha308.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("309 - Terras Altas")) {
                    Intent intent = new Intent(Fav.this, Linha309.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("311 - Santa Tereza")) {
                    Intent intent = new Intent(Fav.this, Linha311.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("313 - Sarandira")) {
                    Intent intent = new Intent(Fav.this, Linha313.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("315 - Jardim Esperança")) {
                    Intent intent = new Intent(Fav.this, Linha315.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("321 - Vila Ozanan")) {
                    Intent intent = new Intent(Fav.this, Linha321.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("322 - Furtado de Menezes")) {
                    Intent intent = new Intent(Fav.this, Linha322.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("325 - Solidariedade")) {
                    Intent intent = new Intent(Fav.this, Linha325.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("326 - Solidariedade / Via Vila Ideal")) {
                    Intent intent = new Intent(Fav.this, Linha326.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("331 - Vila Ideal")) {
                    Intent intent = new Intent(Fav.this, Linha331.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("332 - Vila Ideal")) {
                    Intent intent = new Intent(Fav.this, Linha332.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("333 - Granjas Primavera")) {
                    Intent intent = new Intent(Fav.this, Linha333.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("335 - Granjas Bethel")) {
                    Intent intent = new Intent(Fav.this, Linha335.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("399 - Olavo Costa")) {
                    Intent intent = new Intent(Fav.this, Linha399.class);
                    Fav.this.startActivity(intent);
                    finish();
                }

                // Linhas 400
                if (intem.equals("400 - Alto Grajaú")) {
                    Intent intent = new Intent(Fav.this, Linha400.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("402 - Alto Grajaú")) {
                    Intent intent = new Intent(Fav.this, Linha402.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("403 - Nossa Senhora Aparecida")) {
                    Intent intent = new Intent(Fav.this, Linha403.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("404 - Santa Rita")) {
                    Intent intent = new Intent(Fav.this, Linha404.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("405 - Santa Rita / Alto Três Moinhos")) {
                    Intent intent = new Intent(Fav.this, Linha405.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("406 - Santa Rita / Sr Nenêm")) {
                    Intent intent = new Intent(Fav.this, Linha406.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("407 - Nossa Senhora Aparecida")) {
                    Intent intent = new Intent(Fav.this, Linha407.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("411 - Vitorino Braga")) {
                    Intent intent = new Intent(Fav.this, Linha411.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("412 - Parque Burnier")) {
                    Intent intent = new Intent(Fav.this, Linha412.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("413 - Bom Jardim")) {
                    Intent intent = new Intent(Fav.this, Linha413.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("415 - Linhares / Via Vale dos Peões")) {
                    Intent intent = new Intent(Fav.this, Linha415.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("416 - Linhares")) {
                    Intent intent = new Intent(Fav.this, Linha416.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("420 - Linhares")) {
                    Intent intent = new Intent(Fav.this, Linha420.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("422 - Santa Cândida")) {
                    Intent intent = new Intent(Fav.this, Linha422.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("423 - Bom Jardim")) {
                    Intent intent = new Intent(Fav.this, Linha423.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("424 - Aracy")) {
                    Intent intent = new Intent(Fav.this, Linha424.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("425 - Linhares")) {
                    Intent intent = new Intent(Fav.this, Linha425.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("426 - Grajaú")) {
                    Intent intent = new Intent(Fav.this, Linha426.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("427 - Linhares")) {
                    Intent intent = new Intent(Fav.this, Linha427.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("428 - Linhares / Fazenda Yung")) {
                    Intent intent = new Intent(Fav.this, Linha428.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("429 - Linhares")) {
                    Intent intent = new Intent(Fav.this, Linha429.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("430 - São Sebastião / Via Bonsucesso")) {
                    Intent intent = new Intent(Fav.this, Linha430.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("431 - São Benedito")) {
                    Intent intent = new Intent(Fav.this, Linha431.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("432 - São Benedito")) {
                    Intent intent = new Intent(Fav.this, Linha432.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("433 - Vila Alpina")) {
                    Intent intent = new Intent(Fav.this, Linha433.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("434 - Vila Alpina")) {
                    Intent intent = new Intent(Fav.this, linha434.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("435 - Linhares")) {
                    Intent intent = new Intent(Fav.this, Linha435.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("436 - Linhares")) {
                    Intent intent = new Intent(Fav.this, Linha436.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("437 - São Bernardo")) {
                    Intent intent = new Intent(Fav.this, Linha437.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("438 - Parque Serra Verde")) {
                    Intent intent = new Intent(Fav.this, Linha438.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("439 - Santo Antônio")) {
                    Intent intent = new Intent(Fav.this, Linha439.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("440 - Santo Antônio")) {
                    Intent intent = new Intent(Fav.this, Linha440.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("441 - Santo Antônio")) {
                    Intent intent = new Intent(Fav.this, Linha441.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("443 - Nossa Senhora de Lourdes")) {
                    Intent intent = new Intent(Fav.this, linha443.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("444 - Nossa Senhora de Lourdes")) {
                    Intent intent = new Intent(Fav.this, Linha444.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("445 - Nossa Senhora de Lourdes")) {
                    Intent intent = new Intent(Fav.this, Linha445.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("447 - Nossa Senhora de Lourdes")) {
                    Intent intent = new Intent(Fav.this, Linha447.class);
                    Fav.this.startActivity(intent);
                    finish();
                }

                if (intem.equals("499 - Linhares / Santo Antônio")) {
                    Intent intent = new Intent(Fav.this, Linha499.class);
                    Fav.this.startActivity(intent);
                    finish();
                }

                //Linhas 500

                if (intem.equals("501 - Padre Café / Jardim Glória")) {
                    Intent intent = new Intent(Fav.this, Linha501.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("503 - Paineras")) {
                    Intent intent = new Intent(Fav.this, Linha503.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("505 - Morro do Cristo")) {
                    Intent intent = new Intent(Fav.this, Linha505.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("508 - Avenida Deusdedith Salgado")) {
                    Intent intent = new Intent(Fav.this, Linha508.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("509 - Alto Dom Bosco / Laranjeiras")) {
                    Intent intent = new Intent(Fav.this, Linha509.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("510 - Dom Bosco")) {
                    Intent intent = new Intent(Fav.this, Linha510.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("511 - Dom Bosco / Borboleta")) {
                    Intent intent = new Intent(Fav.this, Linha511.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("512 - Dom Bosco / Borboleta")) {
                    Intent intent = new Intent(Fav.this, Linha512.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("514 - Cascatinha / Borboleta")) {
                    Intent intent = new Intent(Fav.this, Linha514.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("515 - Dom Orione")) {
                    Intent intent = new Intent(Fav.this, Linha515.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("516 - São Pedro / Via Borboleta")) {
                    Intent intent = new Intent(Fav.this, Linha516.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("518 - Salvaterra")) {
                    Intent intent = new Intent(Fav.this, Linha518.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("519 - Torreões")) {
                    Intent intent = new Intent(Fav.this, Linha519.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("520 - Aeroporto")) {
                    Intent intent = new Intent(Fav.this, Linha520.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("521 - Teixeiras")) {
                    Intent intent = new Intent(Fav.this, Linha521.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("522 - Teixeiras")) {
                    Intent intent = new Intent(Fav.this, Linha522.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("523 - Monte Verde")) {
                    Intent intent = new Intent(Fav.this, Linha523.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("524 - São Mateus")) {
                    Intent intent = new Intent(Fav.this, Linha524.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("525 - Universidade (UFJF)")) {
                    Intent intent = new Intent(Fav.this, Linha525.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("526 - Cascatinha / Vale do Ipê")) {
                    Intent intent = new Intent(Fav.this, Linha526.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("527 - Santa Cecília")) {
                    Intent intent = new Intent(Fav.this, Linha527.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("528 - Cascatinha / Borboleta")) {
                    Intent intent = new Intent(Fav.this, Linha528.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("529 - Torreões / Via Mascate / Monte Verde")) {
                    Intent intent = new Intent(Fav.this, Linha529.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("530 - São Pedro")) {
                    Intent intent = new Intent(Fav.this, Linha530.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("531 - Nova Califórnia")) {
                    Intent intent = new Intent(Fav.this, Linha531.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("532 - São Pedro / Via Caiçaras")) {
                    Intent intent = new Intent(Fav.this, Linha532.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("533 - São Pedro")) {
                    Intent intent = new Intent(Fav.this, Linha533.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("534 - Santos Dumont")) {
                    Intent intent = new Intent(Fav.this, Linha534.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("535 - Universidade (UFJF)")) {
                    Intent intent = new Intent(Fav.this, Linha535.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("537 - Jardim da Serra")) {
                    Intent intent = new Intent(Fav.this, Linha537.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("538 - Morada do Serro / Via Jardim Casa Blanca / Adolpho Vireque")) {
                    Intent intent = new Intent(Fav.this, Linha538.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("539 - Santos Dumont")) {
                    Intent intent = new Intent(Fav.this, Linha539.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("540 - São Pedro")) {
                    Intent intent = new Intent(Fav.this, Linha540.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("541 - São Pedro")) {
                    Intent intent = new Intent(Fav.this, Linha541.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("542 - Lagoa")) {
                    Intent intent = new Intent(Fav.this, Linha542.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("543 - Santa Córdula")) {
                    Intent intent = new Intent(Fav.this, Linha543.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("544 - Recanto dos Brugger")) {
                    Intent intent = new Intent(Fav.this, Linha544.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("545 - Universidade (UFJF)")) {
                    Intent intent = new Intent(Fav.this, Linha545.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("546 - Mirante")) {
                    Intent intent = new Intent(Fav.this, Linha546.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("547 - Nossa Senhora de Fátima")) {
                    Intent intent = new Intent(Fav.this, Linha547.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("548 - Adolpho Vireque / Via Jardim Casa Blanca / Morada do Serro")) {
                    Intent intent = new Intent(Fav.this, Linha548.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("549 - Nova Germânia")) {
                    Intent intent = new Intent(Fav.this, Linha549.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("555 - Universidade (UFJF)")) {
                    Intent intent = new Intent(Fav.this, Linha555.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("560 - Av. Presidente Itamar Franco / Via Shopping")) {
                    Intent intent = new Intent(Fav.this, Linha560.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("590 - Zona Sul / UFJF / CAS")) {
                    Intent intent = new Intent(Fav.this, Linha590.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("599 - São Pedro")) {
                    Intent intent = new Intent(Fav.this, Linha599.class);
                    Fav.this.startActivity(intent);
                    finish();
                }

                //Linhas 600

                if (intem.equals("600 - Monte Castelo / Via Jardim São João")) {
                    Intent intent = new Intent(Fav.this, Linha600.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("601 - Jardim Cachoeira / Via Monte Castelo")) {
                    Intent intent = new Intent(Fav.this, Linha601.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("602 - Monte Castelo")) {
                    Intent intent = new Intent(Fav.this, Linha602.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("603 - Carlos Chagas")) {
                    Intent intent = new Intent(Fav.this, Linha603.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("604 - Bairro Industrial")) {
                    Intent intent = new Intent(Fav.this, Linha604.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("605 - Milho Branco")) {
                    Intent intent = new Intent(Fav.this, Linha605.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("606 - Jardim Natal")) {
                    Intent intent = new Intent(Fav.this, Linha606.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("607 - Jardim Natal")) {
                    Intent intent = new Intent(Fav.this, Linha607.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("608 - Milho Branco")) {
                    Intent intent = new Intent(Fav.this, Linha608.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("609 - Milho Branco")) {
                    Intent intent = new Intent(Fav.this, Linha609.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("610 - Amazônia")) {
                    Intent intent = new Intent(Fav.this, Linha610.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("611 - Esplanada / Granbery")) {
                    Intent intent = new Intent(Fav.this, Linha611.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("612 - Esplanada / Granbery")) {
                    Intent intent = new Intent(Fav.this, Linha612.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("613 - Francisco Bernardino")) {
                    Intent intent = new Intent(Fav.this, Linha613.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("614 - Jardim Natal")) {
                    Intent intent = new Intent(Fav.this, Linha614.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("615 - Encosta do Sol")) {
                    Intent intent = new Intent(Fav.this, Linha615.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("616 - Jardim Natal")) {
                    Intent intent = new Intent(Fav.this, Linha616.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("620 - Francisco Bernardino / Via Fontes Ville")) {
                    Intent intent = new Intent(Fav.this, Linha620.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("621 - Democrata")) {
                    Intent intent = new Intent(Fav.this, Linha621.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("626 - Jardim Natal / Av. Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha626.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("630 - Rodoviária")) {
                    Intent intent = new Intent(Fav.this, Linha630.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("636 - Jardim Cachoeira / Av. Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha636.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("640 - Rodoviária")) {
                    Intent intent = new Intent(Fav.this, Linha640.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("646 - Milho Branco / Av. Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha646.class);
                    Fav.this.startActivity(intent);
                    finish();
                }


                //Linhas 700

                if (intem.equals("700 - Barbosa Lage")) {
                    Intent intent = new Intent(Fav.this, Linha700.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("701 - Jóquei Clube")) {
                    Intent intent = new Intent(Fav.this, Linha701.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("702 - Jóquei Clube")) {
                    Intent intent = new Intent(Fav.this, Linha702.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("703 - Barbosa Lage / Santa Amélia")) {
                    Intent intent = new Intent(Fav.this, Linha703.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("704 - Jóquei Clube III")) {
                    Intent intent = new Intent(Fav.this, Linha704.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("705 - Jóquei Clube III")) {
                    Intent intent = new Intent(Fav.this, Linha705.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("706 - Cidade do Sol")) {
                    Intent intent = new Intent(Fav.this, Linha706.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("707 - Cidade do Sol")) {
                    Intent intent = new Intent(Fav.this, Linha707.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("708 - Vale dos Lírios")) {
                    Intent intent = new Intent(Fav.this, Linha708.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("709 - Jóquei Clube")) {
                    Intent intent = new Intent(Fav.this, Linha709.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("710 - Novo Triunfo")) {
                    Intent intent = new Intent(Fav.this, Linha710.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("711 - Barreira")) {
                    Intent intent = new Intent(Fav.this, Linha711.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("712 - Dias Tavares")) {
                    Intent intent = new Intent(Fav.this, Linha712.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("13 - Náutico")) {
                    Intent intent = new Intent(Fav.this, Linha713.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("714 - Chapéu D Uvas")) {
                    Intent intent = new Intent(Fav.this, Linha714.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("715 - Vila Esperança I")) {
                    Intent intent = new Intent(Fav.this, Linha715.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("716 - Distrito Industrial")) {
                    Intent intent = new Intent(Fav.this, Linha716.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("717 - Benfica")) {
                    Intent intent = new Intent(Fav.this, Linha717.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("718 - Ponte Preta")) {
                    Intent intent = new Intent(Fav.this, Linha718.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("719 - Nova Era / Centro")) {
                    Intent intent = new Intent(Fav.this, Linha719.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("720 - Santa Lúcia")) {
                    Intent intent = new Intent(Fav.this, Linha720.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("721 - Nova Era")) {
                    Intent intent = new Intent(Fav.this, Linha721.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("722 - Santa Cruz")) {
                    Intent intent = new Intent(Fav.this, Linha722.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("723 - São Judas Tadeu")) {
                    Intent intent = new Intent(Fav.this, Linha723.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("724 - Santa Lúcia / Distrito Industrial (Circular)")) {
                    Intent intent = new Intent(Fav.this, Linha724.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("725 - São Judas Tadeu")) {
                    Intent intent = new Intent(Fav.this, Linha725.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("726 - Igrejinha")) {
                    Intent intent = new Intent(Fav.this, Linha726.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("727 - Bairro Araújo")) {
                    Intent intent = new Intent(Fav.this, Linha727.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("728 - Nova Benfica")) {
                    Intent intent = new Intent(Fav.this, Linha728.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("729 - Paula Lima")) {
                    Intent intent = new Intent(Fav.this, Linha729.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("730 - Santa Lúcia")) {
                    Intent intent = new Intent(Fav.this, Linha730.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("731 - BR 040")) {
                    Intent intent = new Intent(Fav.this, Linha731.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("732 - Santa Cruz")) {
                    Intent intent = new Intent(Fav.this, Linha732.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("733 - Santa Cruz / Via São Damião")) {
                    Intent intent = new Intent(Fav.this, Linha733.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("734 - Cidade do Sol / Santa Maria")) {
                    Intent intent = new Intent(Fav.this, Linha734.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("735 - Vila Esperança II")) {
                    Intent intent = new Intent(Fav.this, Linha735.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("736 - Nova Benfica")) {
                    Intent intent = new Intent(Fav.this, Linha736.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("737 - Jóquei Clube")) {
                    Intent intent = new Intent(Fav.this, Linha737.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("738 - Pedra Branca")) {
                    Intent intent = new Intent(Fav.this, Linha738.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("739 - Nova Era")) {
                    Intent intent = new Intent(Fav.this, Linha739.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("740 - Humaitá")) {
                    Intent intent = new Intent(Fav.this, Linha740.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("741 - Valadares")) {
                    Intent intent = new Intent(Fav.this, Linha741.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("742 - Rosário de Minas")) {
                    Intent intent = new Intent(Fav.this, Linha742.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("743 - Toledos")) {
                    Intent intent = new Intent(Fav.this, Linha743.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("744 - Palmital")) {
                    Intent intent = new Intent(Fav.this, Linha744.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("745 - Rosário de Minas")) {
                    Intent intent = new Intent(Fav.this, Linha745.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("746 - Circular BR 267")) {
                    Intent intent = new Intent(Fav.this, Linha746.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("747 - São Judas Tadeu")) {
                    Intent intent = new Intent(Fav.this, Linha747.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("748 - Alto Santa Cruz")) {
                    Intent intent = new Intent(Fav.this, Linha748.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("749 - São Judas Tadeu")) {
                    Intent intent = new Intent(Fav.this, Linha749.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("751 - Santa Cruz / Via Jardim Alfineiros / Santa Clara")) {
                    Intent intent = new Intent(Fav.this, Linha751.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("752 - Penido")) {
                    Intent intent = new Intent(Fav.this, Linha752.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("753 - Miguel Marinho")) {
                    Intent intent = new Intent(Fav.this, Linha753.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("754 - CIRCULAR BENFICA / SENAI-VIA BR 040")) {
                    Intent intent = new Intent(Fav.this, Linha754.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("755 - Zona Norte / UFJF")) {
                    Intent intent = new Intent(Fav.this, Linha755.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("757 - Benfica / Jardim Bom Jesus")) {
                    Intent intent = new Intent(Fav.this, Linha757.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("758 - Novo Triunfo II")) {
                    Intent intent = new Intent(Fav.this, Linha758.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("760 - Humaitá")) {
                    Intent intent = new Intent(Fav.this, Linha760.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("766 - Zona Norte / Av. Rio Branco")) {
                    Intent intent = new Intent(Fav.this, Linha766.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("767 - Benfica / Bela Vista")) {
                    Intent intent = new Intent(Fav.this, Linha767.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("775 - Santa Cruz / Via Av. Brasil")) {
                    Intent intent = new Intent(Fav.this, Linha775.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
                if (intem.equals("785 - Benfica / Via Av. Brasil")) {
                    Intent intent = new Intent(Fav.this, Linha785.class);
                    Fav.this.startActivity(intent);
                    finish();
                }
            }
        });

    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(arrayList_fav);
        editor.putString("task list", json);
        editor.apply();
    }


    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("task list", null);
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        arrayList_fav = gson.fromJson(json, type);
        if (arrayList_fav == null) {
            arrayList_fav = new ArrayList<>();
        }
    }
    @Override
    public void onContentChanged() {
        super.onContentChanged();

        View empty = findViewById(R.id.favbaneer);
        ListView list = (ListView) findViewById(R.id.lv_fav);
        list.setEmptyView(empty);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_fav, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.searchView_fav);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setQueryHint(Html.fromHtml("<font color = #000000>" + getResources().getString(R.string.hintSearchMess) + "</font>"));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                arrayAdapter.getFilter().filter(s);
                TextView tx = (TextView) findViewById(R.id.textfav);
                tx.setText("Nenhuma Linha Encontada :(\n Verifique se foi adicionada nos favoritos corretamente :)");
                ImageView img = (ImageView) findViewById(R.id.imgfav);
                img.setImageResource(R.drawable.img2);

                return true;

            }
        });
        return true;
    }

    // Config do botão Menu (Sobre App)

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.about){
            Intent intent = new Intent(this, Sobre.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
