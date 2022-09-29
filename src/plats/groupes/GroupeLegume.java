package plats.groupes;

import utils.Taux;

public class GroupeLegume extends Groupe{
    private final Taux tauxFibres;

    public GroupeLegume(int calorie, boolean bio, Taux tauxFibres) {
        super(Famille.LEGUMES, calorie, bio);
        this.tauxFibres = tauxFibres;
    }
}
