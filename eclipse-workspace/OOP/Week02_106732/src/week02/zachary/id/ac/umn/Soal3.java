package week02.zachary.id.ac.umn;
import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai terkecil: ");
        int min = scanner.nextInt();

        System.out.print("Masukan nilai terbesar: ");
        int max = scanner.nextInt();

        int jumlah = 0;

        for (int angka = min; angka <= max; angka++){
            if (isPrima(angka)){
                jumlah += angka;
            }
        }

        System.out.println("Jumlah dari semua nilai prima dari " + min + " sampai " + max + " adalah " + jumlah);

        scanner.close();
    }

    public static boolean isPrima(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}