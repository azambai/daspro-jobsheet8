
import java.util.Scanner;

public class TugasTiga02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);

        int nomorToko = 1;
        int totalPelanggan = 0;
        int totalBarangSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbaik = 0;

        while (nomorToko <= jumlahToko) {
            int jumlahPelangganToko;

            do {
                System.out.print(
                    "Jumlah pelanggan Toko " + nomorToko + ": "
                );
                jumlahPelangganToko = sc.nextInt();

                if (jumlahPelangganToko < 0) {
                    System.out.println(
                        "Jumlah pelanggan tidak boleh negatif."
                    );
                }
            } while (jumlahPelangganToko < 0);

            int nomorPelanggan = 1;
            int totalBarangToko = 0;

            while (nomorPelanggan <= jumlahPelangganToko) {
                int barang;

                do {
                    System.out.print(
                        "Barang yang dibeli Pelanggan "
                        + nomorPelanggan + " Toko "
                        + nomorToko + ": "
                    );
                    barang = sc.nextInt();

                    if (barang < 0) {
                        System.out.println(
                            "Jumlah barang tidak boleh negatif."
                        );
                    }
                } while (barang < 0);

                totalBarangToko += barang;
                nomorPelanggan++;
            }

            totalPelanggan += jumlahPelangganToko;
            totalBarangSemua += totalBarangToko;

            System.out.println(
                "Toko " + nomorToko
                + " - pelanggan: " + jumlahPelangganToko
                + ", total barang: " + totalBarangToko
            );

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbaik = nomorToko;
            }

            nomorToko++;
        }

        System.out.println("Total pelanggan seluruh toko: "
                + totalPelanggan);
        System.out.println("Total barang seluruh toko: "
                + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbaik);

        sc.close();
    }
}
