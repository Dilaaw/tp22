package plats;

import plats.groupes.Famille;

import java.util.ArrayList;

public class Plat {
    private String nomPlat;

    private ArrayList<IngredientCuisine> ingredients;

    public Plat(String nomPlat, ArrayList<IngredientCuisine> ingredients) throws Exception{
        this.nomPlat = nomPlat;

        if (ingredients.isEmpty()) {
            throw new Exception("Aucun ingrédient n'a été ajouté dans ce plat");
        }

        if (ingredients.size() == 1 && ingredients.get(0).getIngredient().getGroupeAlimentaire().getNom() == Famille.EPICES) {
            throw new Exception("Il ne peut peut pas y avoir que des épices dans un plat");
        }
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Plat{" +
                "Nom du plat='" + nomPlat + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
