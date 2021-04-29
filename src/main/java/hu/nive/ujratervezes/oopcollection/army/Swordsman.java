package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean blockFirst;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (blockFirst) {
            super.sufferDamage(damage);
        } else {
            blockFirst = true;
        }
    }
}