import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan Angka: ");
        angka = sc.nextInt();

       if (angka % 2 == 0){
        System.out.println("Angka adalah Genap");
       }else {
        System.out.println("Angka adalah Ganjil");
       }
    }
}
