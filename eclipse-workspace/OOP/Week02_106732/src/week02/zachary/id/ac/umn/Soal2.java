package week02.zachary.id.ac.umn;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        boolean prima = true;

        if (angka <= 1){
            prima = false;
        } else {
            for (int i = 2; i <= angka / 2; i++){
                if (angka % i == 0){
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println("Angka " + angka + " adalah angka prima");
        } else {
            System.out.println("Angka " + angka + " adalah bukan angka prima");
        }
    }
}