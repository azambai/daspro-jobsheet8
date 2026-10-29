
import java.util.Scanner;

public class TugasSatu02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n harus minimal 1.");
        } else {
            int totalAngka = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalAngka++;
                }

                System.out.println();
            }

            System.out.println(
                "Total angka tercetak: " + totalAngka
            );
        }

        sc.close();
    }
}
