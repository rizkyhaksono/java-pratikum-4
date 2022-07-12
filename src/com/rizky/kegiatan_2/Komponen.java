package com.rizky.kegiatan_2;

public class Komponen {
    private String memori;
    private Laptop laptop;

    Komponen(String memori, Laptop laptop) {
        this.memori = memori;
        this.laptop = laptop;
    }

    public String getMemori() {
        return this.memori;
    }

    // has-a
    public Laptop getLaptop() {
        return laptop;
    }
}
