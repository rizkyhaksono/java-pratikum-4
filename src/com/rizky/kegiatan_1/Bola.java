package com.rizky.kegiatan_1;

import java.util.Scanner;

public class Bola extends BangunRuang {
    double phi = 22 / 7;
    double jariJari;
    double tinggi;

    double luasPermukaan;
    double volume;

    Scanner input = new Scanner(System.in);

    public void setVolume() {
        System.out.print("Masukkan jari-jari bola: ");
        jariJari = input.nextInt();

        volume = (phi * jariJari * jariJari * jariJari * 4) / 3;
    }

    public void setLuasPermukaan() {
        System.out.print("Masukkan jari-jari bola: ");
        jariJari = input.nextDouble();

        luasPermukaan = (phi * 4) * (jariJari * jariJari);
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
