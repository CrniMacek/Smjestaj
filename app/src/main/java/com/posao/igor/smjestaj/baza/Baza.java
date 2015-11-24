package com.posao.igor.smjestaj.baza;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by igor on 23.11.2015..
 */
public class Baza {

    public static final int TRENUTNA_VERZIJA = 1;

    LokacijeOpenHelper openHelper;

    public Baza( Context context) {
        this.openHelper = new LokacijeOpenHelper(context, "lokacije.db", null, TRENUTNA_VERZIJA);
    }

    public SQLiteDatabase vratiBazu () {

        return this.openHelper.getWritableDatabase();
    }
}
