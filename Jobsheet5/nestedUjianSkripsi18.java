import java.util.Scanner;
public class nestedUjianSkripsi18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah Mahasiswa Sudah Bebas Dari Kompen? (Ya / Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan Jumlah Log Bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan Jumlah Log Bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >=4) {
                pesan = "Semua Syarat Terpenuhi, Mahasiswa diperbolehkan Mendaftar Ujian Skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 <4) {
                pesan = "Gagal! Log Bimbingan P1 Kurang Dari 8 Kali dan P2 Kurang dari 4 Kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log Bimbingan P1 Belum Mencapai 8 Kali";
            } else if (bimbinganP2 < 4) {
                pesan = "Gagal! Log Bimbingan P2 Belum Mencapai 4 Kali";
            } else {
                pesan = "Gagal! Mahasiswa Masih Mempunyai Tanggungan Kompen!";
            }
            System.out.println(pesan);
            }
        }
    }
