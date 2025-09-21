package week04.zachary.id.ac.umn;

public class Barang {
	private int id, stock, harga;
    private String nama;

    public Barang(int id, String nama, int stock, int harga) {
        this.id = id;
        this.nama = nama;
        this.stock = stock;
        this.harga = harga;
    }

    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStock() {
        return this.stock;
    }

    public int getHarga() {
        return this.harga;
    }

    public void minusStock(int qty) {
        this.stock -= qty;
    }
}