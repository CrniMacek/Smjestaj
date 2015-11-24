package com.posao.igor.smjestaj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.posao.igor.smjestaj.podaci.ListLokacija;
import com.posao.igor.smjestaj.podaci.Lokacija;
import com.squareup.picasso.Picasso;

/**
 * Created by igor on 23.11.2015..
 */
public class LokacijeAdapter extends ArrayAdapter<Lokacija> {

    LayoutInflater inflater;

    public LokacijeAdapter(Context context, int textViewResourceId, ListLokacija objects) {
        super(context, textViewResourceId, objects);
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Lokacija lokacija = this.getItem(position);

        if (convertView == null)
            convertView = this.inflater.inflate(R.layout.lokacija_stavka_liste, null);

        final Context context = this.inflater.getContext();

        ImageView ivLokacijaMalaSlika = (ImageView) convertView.findViewById(R.id.ivLokacijaMalaSlika);
        Picasso.with(context)
                .load(lokacija.getSlikaUrl1())
                .noFade()
                .fit()
                .into(ivLokacijaMalaSlika);

        TextView tvNaziv = (TextView) convertView.findViewById(R.id.tvNaziv);
        tvNaziv.setText(lokacija.getNaziv());
        TextView tvAdresa = (TextView) convertView.findViewById(R.id.tvAdresa);
        tvAdresa.setText(lokacija.getAdresa());
        TextView tvPostanskiBr = (TextView) convertView.findViewById(R.id.tvPostanskiBr);
        tvPostanskiBr.setText(lokacija.getPostanskiBr().toString());
        TextView tvGrad = (TextView) convertView.findViewById(R.id.tvGrad);
        tvGrad.setText(lokacija.getGrad());

        return convertView;

    }
}
