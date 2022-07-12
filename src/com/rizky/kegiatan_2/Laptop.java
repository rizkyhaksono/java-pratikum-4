package com.rizky.kegiatan_2;

public class Laptop {
    private String MerkLaptop;
    private String TipeLaptop;
    private String HargaLaptop;

    public Laptop(String MerkLaptop, String TipeLaptop, String HargaLaptop) {
        this.MerkLaptop = MerkLaptop;
        this.TipeLaptop = TipeLaptop;
        this.HargaLaptop = HargaLaptop;
    };

    public String getTipe() {
        return TipeLaptop;
    }

    public String getHarga() {
        return HargaLaptop;
    }

    public String getMerk() {
        return MerkLaptop;
    }

}