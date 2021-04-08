package com.company.vjezbe;

public class Kontakt {
    public static int index = 0;
    private String ime;
    private String broj;

    public Kontakt(String ime, String broj) {
        index++;
        this.ime = ime;
        this.broj = broj;
    }

    @Override
    public String toString() {
        return "Ime :" + ime + "\nbroj: " + broj;
    }
}
