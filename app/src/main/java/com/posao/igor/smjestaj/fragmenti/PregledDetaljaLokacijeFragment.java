package com.posao.igor.smjestaj.fragmenti;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.posao.igor.smjestaj.ILokacija;
import com.posao.igor.smjestaj.R;
import com.posao.igor.smjestaj.podaci.Lokacija;
import com.squareup.picasso.Picasso;

/**
 * Created by igor on 23.11.2015..
 */
public class PregledDetaljaLokacijeFragment extends Fragment {

    public static final String TAG = "PregledDetaljaLokacije";

    Lokacija lokacija;
    public  PregledDetaljaLokacijeFragment (Lokacija lokacija) { this.lokacija = lokacija; }

    ImageView ivOpisVelikaSlika;
    ImageView ivMalaSlika1;
    ImageView ivMalaSlika2;
    ImageView ivMalaSlika3;

    RatingBar rbOcjena;
    TextView tvNaziv;
    TextView tvAdresa;
    TextView tvPostanskiBr;
    TextView tvGrad;
    TextView tvOpis;

    ILokacija iLokacija;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
/*        ActionBar ab = activity.getActionBar();
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle(lokacija.getNaziv());*/
        this.iLokacija = (ILokacija) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.lokacija_pregled_detalja,container,false);

        this.ivOpisVelikaSlika = (ImageView) view.findViewById(R.id.ivOpisVelikaSlika);
        this.ivMalaSlika1 = (ImageView) view.findViewById(R.id.ivMalaSlika1);
        this.ivMalaSlika2 = (ImageView) view.findViewById(R.id.ivMalaSlika2);
        this.ivMalaSlika3 = (ImageView) view.findViewById(R.id.ivMalaSlika3);
        this.rbOcjena = (RatingBar) view.findViewById(R.id.rbOcjena);
        this.tvNaziv = (TextView) view.findViewById(R.id.tvNaziv);
        this.tvAdresa = (TextView) view.findViewById(R.id.tvAdresa);
        this.tvPostanskiBr = (TextView) view.findViewById(R.id.tvPostanskiBr);
        this.tvGrad = (TextView) view.findViewById(R.id.tvGrad);
        this.tvOpis = (TextView) view.findViewById(R.id.tvOpis);

        if (this.lokacija.getNaziv() != null)
            this.tvNaziv.setText(this.lokacija.getNaziv());
        if (this.lokacija.getAdresa() != null)
            this.tvAdresa.setText(this.lokacija.getAdresa());
        if (this.lokacija.getPostanskiBr() != null)
            this.tvPostanskiBr.setText(this.lokacija.getPostanskiBr().toString());
        if (this.lokacija.getGrad() != null)
            this.tvGrad.setText(this.lokacija.getGrad());
        if (this.lokacija.getOpis() != null)
            this.tvOpis.setText(this.lokacija.getOpis());

        if (this.lokacija.getOcjena() != null)
            this.rbOcjena.setRating(this.lokacija.getOcjena());

        if (this.lokacija.getSlikaUrl1() != null){
            Picasso.with(getActivity())
                    .load(lokacija.getSlikaUrl1())
                    .fit()
                    .into(ivOpisVelikaSlika);
        }

        ivOpisVelikaSlika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iLokacija.prikaziSlikeLokacije(lokacija, lokacija.getSlikaUrl1());
            }
        });

        if (this.lokacija.getSlikaUrl2() != null){
            Picasso.with(getActivity())
                    .load(lokacija.getSlikaUrl2())
                    .noFade()
                    .fit()
                    .into(ivMalaSlika1);
        }

        ivMalaSlika1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iLokacija.prikaziSlikeLokacije(lokacija, lokacija.getSlikaUrl2());
            }
        });

        if (this.lokacija.getSlikaUrl3() != null){

            Picasso.with(getActivity())
                    .load(lokacija.getSlikaUrl3())
                    .noFade()
                    .fit()
                    .into(ivMalaSlika2);
        }

        ivMalaSlika2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iLokacija.prikaziSlikeLokacije(lokacija, lokacija.getSlikaUrl3());
            }
        });

        if (this.lokacija.getSlikaUrl4() != null) {

            Picasso.with(getActivity())
                    .load(lokacija.getSlikaUrl4())
                    .noFade()
                    .fit()
                    .into(ivMalaSlika3);
        }

        ivMalaSlika3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iLokacija.prikaziSlikeLokacije(lokacija, lokacija.getSlikaUrl4());
            }
        });


        return view;

    }


}
