package com.posao.igor.smjestaj;


import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.posao.igor.smjestaj.baza.Baza;
import com.posao.igor.smjestaj.baza.TablicaLokacija;
import com.posao.igor.smjestaj.fragmenti.PregledDetaljaLokacijeFragment;
import com.posao.igor.smjestaj.fragmenti.PregledLokacijaFragment;
import com.posao.igor.smjestaj.podaci.ListLokacija;
import com.posao.igor.smjestaj.podaci.Lokacija;

public class LokacijaActivity extends Activity implements ILokacija{

    LokacijeAdapter lokacijeAdapter;
    ListLokacija listLokacija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ActionBar actionBar = this.getActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(R.string.app_name);
        actionBar.show();

        Baza baza = new Baza(this);

        this.listLokacija = new TablicaLokacija(baza.vratiBazu()).SelectAll();
        this.lokacijeAdapter = new LokacijeAdapter(this, R.layout.lokacija_stavka_liste, this.listLokacija);

        FragmentManager fm = this.getFragmentManager();

        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.flFramenti, new PregledLokacijaFragment(this.lokacijeAdapter), PregledLokacijaFragment.TAG);
        transaction.commit();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, LokacijaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void prikaziLokaciju(Lokacija lokacija) {
        FragmentManager fm = this.getFragmentManager();

        FragmentTransaction transaction = fm.beginTransaction();

        transaction.replace(R.id.flFramenti, new PregledDetaljaLokacijeFragment(lokacija), PregledDetaljaLokacijeFragment.TAG);
        transaction.addToBackStack("");
        transaction.commit();
    }
}
