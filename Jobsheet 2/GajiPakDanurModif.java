import java.util.Scanner;
public class GajiPakDanurModif{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Gaji Pokok = ");
    int gajiPokok = sc.nextInt();

    System.out.print("Masukkan Jumlah Tunjangan Per Anak = ");
    int tunjanganPerAnak = sc.nextInt();

    System.out.print("Masukkan Jumlah Anak = ");
    int jumlahAnak = sc.nextInt();

    double potonganPensiun = 0.10;


    int totalTunjangan = tunjanganPerAnak * jumlahAnak;
    double totalPotongan = gajiPokok * potonganPensiun;
    double gajiBersih = gajiPokok + totalTunjangan - totalPotongan;

    System.out.println("-- Gaji Bersih Pak Danur --");
    System.out.println("Total Tunjangan Per Anak   = "+totalTunjangan);
    System.out.println("Total Potongan Pensiunan   = "+totalPotongan);
    System.out.println("Total Gaji Bersih = "+gajiBersih);

    sc.close();
    }
}