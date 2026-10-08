import java.util.Scanner;

public class Tugas2PemilihanNoPresensi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah SKS : ");
        int JumlahSKS = sc.nextInt();

        if (JumlahSKS > 24){
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS Valid");
        }
        sc.close();
    }
}