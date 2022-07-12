package com.rizky.kegiatan_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kerucut kerucut = new Kerucut();

        Scanner inputMenu = new Scanner(System.in);

        System.out.print("\nSelamat Datang\n");
        System.out.print("\n1. Kerucut");
        System.out.print("\n2. Bola");
        System.out.print("\n\nMasukkan menu: ");

        int menuAwal = inputMenu.nextInt();
        switch (menuAwal) {
            case 1:
                System.out.print("\nCalculator Kerucut\n");
                System.out.print("\n1. Luas Permukaan");
                System.out.print("\n2. Volume");
                System.out.print("\n\nMasukkan menu: ");

                int menuKerucut = inputMenu.nextInt();
                switch (menuKerucut) {
                    case 1:
                        kerucut.getLuasPermukaan();
                        break;
                    case 2:
                        kerucut.getVolume();
                        break;
                    default:
                        System.out.print("Menu tidak ada");
                        break;
                }
                break;
            case 2:
                System.out.print("\nCalculator Bola\n");
                System.out.print("\n1. Luas Permukaan");
                System.out.print("\n2. Volume");
                System.out.print("\n\nMasukkan menu: ");

                int menuBola = inputMenu.nextInt();
                switch (menuBola) {
                    case 1:
                        kerucut.getLuasPermukaan();

                        System.out.print("Ingin Menghitung lagi? (y/n): ");
                        String lagi = inputMenu.next();
                        if (lagi.equals("y")) {
                            main(args);
                        } else {
                            System.out.print("\nTerima kasih");
                        }

                        break;
                    case 2:
                        kerucut.getVolume();

                        System.out.print("Ingin Menghitung lagi? (y/n): ");
                        String lagi1 = inputMenu.next();
                        if (lagi1.equals("y")) {
                            main(args);
                        } else {
                            System.out.print("\nTerima kasih");
                        }

                        break;
                    default:
                        System.out.print("Menu tidak ada");
                        break;
                }
                break;
            default:
                System.out.print("Menu tidak ada");
                System.out.print("Ingin Menghitung lagi? (y/n): ");
                String lagi1 = inputMenu.next();
                if (lagi1.equals("y")) {
                    main(args);
                } else {
                    System.out.print("\nTerima kasih");
                }
                break;
        }
        inputMenu.close();
    }
}
