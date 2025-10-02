import java.util.Scanner;

public class ifCetakKRS18Copy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----Cetak KRS Siakad----");
        System.out.print("Apakah UKT Sudah Lunas? (True or False): ");
        boolean uktLunas = input.nextBoolean();
        String pesan;

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS dan Minta Tanda Tangan DPA");
        }
        else {
            System.out.println("Registrasi Ditolak, Silahkan Lunasi UKT Terlebih Dahulu");
        }
    }
}