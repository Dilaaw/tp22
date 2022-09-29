import jdk.jshell.execution.Util;
import personnes.Chef;
import personnes.Genre;
import personnes.Padawan;
import plats.Ingredient;
import plats.groupes.Famille;
import plats.groupes.Groupe;
import plats.groupes.GroupeLegume;
import utils.Taux;
import utils.Utils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chef c1 = new Chef(Utils.generateId(), "Rahioui", "Walid", 19, Genre.HOMME, "0781582405", 4, new ArrayList<>(), new ArrayList<>());
        Padawan p1 = new Padawan(Utils.generateId(), "Garnier", "Clément", 21, Genre.HOMME, "0642171212");
        Padawan p2 = new Padawan(Utils.generateId(), "Goulois", "Lucas", 20, Genre.HOMME, "0613861515");

        ArrayList<Padawan> padawanList = new ArrayList<>();
        padawanList.add(p1);

        p1.setChef(c1);
        c1.setPadawan(padawanList);

        try {
            Ingredient i1 = new Ingredient("Aubergine", new GroupeLegume(18, true, new Taux(18)));
            Ingredient i2 = new Ingredient("Aubergine", new GroupeLegume(18, true, new Taux(18)));

            System.out.println("Tout est ok");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(p1.toString());
    }
}
