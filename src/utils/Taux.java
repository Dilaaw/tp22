package utils;

public class Taux {
    private final int taux;

    public Taux(int taux) throws Exception {
        if (taux < 0 || taux > 100) {
            throw new Exception("Le taux doit être compris entre 0 et 100");
        }
        this.taux = taux;
    }
}
