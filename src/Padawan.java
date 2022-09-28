public class Padawan extends Personne{
    private Chef chef;

    public Padawan(int id, String nom, String prenom, int age, String genre, int telephone) {
        super(id, nom, prenom, age, genre, telephone);
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    @Override
    public String toString() {
        return "Padawan{" +
                "chef=" + chef +
                '}';
    }
}
