package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

public class Band {
   public String bandName, bandColor, bandLogo;

    public Band(String bandName, String bandColor, String bandLogo) {
        this.bandName = bandName;
        this.bandColor = bandColor;
        this.bandLogo = bandLogo;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandColor() {
        return bandColor;
    }

    public void setBandColor(String bandColor) {
        this.bandColor = bandColor;
    }

    public String getBandLogo() {
        return bandLogo;
    }

    public void setBandLogo(String bandLogo) {
        this.bandLogo = bandLogo;
    }
}
