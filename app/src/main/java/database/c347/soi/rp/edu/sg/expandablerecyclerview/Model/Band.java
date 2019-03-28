package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import java.util.ArrayList;

public class Band {
    public String bandName, bandColor, bandLogo;

    public Band(String bandName, String bandColor, String bandLogo) {
        this.bandName = bandName;
        this.bandColor = bandColor;
        this.bandLogo = bandLogo;
    }

    public Band(){

    }

    public String getBandName() {
        return bandName;
    }

    public String getBandColor() {
        return bandColor;
    }

    public String getBandLogo() {
        return bandLogo;
    }

    public void getBandData(ArrayList<Band> bands){
        bands.add(new Band("Roselia", "#5B67FF", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2Froselia_logo.png?alt=media&token=6474a7de-fe6d-4d38-923f-e871f1104b53"));
        bands.add(new Band("Poppin' Party", "#FF3B72", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FPoppin'Party.png?alt=media&token=744d3c66-2b93-4f70-bb68-8e73268e8866"));
        bands.add(new Band("Pastel Palettes", "#2AF6B1", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FPastel_Palettes.png?alt=media&token=35655b1b-eaf2-449a-bc9d-9a6410768f65"));
        bands.add(new Band("Afterglow", "#E53343", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FAfterglow.png?alt=media&token=a71798a8-9706-43d5-b939-5aa9839064de"));
        bands.add(new Band("Hello, Happy World!", "#FFC02A", "https://firebasestorage.googleapis.com/v0/b/portfolio-f214c.appspot.com/o/Band_logo%2FHello%2C%20Happy%20World!.png?alt=media&token=02c51201-7191-4167-a308-8b7dba053b5e"));
    }
}
