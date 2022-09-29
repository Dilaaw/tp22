import jdk.jshell.execution.Util;
import personnes.*;
import plats.Consigne;
import plats.Ingredient;
import plats.IngredientCuisine;
import plats.Plat;
import plats.groupes.Famille;
import plats.groupes.Groupe;
import plats.groupes.GroupeLegume;
import utils.Taux;
import utils.Utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<IngredientCuisine> ingredients = new ArrayList<>();
            Ingredient i1 = new Ingredient("Aubergine", new GroupeLegume(18, true, new Taux(18)));
            Ingredient i2 = new Ingredient("Tomates", new GroupeLegume(25, true, new Taux(15)));
            Ingredient i3 = new Ingredient("Curcumin", new Groupe(Famille.EPICES, 18, true));

            // Ingredients cuisinés
            ingredients.add(new IngredientCuisine(i1, Consigne.ENTIER, 18));
            ingredients.add(new IngredientCuisine(i2, Consigne.ENTIER, 14));

            ArrayList<Plat> platsC1 = new ArrayList<>();
            platsC1.add(new Plat("Couscous", ingredients));
            platsC1.add(new Plat("Tajine", ingredients));

            // System.out.println(platsC1);

            Chef c1 = new Chef(Utils.generateId(), "Rahioui", "Walid", 19, Genre.HOMME, "0781582405", 4, Specialite.CUISINIER, platsC1);


            // Ingredients cuisinés
            ArrayList<IngredientCuisine> ingredients2 = new ArrayList<>();
            ingredients2.add(new IngredientCuisine(i3, Consigne.ENTIER, 18));

            ArrayList<Plat> platsC2 = new ArrayList<>();
            platsC2.add(new Plat("Epicerie", ingredients2));

            Chef c2 = new Chef(Utils.generateId(), "Rahioui", "Walid", 20, Genre.HOMME, "0781582405", 4, Specialite.CUISINIER, platsC2);

            System.out.println(c2);

            Padawan p1 = new Padawan(Utils.generateId(), "Garnier", "Clément", 21, Genre.HOMME, "0642171212");
            Padawan p2 = new Padawan(Utils.generateId(), "Goulois", "Lucas", 20, Genre.HOMME, "0613861515");

            ArrayList<Padawan> padawanList = new ArrayList<>();
            padawanList.add(p1);

            p1.setChef(c1);
            c1.setPadawan(padawanList);

            Jury j1 = new Jury(Utils.generateId(), "Monroe", "Patrice", 44, Genre.HOMME,"0615151412", 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
