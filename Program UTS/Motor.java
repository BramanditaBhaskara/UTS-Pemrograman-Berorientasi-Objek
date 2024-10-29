public class Motor extends Kendaraan {
    public Motor(String nopol, String merk){
        super(nopol, merk);
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Motor - No Polisi: " + getNopol() + ", Merk: " + getMerk() + ", Tersedia: " + isTersedia());
    }
}
