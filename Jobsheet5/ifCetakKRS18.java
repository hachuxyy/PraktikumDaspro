import java.util.Scanner;

public class ifCetakKRS18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Cetak KRS Siakad----");
        System.out.print("Apakah UKT Sudah Lunas? (True or False): ");
        boolean uktLunas = sc.nextBoolean();
        String pesan;

        pesan = (uktLunas) ? "Pembayaran UKT Terverifikasi \n Silahkan Cetak KRS dan Minta Tanda Tangan DPA" : "Registrasi Ditolak, Silahkan Lunasi UKT Terlebih Dahulu";
        System.out.println(pesan);
    }   
}