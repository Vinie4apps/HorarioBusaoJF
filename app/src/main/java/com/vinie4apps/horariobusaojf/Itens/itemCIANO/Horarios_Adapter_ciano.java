package com.vinie4apps.horariobusaojf.Itens.itemCIANO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.viewpager.widget.PagerAdapter;

import com.vinie4apps.horariobusaojf.R;

import java.util.List;

public class Horarios_Adapter_ciano extends PagerAdapter {

    private List<Horarios_Model_ciano> models;
    private LayoutInflater layoutInflater;
    private Context context;

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};

    public Horarios_Adapter_ciano(List<Horarios_Model_ciano> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.itemciano, container, false);


        TextView sbairro, horariobairro, scentro, horaiocentro;


        sbairro = view.findViewById(R.id.sbairro);
        horariobairro = view.findViewById(R.id.horariobairro);

        scentro = view.findViewById(R.id.scentro);
        horaiocentro = view.findViewById(R.id.horariocentro);


        sbairro.setText(models.get(position).getSbairro());
        horariobairro.setText(models.get(position).getHoraiobairro());

        scentro.setText(models.get(position).getScentro());
        horaiocentro.setText(models.get(position).getHorariocentro());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(TAB_TITLES[position]);
    }
}