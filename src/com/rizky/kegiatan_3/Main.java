package com.rizky.kegiatan_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner chooseHero = new Scanner(System.in);

        System.out.println("\nChoose your hero : ");
        System.out.println("1. Assasin");
        System.out.println("2. Mage");
        System.out.println("3. Tank");
        System.out.print("\nChoose : ");
        int choose = chooseHero.nextInt();

        switch (choose) {
            case 1:
                // Assasin
                System.out.println("\nYou choose Assasin\n");
                System.out.print("Choose level assasin : ");
                Scanner levelHero = new Scanner(System.in);
                int chooseLevel = levelHero.nextInt();

                Assasin assasin = new Assasin(chooseLevel);

                Scanner chooseAttack = new Scanner(System.in);
                System.out.println("\nChoose your enemy : ");
                System.out.println("1. Mage");
                System.out.println("2. Tank");
                System.out.print("\nChoose : ");

                int chooseEnemy = chooseAttack.nextInt();
                switch (chooseEnemy) {
                    case 1:
                        // assasin attack mage
                        System.out.println("\nYou choose Mage\n");
                        System.out.print("Choose level mage : ");

                        Scanner levelHero_mage = new Scanner(System.in);
                        int chooseLevel_mage = levelHero_mage.nextInt();

                        Mage mage = new Mage(chooseLevel_mage);

                        System.out.println("\n==== Player 1 ====");
                        assasin.checkStatus();
                        System.out.println("\n==== Player 2 ====");
                        mage.checkStatus();

                        int a = 1;

                        if (assasin.getLifeStatus() == true && mage.getLifeStatus() == true) {
                            System.out.println("\n----- Fight Begin -----");

                            while (assasin.getLifeStatus() && mage.getLifeStatus()) {
                                System.out.println("\n\n---- Round " + a + "-----");

                                System.out.println("----- Player 1 TURN -----");
                                assasin.spawnIntro();

                                assasin.attack(mage);
                                System.out.printf("Player 2 HP remaining : %.2f", mage.getHealthPoint(), "\n");

                                // check life status assasin
                                if (assasin.getLifeStatus() == false) {
                                    System.out.println("\n\nAssasin is dead!");
                                    System.out.println("\n---- Player 2 WIN ----");
                                    System.out.printf("Player 2 HP remaining : %.2f", mage.getHealthPoint());
                                    break;
                                }

                                System.out.println("\n----- Player 2 TURN -----");
                                mage.spawnIntro();

                                mage.attack(assasin);
                                System.out.printf("Player 1 HP remaining : %.2f", assasin.getHealthPoint(), "\n");

                                // check life status mage
                                if (mage.getLifeStatus() == false) {
                                    System.out.println("\n\nMage is dead!");
                                    System.out.println("\n---- Player 1 WIN ----");
                                    System.out.printf("Player 1 HP remaining : %.2f", assasin.getHealthPoint());
                                    break;
                                }
                                a++;
                            }
                        }
                        break;
                    case 2:
                        // assasin attack tank
                        System.out.println("\nYou choose Tank\n");
                        System.out.print("Choose level tank : ");

                        Scanner levelHero_tank = new Scanner(System.in);
                        int chooseLevel_tank = levelHero_tank.nextInt();

                        Tank tank1 = new Tank(chooseLevel_tank);

                        System.out.println("\n==== Player 1 ====");
                        assasin.checkStatus();
                        System.out.println("\n==== Player 2 ====");
                        tank1.checkStatus();

                        int b = 1;

                        if (assasin.getLifeStatus() == true && tank1.getLifeStatus() == true) {
                            System.out.println("\n----- Fight Begin -----");

                            while (assasin.getLifeStatus() && tank1.getLifeStatus()) {
                                System.out.println("\n\n---- Round " + b + "-----");

                                System.out.println("----- Player 1 TURN -----");
                                assasin.spawnIntro();

                                assasin.attack(tank1);
                                System.out.printf("Player 2 HP remaining : %.2f", tank1.getHealthPoint(), "\n");

                                // check life status assasin
                                if (assasin.getLifeStatus() == false) {
                                    System.out.println("\n\nAssasin is dead!");
                                    System.out.println("\n---- Player 2 WIN ----");
                                    System.out.printf("Player 2 HP remaining : %.2f", tank1.getHealthPoint());
                                    break;
                                }

                                System.out.println("\n----- Player 2 TURN -----");
                                tank1.spawnIntro();

                                tank1.attack(assasin);
                                System.out.printf("Player 1 HP remaining : %.2f", assasin.getHealthPoint(), "\n");

                                // check life status tank
                                if (tank1.getLifeStatus() == false) {
                                    System.out.println("\n\nTank is dead!");
                                    System.out.println("\n---- Player 1 WIN ----");
                                    System.out.printf("Player 1 HP remaining : %.2f", assasin.getHealthPoint());
                                    break;
                                }
                                b++;
                            }
                        }
                        break;
                    default:
                        System.out.println("\nInputan salah");
                        break;
                }
                break;
            case 2:
                // Mage
                System.out.println("\nYou choose Mage\n");
                System.out.print("Choose level mage : ");
                Scanner levelHero2 = new Scanner(System.in);
                int chooseLevel2 = levelHero2.nextInt();

                Mage mage2 = new Mage(chooseLevel2);

                Scanner chooseAttack2 = new Scanner(System.in);
                System.out.println("\nChoose your enemy : ");
                System.out.println("1. Assasin");
                System.out.println("2. Tank");
                System.out.print("\nChoose : ");

                int chooseEnemy2 = chooseAttack2.nextInt();
                switch (chooseEnemy2) {
                    case 1:
                        // mage attack assasin
                        System.out.println("\nYou choose assasin\n");
                        System.out.print("Choose level assasin : ");

                        Scanner levelHero_assasin1 = new Scanner(System.in);
                        int chooseLevel_assasin1 = levelHero_assasin1.nextInt();

                        Assasin assasin2 = new Assasin(chooseLevel_assasin1);

                        System.out.println("\n==== Player 1 ====");
                        mage2.checkStatus();
                        System.out.println("\n==== Player 2 ====");
                        assasin2.checkStatus();

                        int a = 1;

                        if (assasin2.getLifeStatus() == true && mage2.getLifeStatus() == true) {
                            System.out.println("\n----- Fight Begin -----");

                            while (assasin2.getLifeStatus() && mage2.getLifeStatus()) {
                                System.out.println("\n\n---- Round " + a + "-----");

                                System.out.println("----- Player 1 TURN -----");
                                mage2.spawnIntro();

                                mage2.attack(assasin2);
                                System.out.printf("Player 2 HP remaining : %.2f", assasin2.getHealthPoint(), "\n");

                                // check life status mage
                                if (mage2.getLifeStatus() == false) {
                                    System.out.println("\n\nMage is dead!");
                                    System.out.println("\n---- Player 2 WIN ----");
                                    System.out.printf("Player 2 HP remaining : %.2f", assasin2.getHealthPoint());
                                    break;
                                }

                                System.out.println("\n----- Player 2 TURN -----");
                                assasin2.spawnIntro();

                                assasin2.attack(mage2);
                                System.out.printf("Player 1 HP remaining : %.2f", mage2.getHealthPoint(), "\n");

                                // check life status assasin player 2
                                if (assasin2.getLifeStatus() == false) {
                                    System.out.println("\n\nAssasin is dead!");
                                    System.out.println("\n---- Player 1 WIN ----");
                                    System.out.printf("Player 1 HP remaining : %.2f", mage2.getHealthPoint());
                                    break;
                                }
                                a++;
                            }
                        }
                        break;
                    case 2:
                        // mage attack tank
                        System.out.println("\nYou choose Tank\n");
                        System.out.print("Choose level tank : ");

                        Scanner levelHero_tank = new Scanner(System.in);
                        int chooseLevel_tank = levelHero_tank.nextInt();

                        Tank tank2 = new Tank(chooseLevel_tank);

                        System.out.println("\n==== Player 1 ====");
                        mage2.checkStatus();
                        System.out.println("\n==== Player 2 ====");
                        tank2.checkStatus();

                        int b = 1;

                        if (mage2.getLifeStatus() == true && tank2.getLifeStatus() == true) {
                            System.out.println("\n----- Fight Begin -----");

                            while (mage2.getLifeStatus() && tank2.getLifeStatus()) {
                                System.out.println("\n---- Round " + b + "-----");

                                System.out.println("----- Player 1 TURN -----");
                                mage2.spawnIntro();

                                mage2.attack(tank2);
                                System.out.printf("Player 2 HP remaining : %.2f", tank2.getHealthPoint(), "\n");

                                // check life status mage2
                                if (mage2.getLifeStatus() == false) {
                                    System.out.println("\n\nMage is dead!");
                                    System.out.println("\n---- Player 2 WIN ----");
                                    System.out.printf("Player 2 HP remaining : %.2f", tank2.getHealthPoint());
                                    break;
                                }

                                System.out.println("\n----- Player 2 TURN -----");
                                tank2.spawnIntro();

                                tank2.attack(mage2);
                                System.out.printf("Player 1 HP remaining : %.2f", mage2.getHealthPoint(), "\n");

                                // check life status mage
                                if (tank2.getLifeStatus() == false) {
                                    System.out.println("\n\nTank is dead!");
                                    System.out.println("\n---- Player 1 WIN ----");
                                    System.out.printf("Player 1 HP remaining : %.2f", mage2.getHealthPoint());
                                    break;
                                }
                                b++;
                            }
                        }
                        break;
                    default:
                        System.out.println("\nInputan salah");
                        break;
                }
                break;
            case 3:
                // Tank
                System.out.println("\nYou choose Tank\n");
                System.out.print("Choose level tank : ");
                Scanner levelHero3 = new Scanner(System.in);
                int chooseLevel3 = levelHero3.nextInt();

                Tank tank3 = new Tank(chooseLevel3);

                Scanner chooseAttack3 = new Scanner(System.in);
                System.out.println("\nChoose your enemy : ");
                System.out.println("1. Assasin");
                System.out.println("2. Mage");
                System.out.print("\nChoose : ");

                int chooseEnemy3 = chooseAttack3.nextInt();

                switch (chooseEnemy3) {
                    case 1:
                        // tank attack assasin
                        System.out.println("\nYou choose assasin\n");
                        System.out.print("Choose level assasin : ");

                        Scanner levelHero_tank1 = new Scanner(System.in);
                        int chooseLevel_tank1 = levelHero_tank1.nextInt();

                        Assasin assasin3 = new Assasin(chooseLevel_tank1);

                        System.out.println("\n==== Player 1 ====");
                        tank3.checkStatus();
                        System.out.println("\n==== Player 2 ====");
                        assasin3.checkStatus();

                        int a = 1;

                        if (assasin3.getLifeStatus() == true && tank3.getLifeStatus() == true) {
                            System.out.println("\n----- Fight Begin -----");

                            while (assasin3.getLifeStatus() && tank3.getLifeStatus()) {
                                System.out.println("\n\n---- Round " + a + "-----");

                                System.out.println("----- Player 1 TURN -----");
                                tank3.spawnIntro();

                                tank3.attack(assasin3);
                                System.out.printf("Player 2 HP remaining : %.2f", assasin3.getHealthPoint(), "\n");

                                // check life status tank
                                if (tank3.getLifeStatus() == false) {
                                    System.out.println("\n\nTank is dead!");
                                    System.out.println("\n---- Player 2 WIN ----");
                                    System.out.printf("Player 2 HP remaining : %.2f", assasin3.getHealthPoint());
                                    break;
                                }

                                System.out.println("\n----- Player 2 TURN -----");
                                assasin3.spawnIntro();

                                assasin3.attack(tank3);
                                System.out.printf("Player 1 HP remaining : %.2f", tank3.getHealthPoint(), "\n");

                                // check life status assasin
                                if (assasin3.getLifeStatus() == false) {
                                    System.out.println("\n\nAssasin is dead!");
                                    System.out.println("\n---- Player 1 WIN ----");
                                    System.out.printf("Player 1 HP remaining : %.2f", tank3.getHealthPoint());
                                    break;
                                }
                                a++;
                            }
                        }
                        break;
                    case 2:
                        // tank attack mage
                        System.out.println("\nYou choose Mage\n");
                        System.out.print("Choose level mage : ");

                        Scanner levelHero_mage = new Scanner(System.in);
                        int chooseLevel_mage = levelHero_mage.nextInt();

                        Mage mage3 = new Mage(chooseLevel_mage);

                        System.out.println("\n==== Player 1 ====");
                        tank3.checkStatus();
                        System.out.println("\n==== Player 2 ====");
                        mage3.checkStatus();

                        int b = 1;

                        if (mage3.getLifeStatus() == true && tank3.getLifeStatus() == true) {
                            System.out.println("\n----- Fight Begin -----");

                            while (mage3.getLifeStatus() && tank3.getLifeStatus()) {
                                System.out.println("\n---- Round " + b + "-----");

                                System.out.println("----- Player 1 TURN -----");
                                tank3.spawnIntro();

                                tank3.attack(mage3);
                                System.out.printf("Player 2 HP remaining : %.2f", mage3.getHealthPoint(), "\n");

                                // check life status tank
                                if (tank3.getLifeStatus() == false) {
                                    System.out.println("\n\nTank is dead!");
                                    System.out.println("\n---- Player 2 WIN ----");
                                    System.out.printf("Player 2 HP remaining : %.2f", mage3.getHealthPoint());
                                    break;
                                }

                                System.out.println("\n----- Player 2 TURN -----");
                                mage3.spawnIntro();

                                mage3.attack(tank3);
                                System.out.printf("Player 1 HP remaining : %.2f", tank3.getHealthPoint(), "\n");

                                // check life status mage
                                if (mage3.getLifeStatus() == false) {
                                    System.out.println("\n\nMage is dead!");
                                    System.out.println("\n---- Player 1 WIN ----");
                                    System.out.printf("Player 1 HP remaining : %.2f", tank3.getHealthPoint());
                                    break;
                                }
                                b++;
                            }
                        }
                        break;
                    default:
                        System.out.println("\nInputan salah");
                        break;
                }
        }
        chooseHero.close();
    }
}
