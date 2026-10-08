import java.util.Scanner;

public class TugasAntreanNoPresensi10 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Masukkan kode layanan (1-4) : ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Kode Layanan Legalisir ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Kode Layanan Surat Keterangan Aktif Kuliah");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Kode Layanan Pembayaran UKT");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Kode Layanan Pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;        
            default:
                System.out.println("Kode Layanan Tidak Tersedia");
                break;
        }
        sc.close();
    }
}