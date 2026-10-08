import java.util.Scanner;

public class Tugas1No10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaLaptop, uangMuka, sisaHarga;
        int lamaCicilan;
        double bungaPerBulan, pokokCicilan, totalCicilanPerBulan;

        System.out.println("Masukkan Harga laptop Rp = ");
        hargaLaptop = sc.nextDouble();

        System.out.println("Masukkan uang muka Rp = ");
        uangMuka = sc.nextDouble();

        System.out.println("Masukkan lama cicilan per bulan = ");
        lamaCicilan = sc.nextInt();

        sisaHarga = hargaLaptop - uangMuka;
        bungaPerBulan = 0.02 * sisaHarga;
        pokokCicilan = sisaHarga / lamaCicilan;
        totalCicilanPerBulan = pokokCicilan + bungaPerBulan;

        System.out.println("----------------------------------------------------------");
        System.out.println("Jumlah cicilan per bulan Rp. " + (long) totalCicilanPerBulan);

        sc.close();


    }
}