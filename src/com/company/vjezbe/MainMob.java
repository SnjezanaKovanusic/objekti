package com.company.vjezbe;

public class MainMob {
    public static void main(String[] args) {
        String modelTelefona = "Nokia";
        int ram = 3;
        MobilniTelefon mobilniTelefon = new MobilniTelefon(modelTelefona, ram);

        Kontakt kontakt = new Kontakt("Pero", "065-163-123");
        mobilniTelefon.dodajKontakt(kontakt,Kontakt.index);


        Kontakt kontakt1 = new Kontakt("Simo", "065-123-153");
        mobilniTelefon.dodajKontakt(kontakt1,Kontakt.index);

        Kontakt kontakt2 = new Kontakt("Drago", "065-123-223");
        mobilniTelefon.dodajKontakt(kontakt2,Kontakt.index);

        Kontakt kontakt3 = new Kontakt("Jovo", "065-123-133");
        mobilniTelefon.dodajKontakt(kontakt3,Kontakt.index);

        //mobilniTelefon.ispisiImenik();

        System.out.println(mobilniTelefon);
    }
}
