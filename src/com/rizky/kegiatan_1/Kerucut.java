package com.rizky.kegiatan_1;

import java.util.Scanner;

public class Kerucut extends BangunRuang {

    double phi = 22 / 7;
    double jariJari;
    double tinggi;
    double sisi;

    double luasPermukaan;
    double volume;

    Scanner input = new Scanner(System.in);

    public void setVolume() {
        System.out.print("Masukkan jari-jari kerucut: ");
        jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        tinggi = input.nextDouble();

        volume = (phi * jariJari * jariJari * tinggi) / 3;
        System.out.println("Volume kerucut: " + volume);
    }

    public void setLuasPermukaan() {
        System.out.print("Masukkan jari-jari kerucut: ");
        jariJari = input.nextDouble();
        System.out.print("Masukkan sisi kerucut: ");
        sisi = input.nextDouble();

        luasPermukaan = phi * jariJari * (jariJari + sisi);
        System.out.println("Volume kerucut: " + luasPermukaan);
    }

    @Override
    void getLuasPermukaan() {
        setLuasPermukaan();
    }

    @Override
    void getVolume() {
        setVolume();
    }
}