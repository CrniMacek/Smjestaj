package com.posao.igor.smjestaj.podaci;

/**
 * Created by igor on 23.11.2015..
 */
public class Lokacija {

    private Integer id;
    private String naziv;
    private String adresa;
    private String grad;
    private Integer postanskiBr;
    private String opis;
    private Integer ocjena;

    private String slikaUrl1;
    private String slikaUrl2;
    private String slikaUrl3;
    private String slikaUrl4;

    public Lokacija() {
    }

    public Lokacija(Integer id, String naziv, String adresa, String grad, Integer postanskiBr,
                    String opis, Integer ocjena, String slikaUrl1, String slikaUrl2,
                    String slikaUrl3, String slikaUrl4) {
        this.id = id;
        this.naziv = naziv;
        this.adresa = adresa;
        this.grad = grad;
        this.postanskiBr = postanskiBr;
        this.opis = opis;
        this.ocjena = ocjena;
        this.slikaUrl1 = slikaUrl1;
        this.slikaUrl2 = slikaUrl2;
        this.slikaUrl3 = slikaUrl3;
        this.slikaUrl4 = slikaUrl4;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public Integer getPostanskiBr() {
        return postanskiBr;
    }

    public void setPostanskiBr(Integer postanskiBr) {
        this.postanskiBr = postanskiBr;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getOcjena() {
        return ocjena;
    }

    public void setOcjena(Integer ocjena) {
        this.ocjena = ocjena;
    }

    public String getSlikaUrl1() {
        return slikaUrl1;
    }

    public void setSlikaUrl1(String slikaUrl1) {
        this.slikaUrl1 = slikaUrl1;
    }

    public String getSlikaUrl2() {
        return slikaUrl2;
    }

    public void setSlikaUrl2(String slikaUrl2) {
        this.slikaUrl2 = slikaUrl2;
    }

    public String getSlikaUrl3() {
        return slikaUrl3;
    }

    public void setSlikaUrl3(String slikaUrl3) {
        this.slikaUrl3 = slikaUrl3;
    }

    public String getSlikaUrl4() {
        return slikaUrl4;
    }

    public void setSlikaUrl4(String slikaUrl4) {
        this.slikaUrl4 = slikaUrl4;
    }
}
