package personnes;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private Genre genre;
    private String telephone;

    public Personne(int id, String nom, String prenom, int age, Genre genre, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.genre = genre;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", genre='" + genre + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}
