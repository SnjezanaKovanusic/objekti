package objectives;


public class Biblioteka {
    Knjiga[] spisakKnjiga = new Knjiga[10];

    public Biblioteka() {

    }

    public void dodatiNovuKnjigu(Knjiga knjiga) {
        spisakKnjiga[getLastEmptyIndex()] = knjiga;
    }

    private int getLastEmptyIndex() {
        for (int i = 0; i < spisakKnjiga.length; i++) {
            if (spisakKnjiga[i] == null) {
                return i;
            }
        }
        return spisakKnjiga.length;
    }

    private String printSpisakKnjiga() {
        String spisak = "";
        for (int i = 0; i < spisakKnjiga.length; i++) {
            if (spisakKnjiga[i] != null)
                spisak += spisakKnjiga[i] + "\n";
        }
        return spisak;
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                ", spisakKnjiga=" + printSpisakKnjiga() +
                '}';
    }
}
