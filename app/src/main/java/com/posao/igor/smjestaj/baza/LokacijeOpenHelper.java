package com.posao.igor.smjestaj.baza;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.posao.igor.smjestaj.R;

/**
 * Created by igor on 23.11.2015..
 */
public class LokacijeOpenHelper extends SQLiteOpenHelper {

    Context context;

    public LokacijeOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context = context;
    }

    private void pripremiPodatke(SQLiteDatabase db) {

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Hotel Jadran', 'Vlaška 50', '10000', 'Zagreb','Hotel Jadran smješten je u samom srcu Zagreba, a nudi jednostavan i" +
                "brz pristup svim znamenitostima i atrakcijama u središtu grada.','3', 'http://q-ec.bstatic.com/images/hotel/max400/558/55843404.jpg'" +
                ", 'http://r-ec.bstatic.com/images/hotel/840x460/558/55843449.jpg', 'http://r-ec.bstatic.com/images/hotel/840x460/151/15179355.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/152/15271980.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Hostel Day and Night', 'Kneza Mislava 1', '10000', 'Zagreb','Hostel Day and Night smješten je u samom središtu Zagreba, " +
                "samo nekoliko koraka od tramvajskog stajališta i od glavnog željezničkog kolodvora. " +
                "Glavni trg i sve glavne znamenitosti su nekoliko minuta hoda.','2', " +
                "'http://r-ec.bstatic.com/images/hotel/max1024x768/115/11500174.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/max1024x768/106/10646951.jpg', " +
                "'http://q-ec.bstatic.com/images/hotel/max1024x768/115/11500173.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/max1024x768/106/10646493.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Centroom Apartments Zagreb', 'Ulica Nikole Tesle 16', '10000', 'Zagreb','Apartmani Centroom Zagreb imaju opremu za kuhanje," +
                " a smješteni su u povijesnoj zgradi u središtu grada. " +
                "Objekt je udaljen 300 metara od Ilice i 5 minuta hoda od Trga bana Jelačića. " +
                "Na raspolaganju je besplatni WiFi.','5', " +
                "'http://q-ec.bstatic.com/data/landmark/840x460/403/40382.jpg'," +
                "'http://r-ec.bstatic.com/images/hotel/840x460/447/44729741.jpg', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/316/31635630.jpg'," +
                "'http://q-ec.bstatic.com/data/landmark/840x460/304/30471.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Esplanade Zagreb Hotel', 'Mihanovićeva 1', '10000', 'Zagreb','Poznati hotel Esplanade Zagreb smješten je u centru Zagreba" +
                " i nudi prostrane i lijepo namještene sobe s besplatnim bežičnim pristupom internetu.','5', " +
                "'http://r-ec.bstatic.com/images/hotel/840x460/138/13875981.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/138/13888419.jpg', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/138/13881952.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/138/13875916.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Palace Hotel Zagreb', 'Square J.J.Strossmayer 10', '10000', 'Zagreb','Tradicionalan secesijski hotel Palace Zagreb" +
                " smješten je na izvrsnoj lokaciji u centru Zagreba, a nudi toplo, obiteljsko ozračje te izuzetno stručno i susretljivo osoblje.','5', " +
                "'http://r-ec.bstatic.com/images/hotel/840x460/269/26981495.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/269/26949257.jpg', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/387/38785176.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/378/37886736.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Hotel Dubrovnik', 'Ljudevita Gaja 1', '10000', 'Zagreb','Hostel Heart of the City s 4 zvjezdice smješten je u srcu grada Zagreba. " +
                "Obuhvaća terasu, bar i zalogajnicu, a nalazi se na samo 300 metara od Ilice','5', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/474/47441672.jpg'," +
                "'http://r-ec.bstatic.com/images/hotel/840x460/227/22721994.jpg', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/227/22721924.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/227/22721982.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Hostel Heart of the City', 'Vlaška 26', '10000', 'Zagreb','Hotel Dubrovnik, otvoren 1929. godine, smješten je na " +
                "glavnom zagrebačkom trgu u samom centru grada. Sve su obnovljene hotelske sobe i suitevi uređeni u tradicionalnom stilu, a " +
                "uključuju razne suvremene sadržaje.','2', " +
                "'http://r-ec.bstatic.com/images/hotel/840x460/453/45346109.jpg'," +
                "'http://r-ec.bstatic.com/images/hotel/840x460/329/32937034.jpg', " +
                "'http://r-ec.bstatic.com/data/landmark/840x460/334/33478.jpg'," +
                "'http://r-ec.bstatic.com/images/hotel/840x460/452/45259615.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Zg041 Apartment', 'Šulekova 41', '10000', 'Zagreb','Located 5 km from Zagreb Fair, Zg041 Apartment offers " +
                "pet-friendly accommodation in Zagreb. The apartment is 7 km from Zagreb Arena . " +
                "Free WiFi is featured throughout the property.','1', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/573/57399008.jpg'," +
                "'http://r-ec.bstatic.com/images/hotel/840x460/573/57398989.jpg', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/573/57399020.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/573/57399000.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('Apartments Goodbed Zagreb', 'Radoslava Cimermana 74b', '10000', 'Zagreb','Apartmani Goodbed Zagreb nalaze se u Zagrebu i uključuju besplatni WiFi. " +
                "Zagrebački Velesajam udaljen je 500 metara. " +
                "U okviru objekta na raspolaganju je besplatno privatno parkiralište.','4', " +
                "'http://r-ec.bstatic.com/images/hotel/840x460/497/49732304.jpg'," +
                "'http://r-ec.bstatic.com/images/hotel/840x460/497/49732328.jpg', " +
                "'http://q-ec.bstatic.com/images/hotel/840x460/497/49732407.jpg'," +
                "'http://r-ec.bstatic.com/images/hotel/840x460/497/49732322.jpg')");

        db.execSQL("INSERT INTO Lokacija (Naziv, Adresa, PostanskiBr, Grad, Opis, Ocjena, Slika1URL, Slika2URL, Slika3URL, Slika4URL) " +
                "VALUES ('ZigZag Zagreb', 'Petrinjska 9', '10000', 'Zagreb','Apartmani Zig Zag nalaze se u središtu Zagreba, na približno 100 metara od glavnog trga." +
                " Svi moderno uređeni apartmani i sobe uključuju klima-uređaj te besplatni WiFi.','4', " +
                "'http://r-ec.bstatic.com/images/hotel/840x460/279/27922879.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/485/48537627.jpg', " +
                "'http://r-ec.bstatic.com/images/hotel/840x460/203/20381821.jpg'," +
                "'http://q-ec.bstatic.com/images/hotel/840x460/279/27923463.jpg')");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(this.context.getResources().getString(R.string.kreiranje_lokacija));

        this.pripremiPodatke(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS Lokacija");
        this.onCreate(db);
    }
}
