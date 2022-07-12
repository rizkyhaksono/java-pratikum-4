package com.rizky.kegiatan_3;

public abstract class Hero {

    // declare variable
    private double healthPoint, attackDamage, defense;
    private int level;
    private boolean lifeStatus = true;

    Assasin assasin;
    Mage mage;
    Tank tank;

    // method abstract
    abstract void spawnIntro();

    // setter
    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLifeStatus(boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    // getter
    public double getHealthPoint() {
        return this.healthPoint;
    }

    public double getAttackDamage() {
        return this.attackDamage;
    }

    public double getDefense() {
        return this.defense;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean getLifeStatus() {
        return this.lifeStatus;
    }

    // method concrete, attack overloading
    void attack(Hero hero) {

    }

    void reviewDamage(double damage) {

    }

    void checkStatus() {

    }
}
