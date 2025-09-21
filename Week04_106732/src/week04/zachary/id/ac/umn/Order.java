package week04.zachary.id.ac.umn;

public class Order {
	private int id;
    private int jumlah;
    private Barang barang;
    private int total;

    public Order() {}

    public Order(int id, Barang barang, int jumlah) {
        this.id = id;
        this.barang = barang;
        this.jumlah = jumlah;
        this.total = barang.getHarga() * jumlah;
    }

    public int getId() {
        return this.id;
    }

    public Barang getBarang() {
        return this.barang;
    }

    public int getJumlah() {
        return this.jumlah;
    }
    
    public int getTotal() {
        return this.total;
    }
}