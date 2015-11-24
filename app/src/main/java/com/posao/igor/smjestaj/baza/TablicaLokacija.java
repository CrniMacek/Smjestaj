package com.posao.igor.smjestaj.baza;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.posao.igor.smjestaj.podaci.ListLokacija;
import com.posao.igor.smjestaj.podaci.Lokacija;

/**
 * Created by igor on 23.11.2015..
 */
public class TablicaLokacija {

    public static final String NAZIV_TABLICE = "Lokacija";
    public static final String ID = "ID";
    public static final String NAZIV = "Naziv";
    public static final String ADRESA = "Adresa";
    public static final String POSTANSKIBR = "PostanskiBr";
    public static final String GRAD = "Grad";
    public static final String OPIS = "Opis";
    public static final String OCJENA = "Ocjena";
    public static final String SLIKA1URL = "Slika1URL";
    public static final String SLIKA2URL = "Slika2URL";
    public static final String SLIKA3URL = "Slika3URL";
    public static final String SLIKA4URL = "Slika4URL";

    SQLiteDatabase db;

    public TablicaLokacija(SQLiteDatabase db) {
        this.db = db;
    }

    public ListLokacija SelectAll() {

        return this.select(null);
    }

    public Lokacija Select (int id) {

        Lokacija lokacija = null;

        ListLokacija lokacije = this.select(String.valueOf(id));
        if (lokacije.size() == 1)
            lokacija = lokacije.get(0);

        return lokacija;
    }

    private ListLokacija select (String id) {

        String[] kolone = new String[]{ID, NAZIV, ADRESA, POSTANSKIBR, GRAD, OPIS, OCJENA, SLIKA1URL, SLIKA2URL, SLIKA3URL, SLIKA4URL};

        String where = null;
        String[] whereArgs = null;
        if ( id != null) {

            where = ID + "?";
            whereArgs = new String[]{id};
        }

        Cursor cursor = this.db.query(NAZIV_TABLICE, kolone, where, whereArgs, null, null, null);

        ListLokacija lista = new ListLokacija();

        while(cursor.moveToNext()) {

            Lokacija lokacija = new Lokacija();

            lokacija.setId(cursor.getInt(cursor.getColumnIndex(ID)));
            lokacija.setNaziv(cursor.getString(cursor.getColumnIndex(NAZIV)));
            lokacija.setAdresa(cursor.getString(cursor.getColumnIndex(ADRESA)));
            lokacija.setPostanskiBr(cursor.getInt(cursor.getColumnIndex(POSTANSKIBR)));
            lokacija.setGrad(cursor.getString(cursor.getColumnIndex(GRAD)));
            lokacija.setOpis(cursor.getString(cursor.getColumnIndex(OPIS)));
            lokacija.setOcjena(cursor.getInt(cursor.getColumnIndex(OCJENA)));
            lokacija.setSlikaUrl1(cursor.getString(cursor.getColumnIndex(SLIKA1URL)));
            lokacija.setSlikaUrl2(cursor.getString(cursor.getColumnIndex(SLIKA2URL)));
            lokacija.setSlikaUrl3(cursor.getString(cursor.getColumnIndex(SLIKA3URL)));
            lokacija.setSlikaUrl4(cursor.getString(cursor.getColumnIndex(SLIKA4URL)));

            lista.add(lokacija);
        }

        return lista;
    }
}
