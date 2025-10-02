import java.util.Scanner;

public class AksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anda Dosen Atau Mahasiwa? ");
        String pilihan = sc.nextLine();
        int sks=0;

        if (pilihan.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses Wifi Diberikan (Dosen)");
        } else if (pilihan.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan Jumlah SKS Anda: ");
            sks = sc.nextInt();
        if (sks >= 12) {
            System.out.println("Akses Wifi Diberikan Kepada Anda");
        } else {
            System.out.println("Akses Ditolak, SKS Anda Kurang Dari 12 SKS");
        }
    } else {
        System.out.println("Akses Ditolak Anda Bukan Dosen atau Mahasiswa");
        }
    } 
}
