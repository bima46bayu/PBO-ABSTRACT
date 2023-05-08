public class MobilAngkutan extends Mobil{
    private int maksimumMuatan;

    public void getMaksimumMuatan() {
        System.out.println("Maksimum Muatan Mobil : "+maksimumMuatan+"Kg");
    }

    @Override
    public void hitungSewa(int jam) {
        int hargasewa = 75_000 * jam;
        System.out.println("Harga Sewa Mobil : "+hargasewa);
    }

    @Override
    public void getHorsePower() {
        System.out.println("Daya Mobil : "+getDayaMobil()+"Hp");
    }

    public MobilAngkutan(String nomorKendaraan, String warna, String merk, int maksimumMuatan) {
        super(nomorKendaraan, warna, merk);
        this.maksimumMuatan = maksimumMuatan;
        super.setJenisMobil("Mobil Angkutan");
    }
}
