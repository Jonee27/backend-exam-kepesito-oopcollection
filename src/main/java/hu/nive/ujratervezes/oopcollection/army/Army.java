package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Army {
    private List<MilitaryUnit> militaryUnitList = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnitList.add(militaryUnit);
    }

    public void damageAll(int damage) {
        militaryUnitList.stream().forEach(e -> e.sufferDamage(damage));
        militaryUnitList = militaryUnitList.stream().filter(e -> e.getHitPoints() >= 25).collect(Collectors.toList());
    }

    public int getArmyDamage() {
        return militaryUnitList.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }

    public int getArmySize() {
        return militaryUnitList.size();
    }


}