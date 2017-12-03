package com.example.user.myrestaurant;

/**
 * Created by User on 03/12/2017.
 */

public class MenuData {

    private String namamenu, harga, gambar;

    public MenuData(String namamenu, String harga) {
        this.namamenu = namamenu;
        this.harga = harga;
    }

    public void setNamamenu(String namamenu) {
        this.namamenu = namamenu;
    }

    public String getNamamenu() {
        return namamenu;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getHarga() {
        return harga;
    }
}
