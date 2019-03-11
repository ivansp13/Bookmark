package com.example.bookmark;

public class Recycle {

    private String JudulBesar;
    private String JumlahAyat;
    private String WaktuPutar;
    private int icon;

    public Recycle() {
    }


    public Recycle(int icon, String judulBesar, String jumlahAyat, String waktuPutar) {
        this.icon = icon;
        JudulBesar = judulBesar;
        JumlahAyat = jumlahAyat;
        WaktuPutar = waktuPutar;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getJudulBesar() {
        return JudulBesar;
    }

    public String getJumlahAyat() {
        return JumlahAyat;
    }

    public String getWaktuPutar() {
        return WaktuPutar;
    }


    public void setJudulBesar(String judulBesar) {
        JudulBesar = judulBesar;
    }

    public void setJumlahAyat(String jumlahAyat) {
        JumlahAyat = jumlahAyat;
    }

    public void setWaktuPutar(String waktuPutar) {
        WaktuPutar = waktuPutar;
    }
}

