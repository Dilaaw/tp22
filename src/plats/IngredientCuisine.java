package plats;

public class IngredientCuisine {
    private Ingredient ingredient;

    private Consigne consigne;

    private int quantite;

    public IngredientCuisine(Ingredient ingredient, Consigne consigne, int quantite) {
        this.ingredient = ingredient;
        this.consigne = consigne;
        this.quantite = quantite;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Consigne getConsigne() {
        return consigne;
    }

    public void setConsigne(Consigne consigne) {
        this.consigne = consigne;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "{" + ingredient +
                ", consigne=" + consigne +
                ", quantite=" + quantite +
                '}';
    }
}
