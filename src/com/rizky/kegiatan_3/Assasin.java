package com.rizky.kegiatan_3;

public class Assasin extends Hero implements CriticalDamage {

    double realDamage = super.getHealthPoint();

    Assasin(int lvl) {
        super.setLevel(lvl);

        if (super.getLevel() == 1) {
            super.setHealthPoint(3000);
            super.setDefense(300);
            super.setAttackDamage(800);
        } else {
            super.setHealthPoint(3000 + (super.getLevel() * 90));
            super.setDefense(300 + (super.getLevel() * 15));
            super.setAttackDamage(800 + bonusDamage + (super.getLevel() * 30));
            super.setLifeStatus(true);
        }
    }

    // abstract
    @Override
    void spawnIntro() {
        System.out.println("'Catch me if you can!'");
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
