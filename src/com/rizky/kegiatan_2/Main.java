package com.rizky.kegiatan_2;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", "Omen 15", "Rp. 10.000.000");
        Komponen komponen1 = new Komponen("16 GB", laptop1);

        // has-a
        System.out.println("Merk Laptop\t: " + komponen1.getLaptop().getMerk());
        System.out.println("Tipe Laptop\t: " + komponen1.getLaptop().getTipe());

    }
}
