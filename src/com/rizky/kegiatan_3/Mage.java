package com.rizky.kegiatan_3;

public class Mage extends Hero implements MagicalDamage {

    double realDamage = super.getHealthPoint();

    Mage(int lvl) {
        super.setLevel(lvl);

        if (super.getLevel() == 1) {
            super.setHealthPoint(2500);
            super.setDefense(200);
            super.setAttackDamage(700);
        } else {
            super.setHealthPoint(2500 + (super.getLevel() * 85));
            super.setDefense(200 + (super.getLevel() * 10));
            super.setAttackDamage(700 + magicDamageBonus + (super.getLevel() * 35));
            super.setLifeStatus(true);
        }
    }

    // abstract
    @Override
    void spawnIntro() {
        System.out.println("'Feel my magic!'");
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
