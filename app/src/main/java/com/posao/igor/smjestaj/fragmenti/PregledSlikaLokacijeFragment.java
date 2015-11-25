package com.posao.igor.smjestaj.fragmenti;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

import com.posao.igor.smjestaj.ILokacija;
import com.posao.igor.smjestaj.ImageAdapter;
import com.posao.igor.smjestaj.R;
import com.posao.igor.smjestaj.podaci.Lokacija;
import com.squareup.picasso.Picasso;

/**
 * Created by igor on 24.11.2015..
 */
public class PregledSlikaLokacijeFragment extends Fragment {

    public static final String TAG = "PregledSlikaLokacija";

    Gallery gallery;
    Lokacija lokacija;
    WebView webView;
    String prvaSlikaUrl;
    ILokacija iLokacija;

    public PregledSlikaLokacijeFragment() {
    }

    public PregledSlikaLokacijeFragment(Lokacija lokacija, String prvaSlikaUrl) {

        this.lokacija = lokacija;
        this.prvaSlikaUrl = prvaSlikaUrl;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
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

        View viewSlika = inflater.inflate(R.layout.slika_pregled,container,false);

        this.webView = (WebView) viewSlika.findViewById(R.id.image1);

        final String[] imageStrs = {
                lokacija.getSlikaUrl1(),
                lokacija.getSlikaUrl2(),
                lokacija.getSlikaUrl3(),
                lokacija.getSlikaUrl4()
        };

/*
        Picasso.with(getActivity())
                .load(prvaSlikaUrl)
                .noFade()
                .fit()
                .into(imageView);
*/
        this.webView.loadUrl(prvaSlikaUrl);

        this.gallery  = (Gallery) viewSlika.findViewById(R.id.gallery1);

        this.gallery.setAdapter(new ImageAdapter(viewSlika.getContext(), imageStrs));

        this.gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


/*                Picasso.with(parent.getContext())
                        .load(imageStrs[position])
                        .noFade()
                        .fit()
                        .into(imageView);*/

                webView.loadUrl(imageStrs[position]);
            }
        });

        return viewSlika;
    }
}
