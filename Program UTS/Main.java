
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ujian Tengah Semester");
        System.out.println("Nama: I Putu Bramandita Bhaskara Udiana Putra");
        System.out.println("NIM: 2315101008");
        
        Scanner scanner = new Scanner(System.in);
        Rental rental = new Rental();

         // Tambahkan beberapa kendaraan ke daftar
         rental.tambahKendaraan(new Mobil("DK 1617 FAK", "Toyota Kijang Innova Reborn 2020"));
         rental.tambahKendaraan(new Motor("DK 6569 ZP", "Yamaha Xmax 2023"));
         rental.tambahKendaraan(new Mobil("DK 1589 ADO", "Honda Brio Satya 2019"));
         rental.tambahKendaraan(new Motor("DK 4405 GAC", "Suzuki Burgman 2024")); 
         
         boolean running = true;
         while (running){
            System.out.println("\nSelamat Datang di Rental Pak Sadikin");
            System.out.println("Menu:");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Sewa Kendaraan");
            System.out.println("3. Tampilkan Kendaraan");
            System.out.println("4. Tampilkan Pelanggan dan Sewa");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline
            
            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("ID Pelanggan: ");
                    String idPelanggan = scanner.nextLine();
                    rental.tambahPelanggan(new Pelanggan(nama, idPelanggan));
                    System.out.println("Pelanggan ditambahkan.");
                    break;
                case 2:
                    System.out.print("ID Pelanggan: ");
                    idPelanggan = scanner.nextLine();
                    Pelanggan pelanggan = null;
                    for (Pelanggan p : rental.getDaftarPelanggan()) {
                        if (p.getIdPelanggan().equals(idPelanggan)) {
                            pelanggan = p;
                            break;
                        }
                    }
                    if (pelanggan == null) {
                        System.out.println("Pelanggan tidak ditemukan.");
                        break;
                    }
                    System.out.print("No Polisi Kendaraan yang ingin disewa: ");
                    String noPolisi = scanner.nextLine();
                    Kendaraan kendaraan = rental.cariKendaraan(noPolisi);
                    if (kendaraan != null) {
                        pelanggan.sewaKendaraan(kendaraan);
                        System.out.println("Kendaraan berhasil disewa.");
                    } else {
                        System.out.println("Kendaraan tidak tersedia.");
                    }
                    break;
                    case 3:
                    rental.tampilkanKendaraan();
                    break;
                case 4:
                    rental.tampilkanPelanggan();
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi Rental.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}    