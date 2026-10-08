import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jenis buku (Kamus/Novel/Lainnya): ");
        String jenisBuku = sc.nextLine();
        
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBeli = sc.nextInt();
        
        double diskon = 0;
        
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskon = 10;
            if (jumlahBeli > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 7;
            if (jumlahBeli > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBeli > 3) {
                diskon = 5;
            }
        }
        
        System.out.println("Total diskon yang didapatkan: " + diskon + "%");
        sc.close();
    }
}