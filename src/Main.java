import Personnes.Chef;
import Personnes.Padawan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chef c1 = new Chef(001, "Rahioui", "Walid", 19, "Masculin", 781582405, 4, new ArrayList<>(), new ArrayList<>());
        Padawan p1 = new Padawan(001, "Rahioui", "Walid", 19, "Masculin", 781582405);

        ArrayList<Padawan> padawanList = new ArrayList<>();
        padawanList.add(p1);

        p1.setChef(c1);
        c1.setPadawan(padawanList);


        System.out.println(p1.toString());
    }
}
