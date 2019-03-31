package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class BandDataController {

    public ArrayList<Band> band = new ArrayList<>();
    public ArrayList<BandMember> bandMembers = new ArrayList<>();
    public ArrayList<BandMemberImage> bandMemberImages = new ArrayList<>();
    public HashMap<String, ArrayList<BandMemberImage>> map = new HashMap<>();
    public HashMap<String, HashMap<String, ArrayList<BandMemberImage>>> wholeBand = new HashMap<>();

    ArrayList<BandMemberImage> yukinaImage = new ArrayList<>();
    ArrayList<BandMemberImage> sayoImage = new ArrayList<>();
    ArrayList<BandMemberImage> lisaImage = new ArrayList<>();
    ArrayList<BandMemberImage> rinkoImage = new ArrayList<>();
    ArrayList<BandMemberImage> akoImage = new ArrayList<>();

    ArrayList<BandMemberImage> kasumiImage = new ArrayList<>();

    ArrayList<BandMemberImage> ranImage = new ArrayList<>();

    ArrayList<BandMemberImage> ayaImage = new ArrayList<>();

    ArrayList<BandMemberImage> kokoroImage = new ArrayList<>();

    HashMap<String, ArrayList<BandMemberImage>> roselia = new HashMap<>();
    HashMap<String, ArrayList<BandMemberImage>> poppin = new HashMap<>();
    HashMap<String, ArrayList<BandMemberImage>> pastel = new HashMap<>();
    HashMap<String, ArrayList<BandMemberImage>> afterglow = new HashMap<>();
    HashMap<String, ArrayList<BandMemberImage>> hellohappy = new HashMap<>();



    public ArrayList<Band> getBandArrayList(){
        Band b = new Band();
        b.getBandData(band);
        return band;
    }

    public ArrayList<BandMember> getBandMembersArrayList(String band){
        BandMember bm = new BandMember();
        if(band.equals("Roselia")){
            bm.getRoseliaMember(bandMembers);
        } else if (band.equals("Poppin' Party")){
            bm.getPoppinMember(bandMembers);
        } else if (band.equals("Pastel Palettes")){
            bm.getPastelMember(bandMembers);
        } else if (band.equals("Afterglow")){
            bm.getAfterglowMember(bandMembers);
        } else if (band.equals("Hello, Happy World!")){
            bm.getHappyMember(bandMembers);
        }
        return bandMembers;
    }

    public ArrayList<BandMemberImage> getBandMemberImagesArrayList(String band, String member){
        BandMemberImage bmi = new BandMemberImage();
        if(band.equals("Roselia")){
            if(member.equals("Yukina")){
                bmi.getYukinaRarity(4, bandMemberImages);
            } else if(member.equals("Sayo")){
                bmi.getSayoRarity(4, bandMemberImages);
            } else if(member.equals("Lisa")){
                bmi.getLisaRarity(4, bandMemberImages);
            } else if(member.equals("Ako")){
                bmi.getAkoRarity(4, bandMemberImages);
            } else if(member.equals("Rinko")){
                bmi.getRinkoRarity(4, bandMemberImages);
            }
        } else if (band.equals("Poppin' Party")){
            if(member.equals("Kasumi")){
                bmi.getKasumiRarity(4, bandMemberImages);
            }
        } else if (band.equals("Pastel Palettes")){
            if(member.equals("Aya")){
                bmi.getAyaRarity(4, bandMemberImages);
            }
        } else if (band.equals("Afterglow")){
            if(member.equals("Ran")){
                bmi.getRanRarity(4, bandMemberImages);
            }
        } else if (band.equals("Hello, Happy World!")){
            if(member.equals("Kokoro")){
                bmi.getKokoroRarity(4, bandMemberImages);
            }
        }
        return bandMemberImages;
    }

    public HashMap<String, ArrayList<BandMemberImage>> getRoseliaHash(String member){
        BandMemberImage bmi = new BandMemberImage();
        if(member.equals("Yukina")){
            bmi.getYukinaRarity(4, yukinaImage);
            roselia.put(member, yukinaImage);
        }  else if(member.equals("Sayo")){
            bmi.getSayoRarity(4, sayoImage);
            roselia.put(member, sayoImage);
        } else if(member.equals("Lisa")){
            bmi.getLisaRarity(4, lisaImage);
            roselia.put(member, lisaImage);
        } else if(member.equals("Ako")){
            bmi.getAkoRarity(4, akoImage);
            roselia.put(member, akoImage);
        } else if(member.equals("Rinko")){
            bmi.getRinkoRarity(4, rinkoImage);
            roselia.put(member, rinkoImage);
        }
        return roselia;
    }

    public HashMap<String, ArrayList<BandMemberImage>> getPoppinHash(String member){
        BandMemberImage bmi = new BandMemberImage();
        if(member.equals("Kasumi")){
            bmi.getKasumiRarity(4, kasumiImage);
            poppin.put(member, kasumiImage);
        }
        return poppin;
    }

    public HashMap<String, ArrayList<BandMemberImage>> getPastelHash(String member){
        BandMemberImage bmi = new BandMemberImage();
        if(member.equals("Aya")){
            bmi.getAyaRarity(4, ayaImage);
            pastel.put(member, ayaImage);
        }
        return pastel;
    }

    public HashMap<String, ArrayList<BandMemberImage>> getAfterglowHash(String member){
        BandMemberImage bmi = new BandMemberImage();
        if(member.equals("Ran")){
            bmi.getRanRarity(4, ranImage);
            afterglow.put(member, ranImage);
        }
        return afterglow;
    }

    public HashMap<String, ArrayList<BandMemberImage>> getHellohappyHash(String member){
        BandMemberImage bmi = new BandMemberImage();
        if(member.equals("Kokoro")){
            bmi.getKokoroRarity(4, kokoroImage);
            hellohappy.put(member, kokoroImage);
        }
        return hellohappy;
    }

    public HashMap<String, HashMap<String, ArrayList<BandMemberImage>>> getWholeBand(){
//        ArrayList<Band> b = getBandArrayList();
        for(Band band : band){
//            ArrayList<BandMember> bm = getBandMembersArrayList(band.getBandName());
            if(band.getBandName().equals("Roselia")){
               for(BandMember bandMember : bandMembers){
                   wholeBand.put(band.getBandName(), getRoseliaHash(bandMember.getBandMemberName()));
               }
            } else if (band.getBandName().equals("Poppin' Party")){
                for(BandMember bandMember : bandMembers){
                    wholeBand.put(band.getBandName(), getPoppinHash(bandMember.getBandMemberName()));
                }
            } else if (band.getBandName().equals("Pastel Palettes")){
                for(BandMember bandMember : bandMembers){
                    wholeBand.put(band.getBandName(), getPastelHash(bandMember.getBandMemberName()));
                }
            } else if (band.getBandName().equals("Afterglow")){
                for(BandMember bandMember : bandMembers){
                    wholeBand.put(band.getBandName(), getAfterglowHash(bandMember.getBandMemberName()));
                }
            } else if (band.getBandName().equals("Hello, Happy World!")){
                for(BandMember bandMember : bandMembers){
                    wholeBand.put(band.getBandName(), getHellohappyHash(bandMember.getBandMemberName()));
                }
            }
        }
        return wholeBand;
    }

    public void getTest(String band){

    }
}
