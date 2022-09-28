public class Jury extends Personne {
    private int nombreParticipations;

    public Jury(int id, String nom, String prenom, int age, String genre, int telephone, int nombreParticipations) {
        super(id, nom, prenom, age, genre, telephone);
        this.nombreParticipations = nombreParticipations;
    }
}
