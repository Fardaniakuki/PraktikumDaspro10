import  java.util.Scanner;

public class Tugas2NoAbsen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int biayaCetakPerLembar = 500;
        int biayaJilid = 5000;
        int totalBiayaLembaran;
        int totalBiaya;

        System.out.println("Masukkan jumlah lembar dokumen yang dicetak: ");
        jumlahLembar = sc.nextInt();

        totalBiayaLembaran = jumlahLembar * biayaCetakPerLembar;
        totalBiaya = totalBiayaLembaran + biayaJilid;

        System.out.println("----------------------------------------------------");
        System.out.println("Total biaaya cetak lembaran Rp. "+ totalBiayaLembaran);
        System.out.println("Total biaya yang harus dibayar Rp. " + totalBiaya);

        sc.close();
    }
}