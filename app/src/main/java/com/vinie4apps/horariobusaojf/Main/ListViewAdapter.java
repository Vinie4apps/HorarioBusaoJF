package com.vinie4apps.horariobusaojf.Main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{


    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;


    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i)     {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;

        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.linhas);
            holder.mIconIv = view.findViewById(R.id.corbus);


            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }

        holder.mTitleTv.setText(modellist.get(postition).getTitle());


        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (modellist.get(postition).getTitle().equals("100 - Filgueiras")){
                    Intent intent = new Intent(mContext, Linha100.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("101 - Grama")){
                    Intent intent = new Intent(mContext, Linha101.class);
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("102 - Grama Via Garganta do Dilermando")){
                    Intent intent = new Intent(mContext, Linha102.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("103 - Filgueiras")){
                    Intent intent = new Intent(mContext, Linha103.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("104 - Granjas Betânia / Santa Luzia")){
                    Intent intent = new Intent(mContext, Linha104.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("105 - Filgueiras")){
                    Intent intent = new Intent(mContext, Linha105.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("106 - Parque Independência / Jardim Gaúcho")){
                    Intent intent = new Intent(mContext, Linha106.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("107 - Vila Montanhesa")){
                    Intent intent = new Intent(mContext, Linha107.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("108 - Granjas Betânia / Santa Luzia")){
                    Intent intent = new Intent(mContext, Linha108.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("109 - Granjas Triunfo")){
                    Intent intent = new Intent(mContext, Linha109.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("110 - Recanto dos Lagos")){
                    Intent intent = new Intent(mContext, Linha110.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("111 - Mundo Novo / Santa Terezinha")){
                    Intent intent = new Intent(mContext, Linha111.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("112  - Mundo Novo / Santa Terezinha")){
                    Intent intent = new Intent(mContext, Linha112.class);
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("113 - Vila Montanhesa / Jardim Gaúcho")){
                    Intent intent = new Intent(mContext, Linha113.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("114 - Sagrado Coração de Jesus / Granjas Betânia")){
                    Intent intent = new Intent(mContext, Linha114.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("115 - Mundo Novo / Quintas da Avenida")){
                    Intent intent = new Intent(mContext, Linha115.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("116 - Vivendas da Serra / Via Garganta do Dilermando")){
                    Intent intent = new Intent(mContext, Linha116.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("117 - Vivendas da Serra / Via Garganta do Dilermando")){
                    Intent intent = new Intent(mContext, Linha117.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("118 - Parque Independência / Cidade Nova / Vale Verde")){
                    Intent intent = new Intent(mContext, Linha118.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("119 - Nossa Senhora das Graças / Santa Luzia")){
                    Intent intent = new Intent(mContext, Linha119.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("120 - Vista Alegre / Santa Luzia")){
                    Intent intent = new Intent(mContext, Linha120.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("121 - Nossa Senhora das Graças / Santa Luzia")){
                    Intent intent = new Intent(mContext, Linha121.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("122 - Eldorado / Jardim de Alá")){
                    Intent intent = new Intent(mContext, Linha122.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("123 - Alto Eldorado / Santa Luzia")){
                    Intent intent = new Intent(mContext, Linha123.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("124 - Eldorado / Alto Jardim de Alá")){
                    Intent intent = new Intent(mContext, Linha124.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("125 - Eldorado / Jardim América")){
                    Intent intent = new Intent(mContext, Linha125.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("126 - Eldorado / Jardim América")){
                    Intent intent = new Intent(mContext, Linha126.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("129 - Previdenciários")){
                    Intent intent = new Intent(mContext, Linha129.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("130 - Bandeirantes / Via Garganta do Dilermando / Alto São Geraldo")){
                    Intent intent = new Intent(mContext, Linha130.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("131 - Bandeirantes / São Geraldo")){
                    Intent intent = new Intent(mContext, Linha131.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("132 - Bandeirantes / Ipiranga")){
                    Intent intent = new Intent(mContext, Linha132.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("133 - Bandeirantes / Ipiranga / Arco-irís")){
                    Intent intent = new Intent(mContext, Linha133.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("134 - Bandeirantes / Santa Efigênia")){
                    Intent intent = new Intent(mContext, Linha134.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("135 - Parque Guarani / Sagrado Coração de Jesus")){
                    Intent intent = new Intent(mContext, Linha135.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("136 - Bandeirantes / Via Garganta do Dilermando / Santa Efigênia")){
                    Intent intent = new Intent(mContext, Linha136.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("137 - Sagrado Coração de Jesus / Manoel Honório")){
                    Intent intent = new Intent(mContext, Linha137.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("140 - Santa Efigênia / Manoel Honório")){
                    Intent intent = new Intent(mContext, Linha140.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("141 - Bandeirantes / Bela Aurora")){
                    Intent intent = new Intent(mContext, Linha141.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("142 - Bandeirantes / Bela Aurora")){
                    Intent intent = new Intent(mContext, Linha142.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("143 - Bela Aurora / Centro")){
                    Intent intent = new Intent(mContext, Linha143.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("145  - Centenário / Santa Efigênia")){
                    Intent intent = new Intent(mContext, Linha145.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("150 - Grama")){
                    Intent intent = new Intent(mContext, Linha150.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("155 - Jardim Emaús")){
                    Intent intent = new Intent(mContext, Linha155.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("190 - Zona Sul / UFJF / CAS")){
                    Intent intent = new Intent(mContext, Linha190.class);
                    mContext.startActivity(intent);
                }

                // Linhas 200

                if (modellist.get(postition).getTitle().equals("201 - Progresso")){
                    Intent intent = new Intent(mContext, Linha201.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("202 - Progresso")){
                    Intent intent = new Intent(mContext, Linha202.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("203 - Marumbi")){
                    Intent intent = new Intent(mContext, Linha203.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("204 - Santa Paula")){
                    Intent intent = new Intent(mContext, Linha204.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("205 - Santa Paula")){
                    Intent intent = new Intent(mContext, Linha205.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("206 - Borborema")){
                    Intent intent = new Intent(mContext, Linha206.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("207 - Marumbi")){
                    Intent intent = new Intent(mContext, Linha207.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("208 - Progresso")){
                    Intent intent = new Intent(mContext, Linha208.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("209 - Marumbi")){
                    Intent intent = new Intent(mContext, Linha209.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("210 - Santa Paula")){
                    Intent intent = new Intent(mContext, Linha210.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("211 - Rio Branco")){
                    Intent intent = new Intent(mContext, Linha211.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("213 - Bairu / Cruzeiro do Sul")){
                    Intent intent = new Intent(mContext, Linha213.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("214 - Bairu / Cruzeiro do Sul")){
                    Intent intent = new Intent(mContext, Linha214.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("215 - Bairu / Cruzeiro do Sul")){
                    Intent intent = new Intent(mContext, Linha215.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("216 - Bairu / Boa Vista")){
                    Intent intent = new Intent(mContext, Linha216.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("218 - Graminha")){
                    Intent intent = new Intent(mContext, Linha218.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("220 - Bom Pastor")){
                    Intent intent = new Intent(mContext, Linha220.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("221 - Bom Pastor / Santa Catarina")){
                    Intent intent = new Intent(mContext, linha221.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("222 - Bom Pastor / Santa Catarina")){
                    Intent intent = new Intent(mContext, Linha222.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("226 - Guaruá / Bairu")){
                    Intent intent = new Intent(mContext, Linha226.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("230 - Santa Paula")){
                    Intent intent = new Intent(mContext, Linha230.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("231 - Progresso")){
                    Intent intent = new Intent(mContext, Linha231.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("232 - Bonfim / Via Av. Brasil")){
                    Intent intent = new Intent(mContext, Linha232.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("233 - Marumbi")){
                    Intent intent = new Intent(mContext, Linha233.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("239 - Progresso / Av. Rio Branco")){
                    Intent intent = new Intent(mContext, Linha239.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("249 - Marumbi / Av. Rio Branco")){
                    Intent intent = new Intent(mContext, Linha249.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("259 - Santa Paula / Av. Rio Branco")){
                    Intent intent = new Intent(mContext, Linha259.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("299 - Alto Bairu / Cruzeiro do Sul")){
                    Intent intent = new Intent(mContext, Linha299.class);
                    mContext.startActivity(intent);
                }

                // Linhas 300
                if (modellist.get(postition).getTitle().equals("301 - Usina Quatro")){
                    Intent intent = new Intent(mContext, Linha301.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("302 - Floresta")){
                    Intent intent = new Intent(mContext, Linha302.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("303 - Jardim Esperança")){
                    Intent intent = new Intent(mContext, Linha303.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("304 - Caeté")){
                    Intent intent = new Intent(mContext, linha304.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("305 - Jardim Esperança")){
                    Intent intent = new Intent(mContext, Linha305.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("306 - Retiro")){
                    Intent intent = new Intent(mContext, Linha306.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("307 - Retiro / Floresta")){
                    Intent intent = new Intent(mContext, Linha307.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("308 - Retiro")){
                    Intent intent = new Intent(mContext, Linha308.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("309 - Terras Altas")){
                    Intent intent = new Intent(mContext, Linha309.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("311 - Santa Tereza")){
                    Intent intent = new Intent(mContext, Linha311.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("313 - Sarandira")){
                    Intent intent = new Intent(mContext, Linha313.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("315 - Jardim Esperança")){
                    Intent intent = new Intent(mContext, Linha315.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("321 - Vila Ozanan")){
                    Intent intent = new Intent(mContext, Linha321.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("322 - Furtado de Menezes")){
                    Intent intent = new Intent(mContext, Linha322.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("325 - Solidariedade")){
                    Intent intent = new Intent(mContext, Linha325.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("326 - Solidariedade / Via Vila Ideal")){
                    Intent intent = new Intent(mContext, Linha326.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("331 - Vila Ideal")){
                    Intent intent = new Intent(mContext, Linha331.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("332 - Vila Ideal")){
                    Intent intent = new Intent(mContext, Linha332.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("333 - Granjas Primavera")){
                    Intent intent = new Intent(mContext, Linha333.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("335 - Granjas Bethel")){
                    Intent intent = new Intent(mContext, Linha335.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("399 - Olavo Costa")){
                    Intent intent = new Intent(mContext, Linha399.class);
                    mContext.startActivity(intent);
                }

                // Linhas 400
                if (modellist.get(postition).getTitle().equals("400 - Alto Grajaú")){
                    Intent intent = new Intent(mContext, Linha400.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("402 - Alto Grajaú")){
                    Intent intent = new Intent(mContext, Linha402.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("403 - Nossa Senhora Aparecida")){
                    Intent intent = new Intent(mContext, Linha403.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("404 - Santa Rita")){
                    Intent intent = new Intent(mContext, Linha404.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("405 - Santa Rita / Alto Três Moinhos")){
                    Intent intent = new Intent(mContext, Linha405.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("406 - Santa Rita / Sr Nenêm")){
                    Intent intent = new Intent(mContext, Linha406.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("407 - Nossa Senhora Aparecida")){
                    Intent intent = new Intent(mContext, Linha407.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("411 - Vitorino Braga")){
                    Intent intent = new Intent(mContext, Linha411.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("412 - Parque Burnier")){
                    Intent intent = new Intent(mContext, Linha412.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("413 - Bom Jardim")){
                    Intent intent = new Intent(mContext, Linha413.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("415 - Linhares / Via Vale dos Peões")){
                    Intent intent = new Intent(mContext, Linha415.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("416 - Linhares")){
                    Intent intent = new Intent(mContext, Linha416.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("420 - Linhares")){
                    Intent intent = new Intent(mContext, Linha420.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("422 - Santa Cândida")){
                    Intent intent = new Intent(mContext, Linha422.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("423 - Bom Jardim")){
                    Intent intent = new Intent(mContext, Linha423.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("424 - Aracy")){
                    Intent intent = new Intent(mContext, Linha424.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("425 - Linhares")){
                    Intent intent = new Intent(mContext, Linha425.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("426 - Grajaú")){
                    Intent intent = new Intent(mContext, Linha426.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("427 - Linhares")){
                    Intent intent = new Intent(mContext, Linha427.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("428 - Linhares / Fazenda Yung")){
                    Intent intent = new Intent(mContext, Linha428.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("429 - Linhares")){
                    Intent intent = new Intent(mContext, Linha429.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("430 - São Sebastião / Via Bonsucesso")){
                    Intent intent = new Intent(mContext, Linha430.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("431 - São Benedito")){
                    Intent intent = new Intent(mContext, Linha431.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("432 - São Benedito")){
                    Intent intent = new Intent(mContext, Linha432.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("433 - Vila Alpina")){
                    Intent intent = new Intent(mContext, Linha433.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("434 - Vila Alpina")){
                    Intent intent = new Intent(mContext, linha434.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("435 - Linhares")){
                    Intent intent = new Intent(mContext, Linha435.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("436 - Linhares")){
                    Intent intent = new Intent(mContext, Linha436.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("437 - São Bernardo")){
                    Intent intent = new Intent(mContext, Linha437.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("438 - Parque Serra Verde")){
                    Intent intent = new Intent(mContext, Linha438.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("439 - Santo Antônio")){
                    Intent intent = new Intent(mContext, Linha439.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("440 - Santo Antônio")){
                    Intent intent = new Intent(mContext, Linha440.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("441 - Santo Antônio")){
                    Intent intent = new Intent(mContext, Linha441.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("443 - Nossa Senhora de Lourdes")){
                    Intent intent = new Intent(mContext, linha443.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("444 - Nossa Senhora de Lourdes")){
                    Intent intent = new Intent(mContext, Linha444.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("445 - Nossa Senhora de Lourdes")){
                    Intent intent = new Intent(mContext, Linha445.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("447 - Nossa Senhora de Lourdes")){
                    Intent intent = new Intent(mContext, Linha447.class);
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("499 - Linhares / Santo Antônio")){
                    Intent intent = new Intent(mContext, Linha499.class);
                    mContext.startActivity(intent);
                }

                //Linhas 500

                if (modellist.get(postition).getTitle().equals("501 - Padre Café / Jardim Glória")){
                    Intent intent = new Intent(mContext, Linha501.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("503 - Paineras")){
                    Intent intent = new Intent(mContext, Linha503.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("505 - Morro do Cristo")){
                    Intent intent = new Intent(mContext, Linha505.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("508 - Avenida Deusdedith Salgado")){
                    Intent intent = new Intent(mContext, Linha508.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("509 - Alto Dom Bosco / Laranjeiras")){
                    Intent intent = new Intent(mContext, Linha509.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("510 - Dom Bosco")){
                    Intent intent = new Intent(mContext, Linha510.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("511 - Dom Bosco / Borboleta")){
                    Intent intent = new Intent(mContext, Linha511.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("512 - Dom Bosco / Borboleta")){
                    Intent intent = new Intent(mContext, Linha512.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("514 - Cascatinha / Borboleta")){
                    Intent intent = new Intent(mContext, Linha514.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("515 - Dom Orione")){
                    Intent intent = new Intent(mContext, Linha515.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("516 - São Pedro / Via Borboleta")){
                    Intent intent = new Intent(mContext, Linha516.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("518 - Salvaterra")){
                    Intent intent = new Intent(mContext, Linha518.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("519 - Torreões")){
                    Intent intent = new Intent(mContext, Linha519.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("520 - Aeroporto")){
                    Intent intent = new Intent(mContext, Linha520.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("521 - Teixeiras")){
                    Intent intent = new Intent(mContext, Linha521.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("522 - Teixeiras")){
                    Intent intent = new Intent(mContext, Linha522.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("523 - Monte Verde")){
                    Intent intent = new Intent(mContext, Linha523.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("524 - São Mateus")){
                    Intent intent = new Intent(mContext, Linha524.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("525 - Universidade (UFJF)")){
                    Intent intent = new Intent(mContext, Linha525.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("526 - Cascatinha / Vale do Ipê")){
                    Intent intent = new Intent(mContext, Linha526.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("527 - Santa Cecília")){
                    Intent intent = new Intent(mContext, Linha527.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("528 - Cascatinha / Borboleta")){
                    Intent intent = new Intent(mContext, Linha528.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("529 - Torreões / Via Mascate / Monte Verde")){
                    Intent intent = new Intent(mContext, Linha529.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("530 - São Pedro")){
                    Intent intent = new Intent(mContext, Linha530.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("531 - Nova Califórnia")){
                    Intent intent = new Intent(mContext, Linha531.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("532 - São Pedro / Via Caiçaras")){
                    Intent intent = new Intent(mContext, Linha532.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("533 - São Pedro")){
                    Intent intent = new Intent(mContext, Linha533.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("534 - Santos Dumont")){
                    Intent intent = new Intent(mContext, Linha534.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("535 - Universidade (UFJF)")){
                    Intent intent = new Intent(mContext, Linha535.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("537 - Jardim da Serra")){
                    Intent intent = new Intent(mContext, Linha537.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("538 - Morada do Serro / Via Jardim Casa Blanca / Adolpho Vireque")){
                    Intent intent = new Intent(mContext, Linha538.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("539 - Santos Dumont")){
                    Intent intent = new Intent(mContext, Linha539.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("540 - São Pedro")){
                    Intent intent = new Intent(mContext, Linha540.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("541 - São Pedro")){
                    Intent intent = new Intent(mContext, Linha541.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("542 - Lagoa")){
                    Intent intent = new Intent(mContext, Linha542.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("543 - Santa Córdula")){
                    Intent intent = new Intent(mContext, Linha543.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("544 - Recanto dos Brugger")){
                    Intent intent = new Intent(mContext, Linha544.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("545 - Universidade (UFJF)")){
                    Intent intent = new Intent(mContext, Linha545.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("546 - Mirante")){
                    Intent intent = new Intent(mContext, Linha546.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("547 - Nossa Senhora de Fátima")){
                    Intent intent = new Intent(mContext, Linha547.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("548 - Adolpho Vireque / Via Jardim Casa Blanca / Morada do Serro")){
                    Intent intent = new Intent(mContext, Linha548.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("549 - Nova Germânia")){
                    Intent intent = new Intent(mContext, Linha549.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("555 - Universidade (UFJF)")){
                    Intent intent = new Intent(mContext, Linha555.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("560 - Av. Presidente Itamar Franco / Via Shopping")){
                    Intent intent = new Intent(mContext, Linha560.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("590 - Zona Sul / UFJF / CAS")){
                    Intent intent = new Intent(mContext, Linha590.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("599 - São Pedro")){
                    Intent intent = new Intent(mContext, Linha599.class);
                    mContext.startActivity(intent);
                }

                //Linhas 600

                if (modellist.get(postition).getTitle().equals("600 - Monte Castelo / Via Jardim São João")){
                    Intent intent = new Intent(mContext, Linha600.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("601 - Jardim Cachoeira / Via Monte Castelo")){
                    Intent intent = new Intent(mContext, Linha601.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("602 - Monte Castelo")){
                    Intent intent = new Intent(mContext, Linha602.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("603 - Carlos Chagas")){
                    Intent intent = new Intent(mContext, Linha603.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("604 - Bairro Industrial")){
                    Intent intent = new Intent(mContext, Linha604.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("605 - Milho Branco")){
                    Intent intent = new Intent(mContext, Linha605.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("606 - Jardim Natal")){
                    Intent intent = new Intent(mContext, Linha606.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("607 - Jardim Natal")){
                    Intent intent = new Intent(mContext, Linha607.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("608 - Milho Branco")){
                    Intent intent = new Intent(mContext, Linha608.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("609 - Milho Branco")){
                    Intent intent = new Intent(mContext, Linha609.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("610 - Amazônia")){
                    Intent intent = new Intent(mContext, Linha610.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("611 - Esplanada / Granbery")){
                    Intent intent = new Intent(mContext, Linha611.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("612 - Esplanada / Granbery")){
                    Intent intent = new Intent(mContext, Linha612.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("613 - Francisco Bernardino")){
                    Intent intent = new Intent(mContext, Linha613.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("614 - Jardim Natal")){
                    Intent intent = new Intent(mContext, Linha614.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("615 - Encosta do Sol")){
                    Intent intent = new Intent(mContext, Linha615.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("616 - Jardim Natal")){
                    Intent intent = new Intent(mContext, Linha616.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("620 - Francisco Bernardino / Via Fontes Ville")){
                    Intent intent = new Intent(mContext, Linha620.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("621 - Democrata")){
                    Intent intent = new Intent(mContext, Linha621.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("626 - Jardim Natal / Av. Rio Branco")){
                    Intent intent = new Intent(mContext, Linha626.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("630 - Rodoviária")){
                    Intent intent = new Intent(mContext, Linha630.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("636 - Jardim Cachoeira / Av. Rio Branco")){
                    Intent intent = new Intent(mContext, Linha636.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("640 - Rodoviária")){
                    Intent intent = new Intent(mContext, Linha640.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("646 - Milho Branco / Av. Rio Branco")){
                    Intent intent = new Intent(mContext, Linha646.class);
                    mContext.startActivity(intent);
                }


                //Linhas 700

                if (modellist.get(postition).getTitle().equals("700 - Barbosa Lage")){
                    Intent intent = new Intent(mContext, Linha700.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("701 - Jóquei Clube")){
                    Intent intent = new Intent(mContext, Linha701.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("702 - Jóquei Clube")){
                    Intent intent = new Intent(mContext, Linha702.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("703 - Barbosa Lage / Santa Amélia")){
                    Intent intent = new Intent(mContext, Linha703.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("704 - Jóquei Clube III")){
                    Intent intent = new Intent(mContext, Linha704.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("705 - Jóquei Clube III")){
                    Intent intent = new Intent(mContext, Linha705.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("706 - Cidade do Sol")){
                    Intent intent = new Intent(mContext, Linha706.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("707 - Cidade do Sol")){
                    Intent intent = new Intent(mContext, Linha707.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("708 - Vale dos Lírios")){
                    Intent intent = new Intent(mContext, Linha708.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("709 - Jóquei Clube")){
                    Intent intent = new Intent(mContext, Linha709.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("710 - Novo Triunfo")){
                    Intent intent = new Intent(mContext, Linha710.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("711 - Barreira")){
                    Intent intent = new Intent(mContext, Linha711.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("712 - Dias Tavares")){
                    Intent intent = new Intent(mContext, Linha712.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("13 - Náutico")){
                    Intent intent = new Intent(mContext, Linha713.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("714 - Chapéu D Uvas")){
                    Intent intent = new Intent(mContext, Linha714.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("715 - Vila Esperança I")){
                    Intent intent = new Intent(mContext, Linha715.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("716 - Distrito Industrial")){
                    Intent intent = new Intent(mContext, Linha716.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("717 - Benfica")){
                    Intent intent = new Intent(mContext, Linha717.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("718 - Ponte Preta")){
                    Intent intent = new Intent(mContext, Linha718.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("719 - Nova Era / Centro")){
                    Intent intent = new Intent(mContext, Linha719.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("720 - Santa Lúcia")){
                    Intent intent = new Intent(mContext, Linha720.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("721 - Nova Era")){
                    Intent intent = new Intent(mContext, Linha721.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("722 - Santa Cruz")){
                    Intent intent = new Intent(mContext, Linha722.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("723 - São Judas Tadeu")){
                    Intent intent = new Intent(mContext, Linha723.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("724 - Santa Lúcia / Distrito Industrial (Circular)")){
                    Intent intent = new Intent(mContext, Linha724.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("725 - São Judas Tadeu")){
                    Intent intent = new Intent(mContext, Linha725.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("726 - Igrejinha")){
                    Intent intent = new Intent(mContext, Linha726.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("727 - Bairro Araújo")){
                    Intent intent = new Intent(mContext, Linha727.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("728 - Nova Benfica")){
                    Intent intent = new Intent(mContext, Linha728.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("729 - Paula Lima")){
                    Intent intent = new Intent(mContext, Linha729.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("730 - Santa Lúcia")){
                    Intent intent = new Intent(mContext, Linha730.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("731 - BR 040")){
                    Intent intent = new Intent(mContext, Linha731.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("732 - Santa Cruz")){
                    Intent intent = new Intent(mContext, Linha732.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("733 - Santa Cruz / Via São Damião")){
                    Intent intent = new Intent(mContext, Linha733.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("734 - Cidade do Sol / Santa Maria")){
                    Intent intent = new Intent(mContext, Linha734.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("735 - Vila Esperança II")){
                    Intent intent = new Intent(mContext, Linha735.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("736 - Nova Benfica")){
                    Intent intent = new Intent(mContext, Linha736.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("737 - Jóquei Clube")){
                    Intent intent = new Intent(mContext, Linha737.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("738 - Pedra Branca")){
                    Intent intent = new Intent(mContext, Linha738.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("739 - Nova Era")){
                    Intent intent = new Intent(mContext, Linha739.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("740 - Humaitá")){
                    Intent intent = new Intent(mContext, Linha740.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("741 - Valadares")){
                    Intent intent = new Intent(mContext, Linha741.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("742 - Rosário de Minas")){
                    Intent intent = new Intent(mContext, Linha742.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("743 - Toledos")){
                    Intent intent = new Intent(mContext, Linha743.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("744 - Palmital")){
                    Intent intent = new Intent(mContext, Linha744.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("745 - Rosário de Minas")){
                    Intent intent = new Intent(mContext, Linha745.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("746 - Circular BR 267")){
                    Intent intent = new Intent(mContext, Linha746.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("747 - São Judas Tadeu")){
                    Intent intent = new Intent(mContext, Linha747.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("748 - Alto Santa Cruz")){
                    Intent intent = new Intent(mContext, Linha748.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("749 - São Judas Tadeu")){
                    Intent intent = new Intent(mContext, Linha749.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("751 - Santa Cruz / Via Jardim Alfineiros / Santa Clara")){
                    Intent intent = new Intent(mContext, Linha751.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("752 - Penido")){
                    Intent intent = new Intent(mContext, Linha752.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("753 - Miguel Marinho")){
                    Intent intent = new Intent(mContext, Linha753.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("754 - CIRCULAR BENFICA / SENAI-VIA BR 040")){
                    Intent intent = new Intent(mContext, Linha754.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("755 - Zona Norte / UFJF")){
                    Intent intent = new Intent(mContext, Linha755.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("757 - Benfica / Jardim Bom Jesus")){
                    Intent intent = new Intent(mContext, Linha757.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("758 - Novo Triunfo II")){
                    Intent intent = new Intent(mContext, Linha758.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("760 - Humaitá")){
                    Intent intent = new Intent(mContext, Linha760.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("766 - Zona Norte / Av. Rio Branco")){
                    Intent intent = new Intent(mContext, Linha766.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("767 - Benfica / Bela Vista")){
                    Intent intent = new Intent(mContext, Linha767.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("775 - Santa Cruz / Via Av. Brasil")){
                    Intent intent = new Intent(mContext, Linha775.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("785 - Benfica / Via Av. Brasil")){
                    Intent intent = new Intent(mContext, Linha785.class);
                    mContext.startActivity(intent);
                }
            }
        });


        return view;
    }

    //filtro

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}