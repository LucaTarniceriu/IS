import java.util.ArrayList;
import java.util.List;

public class Persoana {
    String nume;
    int varsta;
    List<Parinte> parinti;

    Persoana(){};
    Persoana(String nume, int varsta, List<Parinte> parinti){
        this.nume = nume;
        this.varsta = varsta;
        this.parinti = new ArrayList<>(2);
    }
}
