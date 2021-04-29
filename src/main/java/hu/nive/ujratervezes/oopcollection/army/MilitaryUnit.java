package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    protected int hitPoints, damage;

    protected boolean hasArmor;

    public MilitaryUnit(int hitPoints, int damage, boolean hasArmor) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.hasArmor = hasArmor;
    }

    public int doDamage() {
        return this.damage;
    }

    public void sufferDamage(int damage) {
        if (this.hasArmor) {
            this.hitPoints -= damage / 2;
        } else {
            this.hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return this.hitPoints;
    }
}
