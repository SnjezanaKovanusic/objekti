package objectives;

public class Knjiga {
    String naslov;
    String autor;
    int brojStrana;
    boolean izdata;

    public Knjiga(String naslov, String autor) {
        this.naslov = naslov;
        this.autor = autor;
    }

    public Knjiga() {

    }
    public void setBrojStrana(int brojStrana){
        this.brojStrana=brojStrana;
    }
    public void setIzdata (boolean izdata){
        this.izdata=izdata;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", autor='" + autor + '\'' +
                ", brojStrana=" + brojStrana +
                ", izdata=" + izdata +
                '}';
    }
}

