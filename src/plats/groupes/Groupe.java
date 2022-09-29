package plats.groupes;

public class Groupe {
    private final Famille nom;

    private final int calorie;

    private final boolean bio;

    public Groupe(Famille nom, int calorie, boolean bio) {
        this.nom = nom;
        this.calorie = calorie;
        this.bio = bio;
    }

    public Famille getNom() {
        return nom;
    }

    public int getCalorie() {
        return calorie;
    }

    public boolean isBio() {
        return bio;
    }

    @Override
    public boolean equals(Object obj) {
        Groupe groupe = (Groupe) obj;
        return ((groupe.isBio() && isBio()) && (groupe.getCalorie() == getCalorie()) && groupe.getNom().equals(getNom()));
    }
}
