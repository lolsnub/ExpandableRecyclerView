package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import java.util.ArrayList;

public class Rarity {
    Integer star;

    public Rarity(Integer star) {
        this.star = star;
    }

    public Rarity(){

    }

    public Integer getStar() {
        return star;
    }

    public void getRarity(ArrayList<Rarity> rarities){
        rarities.add(new Rarity(2));
        rarities.add(new Rarity(3));
        rarities.add(new Rarity(4));

    }
}
