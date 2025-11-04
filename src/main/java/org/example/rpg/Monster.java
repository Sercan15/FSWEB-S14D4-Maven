package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    // attack metodu: damage + bleed + poison
    public double attack() {
        double totalDamage = getDamage();

        // Bleedable veya Poisonable olup olmadigina bakmak gerekir
        if (this instanceof Bleedable) {
            totalDamage += ((Bleedable) this).bleed();
        }

        if (this instanceof Poisonable) {
            totalDamage += ((Poisonable) this).poison();
        }

        return totalDamage;
    }
}