package plats.groupes;

import utils.Taux;

public class GroupeViande extends Groupe{
    private final Taux tauxGras;

    public GroupeViande(int calorie, boolean bio, Taux tauxGras) {
        super(Famille.VIANDES, calorie, bio);
        this.tauxGras = tauxGras;
    }
}
