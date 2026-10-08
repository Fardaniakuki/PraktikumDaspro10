import java.util.Scanner;

public class TugasParkirNoPresensi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = sc.nextInt();
        int totalTarif;

        if (lamaParkir <= 2) {
            totalTarif = 2000;
        } else {
            totalTarif = 2000 + ((lamaParkir - 2) * 1000);
        }

        System.out.println("Total tarif parkir: Rp " + totalTarif);

        sc.close();
    }
}