package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import java.util.ArrayList;

public class BandMember {
    String bandMemberName;

    public BandMember(String bandMemberName) {
        this.bandMemberName = bandMemberName;
    }

    public BandMember(){

    }

    public String getBandMemberName() {
        return bandMemberName;
    }

    public void getRoseliaMember(ArrayList<BandMember> roseliaMember){
        String[] roseliaTitleList = {"Yukina", "Sayo", "Lisa", "Ako", "Rinko"};
        for(String s : roseliaTitleList){
            roseliaMember.add(new BandMember(s));
        }

    }

    public void getPoppinMember(ArrayList<BandMember> poppinMember){
        String[] poppinTitleList = {"Kasumi", "Tae", "Rimi", "Saaya", "Arisa"};
        for(String s : poppinTitleList){
            poppinMember.add(new BandMember(s));
        }

    }

    public void getPastelMember(ArrayList<BandMember> pastelMember){
        String[] pastelTitleList = {"Aya", "Hina", "Chisato", "Maya", "Eve"};
        for(String s : pastelTitleList){
            pastelMember.add(new BandMember(s));
        }

    }

    public void getAfterglowMember(ArrayList<BandMember> afterglowMember){
        String[] afterglowTitleList = {"Ran", "Moca", "Himari", "Tomoe", "Tsugumi"};
        for(String s : afterglowTitleList){
            afterglowMember.add(new BandMember(s));
        }
    }

    public void getHappyMember(ArrayList<BandMember> happyMember){
        String[] helloTitleList = {"Kokoro", "Kaoru", "Hagumi", "Kanon", "Misaki"};
        for(String s : helloTitleList){
            happyMember.add(new BandMember(s));
        }
    }
}
