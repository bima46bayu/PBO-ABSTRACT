public class MobilPenumpang extends Mobil{
    private String tipeKendaraan;
    private String turboMode = "off";

    public void getTipeKendaraan() {
        System.out.println("Tipe Mobil : "+tipeKendaraan);
    }

    public String getTurboMode() {
        return turboMode;
    }


    @Override
    public void hitungSewa(int jam) {
        int hargasewa = 50_000 * jam;
        System.out.println("Harga Sewa Mobil : "+hargasewa);
    }

    @Override
    public void getHorsePower() {
        if(tipeKendaraan.equalsIgnoreCase("sport")){
            if(turboMode.equalsIgnoreCase("on")){
                System.out.println("Daya Mobil : "+(super.getDayaMobil()+30)+"Hp");
            }
            else{
                System.out.println("Daya Mobil : "+super.getDayaMobil()+"Hp");
            }
        }
        else{
            System.out.println("Daya Mobil : "+super.getDayaMobil()+"Hp");
        }
    }

    public void turboSwitch(){
       if (tipeKendaraan.equalsIgnoreCase("sport")){
           if (turboMode.equalsIgnoreCase("off")){
               turboMode = "on";
               System.out.println("Turbo Mode Activated");
           }
           else{
               turboMode = "off";
               System.out.println("Turbo Mode Deactivated");
           }
       }
       else {
           System.out.println("Mobil tidak memiliki mode turbo");
       }
    }

    public MobilPenumpang(String nomorKendaraan, String warna, String merk, String tipeKendaraan) {
        super(nomorKendaraan, warna, merk);
        this.tipeKendaraan = tipeKendaraan;
        super.setJenisMobil("Mobil Penumpang");
    }
}
