package objectives;

public class Kontakt {
    String ime;
    int brTelefona;

    public Kontakt(String ime, int brTelefona) {
        this.ime = ime;
        this.brTelefona = brTelefona;
    }

    @Override
    public String toString() {
        return "Kontakt{" +
                "ime='" + ime + '\'' +
                ", brTelefona=" + brTelefona +
                '}';
    }

}
