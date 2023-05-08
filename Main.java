public class Main {
    public static void main(String[] args) {

        MobilAngkutan camry = new MobilAngkutan("AB 4511 SI", "Merah", "Toyota Camry", 650);
        camry.getJenisMobil();
        camry.getNomorKendaraan();
        camry.getWarna();
        camry.getMerk();
        camry.getMaksimumMuatan();
        camry.getHorsePower();
        camry.hitungSewa(6);

        System.out.println("========================================================");

        MobilPenumpang raize = new MobilPenumpang("AB 6969 AP", "Hitam", "Toyota Raize", "sport");
        raize.getJenisMobil();
        raize.getNomorKendaraan();
        raize.getWarna();
        raize.getMerk();
        raize.getTipeKendaraan();
        raize.getHorsePower();
        raize.turboSwitch();
        raize.getHorsePower();
        raize.turboSwitch();
        raize.getHorsePower();
        raize.hitungSewa(6);

        System.out.println("========================================================");

        MobilPenumpang grandMax = new MobilPenumpang("AB 5472 LC", "Maroon", "Daihatsu Grand Max", "regular");
        grandMax.getJenisMobil();
        grandMax.getNomorKendaraan();
        grandMax.getWarna();
        grandMax.getMerk();
        grandMax.getTipeKendaraan();
        grandMax.getHorsePower();
        grandMax.turboSwitch();
        grandMax.getHorsePower();
        grandMax.hitungSewa(6);
    }
}