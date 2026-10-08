import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi dan Inisialisasi Variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();

        // Hitung Total Harga
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Cek Diskon (Jika totalHarga >= 100000)
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Hitung Total Bayar
        totalBayar = totalHarga - diskon;

        // Output Rincian
        System.out.println("Total harga         : Rp " + totalHarga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Total bayar         : Rp " + totalBayar);

        // Cek Pembayaran (Cukup / Kurang)
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian           : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        sc.close();
    }
}