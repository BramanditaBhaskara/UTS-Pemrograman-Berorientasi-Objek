import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String idPelanggan;
    private ArrayList<Kendaraan> daftarKendaraanDisewa;

    public Pelanggan(String nama, String idPelanggan){
        this.nama = nama;
        this.idPelanggan = idPelanggan;
        this.daftarKendaraanDisewa = new ArrayList<> ();
    }

    public String getNama() {
        return nama;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void sewaKendaraan(Kendaraan kendaraan) {
        daftarKendaraanDisewa.add(kendaraan);
        kendaraan.setTersedia(false);
    }

    public void tampilkanKendaraanDisewa() {
        System.out.println("Kendaraan disewa oleh " + nama + ":");
        for (Kendaraan kendaraan : daftarKendaraanDisewa) {
            kendaraan.tampilkanInfo();
        }
    }
}
