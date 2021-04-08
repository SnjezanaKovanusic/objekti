package com.company.vjezbe;

import java.util.Arrays;

public class MobilniTelefon {
    private String brend;
    private String model;
    private String operativniSistem;
    private int ram;
    private short godProizvodnje;
    private Kontakt[] imenik;

    public MobilniTelefon(String model, int ram) {
        imenik = new Kontakt[100];
        this.model = model;
        this.ram = ram;
    }

    public void dodajKontakt(Kontakt kontakt, int index){
        this.imenik[index]= kontakt;
    }

    public void ispisiImenik(){
        for (int i =0; i< this.imenik.length; i++){
            if(imenik[i]!=null){
                System.out.println(imenik[i].toString());
            }
        }
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperativniSistem() {
        return operativniSistem;
    }

    public void setOperativniSistem(String operativniSistem) {
        this.operativniSistem = operativniSistem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public short getGodProizvodnje() {
        return godProizvodnje;
    }

    public void setGodProizvodnje(short godProizvodnje) {
        this.godProizvodnje = godProizvodnje;
    }

    public Kontakt[] getImenik() {
        return imenik;
    }

    public void setImenik(Kontakt[] imenik) {
        this.imenik = imenik;
    }

    @Override
    public String toString() {
        return "MobilniTelefon{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", operativniSistem='" + operativniSistem + '\'' +
                ", ram=" + ram +
                ", godProizvodnje=" + godProizvodnje +
                ", imenik=" + Arrays.toString(imenik) +
                '}';
    }
}
