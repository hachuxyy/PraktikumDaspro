import java.util.Scanner;

public class Square18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.print("Masukkan Jumlah n : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
