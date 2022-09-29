package personnes;

import plats.Plat;

import java.util.ArrayList;

public class Chef extends Personne {
    private int etoiles;
    private Specialite specialites;
    private ArrayList<Plat> plats;
    private ArrayList<Padawan> padawan;

    public Chef(int id, String nom, String prenom, int age, Genre genre, String telephone, int etoiles, Specialite specialites, ArrayList<Plat> plats) {
        super(id, nom, prenom, age, genre, telephone);
        this.etoiles = etoiles;
        this.specialites = specialites;
        this.plats = plats;
    }

    public int getEtoiles() {
        return etoiles;
    }

    public void setEtoiles(int etoiles) {
        this.etoiles = etoiles;
    }

    public Specialite getSpecialites() {
        return specialites;
    }

    public void setSpecialites(Specialite specialites) {
        this.specialites = specialites;
    }

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    public void setPlats(ArrayList<Plat> plats) {
        this.plats = plats;
    }

    public ArrayList<Padawan> getPadawan() {
        return padawan;
    }

    public void setPadawan(ArrayList<Padawan> padawan) {
        this.padawan = padawan;
    }

    @Override
    public String toString() {
        return "Chef{" +
                super.toString() +
                ", etoiles=" + etoiles +
                ", specialites=" + specialites +
                ", plats=" + plats +
                '}';
    }
}
