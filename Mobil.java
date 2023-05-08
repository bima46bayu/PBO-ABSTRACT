public abstract class Mobil {
    private String nomorKendaraan;
    private String warna;
    private String merk;
    private int dayaMobil = 100;
    private String jenisMobil;


    public void getNomorKendaraan() {
        System.out.println("Nomor kendaraan : "+nomorKendaraan);
    }

    public void getWarna() {
        System.out.println("Warna Mobil : "+warna);
    }

    public void getMerk() {
        System.out.println("Merk Mobil : "+merk);
    }

    public int getDayaMobil() {
        return dayaMobil;
    }

    public void getJenisMobil() {
        System.out.println("Jenis Mobil : "+jenisMobil);
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public abstract void hitungSewa(int jam);

    public abstract void getHorsePower();

    public Mobil(String nomorKendaraan, String warna, String merk) {
        this.nomorKendaraan = nomorKendaraan;
        this.warna = warna;
        this.merk = merk;
    }
}
