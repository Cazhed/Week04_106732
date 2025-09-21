package week04.zachary.id.ac.umn;
import java.util.Scanner;

public class MainToko {
	static Scanner scanner = new Scanner(System.in);
    static Barang[] daftarBarang = new Barang[5];
    static Order pesanan;

    public static void seedBarang() {
        daftarBarang[0] = new Barang(1, "Pulpen Easy Gel 0.5mm", 120, 2000);
        daftarBarang[1] = new Barang(2, "Penggaris 30cm", 20, 5000);
        daftarBarang[2] = new Barang(3, "Tipe-x Roller", 30, 7000);
        daftarBarang[3] = new Barang(4, "Pensil Mekanik", 50, 5000);
        daftarBarang[4] = new Barang(5, "Buku Tulis", 100, 6000);
    }

    public static void showMenu() {
        System.out.println("\n-----------Menu Toko Multiguna-----------");
        System.out.println("1. Pesan Barang");
        System.out.println("2. Lihat Pesanan");
        System.out.print("Pilihan : ");
    }

    public static void pesanBarang() {
        System.out.println("Daftar Barang Toko Multiguna");
        for (Barang barang : daftarBarang) {
            System.out.println("-----------------------------------------");
            System.out.println("ID    : " + barang.getId());
            System.out.println("Nama  : " + barang.getNama());
            System.out.println("Stock : " + barang.getStock());
            System.out.println("Harga : " + barang.getHarga());
        }
        System.out.println("-----------------------------------------");
        System.out.println("Ketik 0 untuk batal");
        System.out.print("Pesan Barang (ID) : ");
        int idInput = scanner.nextInt();

        if (idInput == 0) {
            return;
        }

        Barang barangDipesan = null;
        for (Barang barang : daftarBarang) {
            if (barang.getId() == idInput) {
                barangDipesan = barang;
                break;
            }
        }

        if (barangDipesan == null) {
            System.out.println("ID Barang Tidak Sesuai Pilihan");
            return;
        }

        System.out.print("Masukkan Jumlah : ");
        int jumlahInput = scanner.nextInt();

        if (jumlahInput <= 0 || jumlahInput > barangDipesan.getStock()) {
            System.out.println("Jumlah Barang Tidak Sesuai Stock");
            return;
        }

        int totalHarga = barangDipesan.getHarga() * jumlahInput;
        System.out.println(jumlahInput + " @ " + barangDipesan.getNama() + " dengan total harga " + totalHarga);

        System.out.print("Masukkan jumlah uang : ");
        int uangInput = scanner.nextInt();

        if (uangInput < totalHarga) {
            System.out.println("Jumlah uang tidak mencukupi");
            return;
        }

        barangDipesan.minusStock(jumlahInput);
        pesanan = new Order(barangDipesan.getId(), barangDipesan, jumlahInput);
        System.out.println("Berhasil dipesan");
    }

    public static void lihatPesanan() {
        if (pesanan == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        System.out.println("Daftar Pesanan Toko Multiguna");
        System.out.println("-----------------------------------------");
        System.out.println("ID     : " + pesanan.getBarang().getId());
        System.out.println("Nama   : " + pesanan.getBarang().getNama());
        System.out.println("Jumlah : " + pesanan.getJumlah());
        System.out.println("Total  : " + pesanan.getTotal());
        System.out.println("-----------------------------------------");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seedBarang();
        int pilihan;
        
        while (true) {
            showMenu();
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    pesanBarang();
                    break;
                case 2:
                    lihatPesanan();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}