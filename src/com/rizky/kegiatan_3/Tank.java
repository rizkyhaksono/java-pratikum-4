package com.rizky.kegiatan_3;

public class Tank extends Hero implements MagicalDamage {

    double realDamage = super.getHealthPoint();

    Tank(int lvl) {
        super.setLevel(lvl);

        if (super.getLevel() == 1) {
            super.setHealthPoint(7000);
            super.setDefense(500);
            super.setAttackDamage(500);
        } else {
            super.setHealthPoint(7000 + (super.getLevel() * 200));
            super.setDefense(500 + (super.getLevel() * 15));
            super.setAttackDamage(500 + (super.getLevel() * 20));
            super.setLifeStatus(true);
        }
    }

    // abstract
    @Override
    void spawnIntro() {
        System.out.println("'Shield is my friend!'");
    };

    // method concrete
    void attack(Hero hero) {
        hero.reviewDamage(super.getAttackDamage());
    };

    void reviewDamage(double damage) {
        realDamage = super.getHealthPoint() - (damage - super.getDefense());
        super.setHealthPoint(realDamage);

        if (getHealthPoint() <= 0) {
            this.setLifeStatus(false);
            super.setHealthPoint(0);
        }
    };

    public void checkStatus() {
        System.out.println("\nLevel : " + getLevel() + "\nAttack damage\t: " + getAttackDamage() + "    "
                + "Lifestatus\t: " + getLifeStatus());
        System.out.println("Health poin\t: " + getHealthPoint() + "    " + "Defense\t: " + getDefense());
    };

};
