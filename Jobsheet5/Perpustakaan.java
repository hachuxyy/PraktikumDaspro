import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah Anda Membawa Kartu Tanda Mahasiswa? (Ya / Tidak): ");
        String ktm = sc.nextLine();
        System.out.print("Apakah Anda Melakukan Registrasi Online? (Ya / Tidak): ");
        String regis = sc.nextLine();

        if (ktm.equalsIgnoreCase("Ya") || regis.equalsIgnoreCase("Ya")) {
            System.out.println("Mahasiswa Diperbolehkan Masuk Perpustakaan");
        } else {
            System.out.println("Mahasiswa Tidak Diperbolehkan Masuk");
        }
    }
}
