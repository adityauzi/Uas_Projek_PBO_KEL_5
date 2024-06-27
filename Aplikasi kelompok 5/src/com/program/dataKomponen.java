package com.program;

public class dataKomponen {

    private String judul;
    private String namaPengarang;
    private String penerbit;
    private int tahunTerbit;
    private String kategori;

    public dataKomponen(String judul, String namaPengarang, String penerbit,int tahunTerbit,String kategori){

        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;

    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }


}
