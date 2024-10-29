public class Mobil extends Kendaraan {

    public Mobil(String nopol, String merk){
        super(nopol, merk);
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Mobil - No Polisi: " + getNopol() + ", Merk: " + getMerk() + ", Tersedia: " + isTersedia());
    }
}
