import java.util.Scanner;

public class Nilaikelompok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j, i=1, nilai;
        float totalNilai, rataNilai;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j<=5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata rata = " + rataNilai);
            i++;
            System.out.println();
            }
        }
    }

