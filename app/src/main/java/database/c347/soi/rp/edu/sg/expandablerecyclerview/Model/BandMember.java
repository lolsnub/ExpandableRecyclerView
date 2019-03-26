package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

public class BandMember {

    String BandName, Rare, ImageURL;

    public BandMember(String bandName, String rare, String imageURL) {
        BandName = bandName;
        Rare = rare;
        ImageURL = imageURL;
    }

    public String getBandName() {
        return BandName;
    }

    public void setBandName(String bandName) {
        BandName = bandName;
    }

    public String getRare() {
        return Rare;
    }

    public void setRare(String rare) {
        Rare = rare;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
