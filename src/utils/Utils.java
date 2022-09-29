package utils;

public class Utils {
    private static int idPersonne = 0;

    public static int getId() {
        return idPersonne;
    }

    public static int generateId() {
        return idPersonne++;
    }
}
