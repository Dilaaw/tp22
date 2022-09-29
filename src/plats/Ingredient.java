package plats;

import plats.groupes.Groupe;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    private static final List<Ingredient> INGREDIENTS = new ArrayList<>();

    private static int idCount = 0;

    private final int id;

    private final String nom;

    private final Groupe groupeAlimentaire;

    public Ingredient(String nom, Groupe groupeAlimentaire) throws Exception {
        this.id = idCount++;
        this.nom = nom;
        this.groupeAlimentaire = groupeAlimentaire;

        for (Ingredient ingredient : INGREDIENTS) {
            if (ingredient.nom.equals(this.nom) && ingredient.groupeAlimentaire.equals(this.groupeAlimentaire)) {
                throw new Exception("Cet ingrédient existe déjà !!");
            }
        }

        INGREDIENTS.add(this);
    }


}
