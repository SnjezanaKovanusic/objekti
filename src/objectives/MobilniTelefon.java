package objectives;

public class MobilniTelefon {

    String markaTelefona;
    int godinaProizvodnje;
    int velicinaMemorije;
    Kontakt[] kontakti = new Kontakt[300];
    boolean upaljen = false;

    public MobilniTelefon() {}

    public MobilniTelefon(String markaTelefona, int godinaProizvodnje, int velicinaMemorije, boolean upaljen) {
       this.markaTelefona=markaTelefona;
       this.godinaProizvodnje=godinaProizvodnje;
       this.velicinaMemorije=velicinaMemorije;
       this.upaljen=upaljen;
    }
    public void upalitiTelefon() {
        upaljen = true;
    }

    public void ugasitiTelefon() {
        upaljen = false;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void setMarkaTelefona(String markaTelefona) {
        this.markaTelefona = markaTelefona;
    }

    public void setVelicinaMemorije(int velicinaMemorije) {
        this.velicinaMemorije = velicinaMemorije;
    }

    public void dodatiNoviKontakt(String ime, int broj) {
        Kontakt kontakt = new Kontakt(ime, broj);
        kontakti[getLastEmptyIndex()] = kontakt;
    }

    private int getLastEmptyIndex() {
        for (int i = 0; i < kontakti.length; i++) {
            if (kontakti[i] == null) {
                return i;
            }
        }
        return kontakti.length;
    }

    private String getImenik() {
        String imenik = "";
        for (int i = 0; i < kontakti.length; i++) {
            if (kontakti[i] != null) {
                imenik += kontakti[i];
            }
        }
        return imenik;

    }

    @Override
    public String toString() {
        return "MobilniTelefon{" +
                "markaTelefona='" + markaTelefona + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", velicinaMemorije=" + velicinaMemorije +
                ", imenik=" + getImenik() +
                ", upaljen=" + upaljen +
                '}';
    }

}
