import java.util.Scanner;

public class PositifNegatif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan Angka: ");
        bilangan = sc.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan Ini Positif");
        } else {
            System.out.println("Bilangan Negatif");
        }
    }
}
