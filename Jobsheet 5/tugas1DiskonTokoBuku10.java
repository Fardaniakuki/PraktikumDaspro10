import java.util.Scanner;

public class tugas1DiskonTokoBuku10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jenis buku yang dibeli: (kamus/novel/lainnya) : ");
        String jenisBuku = sc.nextLine();

        System.out.print("Jumlah Buku yang dibeli : ");
        int jumlahBuku = sc.nextInt();

        int diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        }else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            }else{
                diskon += 1;
            }
        }else{
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        }
        System.out.println("Jumlah diskon yng diberikan adalah "+ diskon + "%");
        sc.close();
    }
}