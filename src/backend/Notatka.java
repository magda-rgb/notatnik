/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.Date;

/**
 *
 * @author mszwa
 */
public class Notatka {
    private int numer;
    private String nazwa;
    private Date podanadata; 
    private String opis;

    public Notatka(int numer, String nazwa, Date podanadata, String opis) {
        this.numer = numer;
        this.nazwa = nazwa;
        this.podanadata = podanadata;
        this.opis = opis;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getPodanadata() {
        return podanadata;
    }

    public void setPodanadata(Date podanadata) {
        this.podanadata = podanadata;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    
}
