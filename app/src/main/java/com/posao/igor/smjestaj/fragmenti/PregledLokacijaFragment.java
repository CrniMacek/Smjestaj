package com.posao.igor.smjestaj.fragmenti;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.posao.igor.smjestaj.R;
import com.posao.igor.smjestaj.ILokacija;
import com.posao.igor.smjestaj.LokacijeAdapter;

/**
 * Created by igor on 23.11.2015..
 */
public class PregledLokacijaFragment extends Fragment{

    public static final String TAG = "PregledLokacija";
    ListView lvLokacije;
    LokacijeAdapter adapter;
    ILokacija iLokacija;

    public PregledLokacijaFragment() {
    }

    public PregledLokacijaFragment(LokacijeAdapter adapter) {
        this.adapter = adapter;
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
        ab.setDisplayHomeAsUpEnabled(false);
        ab.setTitle(R.string.app_name);*/
        this.iLokacija = (ILokacija) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.lokacija_pregled,container,false);

        this.lvLokacije = (ListView) view.findViewById(R.id.lvLokacije);

        this.lvLokacije.setAdapter(this.adapter);

        this.lvLokacije.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (lvLokacije.getCheckedItemPosition() == AdapterView.INVALID_POSITION)
                    return;

                /* Ovdje bih trebao ubaciti dio koda za savedInstanceState jer u bundle moram staviti
                 * ovu lokaciju koju saljem zbog landscape*/
                iLokacija.prikaziLokaciju(adapter.getItem(lvLokacije.getCheckedItemPosition()));
            }
        });

        return view;
    }
}
