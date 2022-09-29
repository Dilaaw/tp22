package personnes;

public class Jury extends Personne {
    private int nombreParticipations;

    public Jury(int id, String nom, String prenom, int age, Genre genre, String telephone, int nombreParticipations) {
        super(id, nom, prenom, age, genre, telephone);
        this.nombreParticipations = nombreParticipations;
    }

    @Override
    public String toString() {
        return "Jury{" +
                super.toString() +
                ", nombreParticipations=" + nombreParticipations +
                '}';
    }
}
