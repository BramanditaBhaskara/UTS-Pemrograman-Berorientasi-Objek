import java.util.ArrayList;

public class Rental {
    private ArrayList<Kendaraan> daftarKendaraan;
    private ArrayList<Pelanggan> daftarPelanggan;

    public Rental(){
        daftarKendaraan = new ArrayList<>();
        daftarPelanggan = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan){
        daftarKendaraan.add(kendaraan);
    }

    public void tambahPelanggan(Pelanggan pelanggan){
        daftarPelanggan.add(pelanggan);
    }

    public Kendaraan cariKendaraan(String nopol){
        for(Kendaraan kendaraan : daftarKendaraan){
            if (kendaraan.getNopol().equals(nopol) && kendaraan.isTersedia()) {
                return kendaraan;
            }
        }
        return null;
    }

    public void tampilkanKendaraan(){
        System.out.println("Daftar Kendaraan:");
        for(Kendaraan kendaraan : daftarKendaraan){
            kendaraan.tampilkanInfo();
        }
    }

    public void tampilkanPelanggan(){
        System.out.println("Daftar Pelanggan:");
        for (Pelanggan pelanggan : daftarPelanggan){
            System.out.println("Nama: " + pelanggan.getNama() + ", ID: " + pelanggan.getIdPelanggan());

            pelanggan.tampilkanKendaraanDisewa();
        }
    }

    public ArrayList<Pelanggan>getDaftarPelanggan(){
        return daftarPelanggan;
    }
}
