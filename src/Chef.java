import java.util.ArrayList;

public class Chef extends Personne {
    private int etoiles;
    private ArrayList<String> specialites;
    private ArrayList<String> plats;
    private ArrayList<Padawan> padawan;

    public Chef(int id, String nom, String prenom, int age, String genre, int telephone, int etoiles, ArrayList<String> specialites, ArrayList<String> plats) {
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

    public ArrayList<String> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(ArrayList<String> specialites) {
        this.specialites = specialites;
    }

    public ArrayList<String> getPlats() {
        return plats;
    }

    public void setPlats(ArrayList<String> plats) {
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
                "Nom" + getNom() +
                "Prenom" + getPrenom() +
                "etoiles=" + etoiles +
                ", specialites=" + specialites +
                ", plats=" + plats +
                ", padawan=" + padawan +
                '}';
    }
}
