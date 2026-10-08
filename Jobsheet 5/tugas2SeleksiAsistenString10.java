import java.util.Scanner;

public class tugas2SeleksiAsistenString10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mahasiswa berstatus aktif? (iya/tidak) : ");
        String statusAktif = sc.nextLine();

        System.out.print("Mahasiswa sedang mendapat sanksi? (iya/tidak) : ");
        String sanksi = sc.nextLine();

        if (statusAktif.equalsIgnoreCase("iya") && sanksi.equalsIgnoreCase("tidak")) {
            System.out.print("Nilai Dasar Pemrograman : ");
            int nilaidaspro = sc.nextInt();
            sc.nextLine();

            System.out.print("Mahasiswa Memiliki Sertif? (iya/tidak) : ");
            String sertif = sc.nextLine();

            if (nilaidaspro >= 80 || sertif.equalsIgnoreCase("iya")) {
                System.out.print("Nilai wawancara mahasiswa : ");
                int nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat anda diterima sebaga asisten dosen");
                } else {
                    System.out.println("Maaf nilai wawancara anda kurang");
                }
            } else {
                System.out.println(
                        "Maaf anda ditolak karena nilai dasar pemrograman tidak mencukup atau tidak memiliki sertif");
            }
        } else {
            System.out.println("Maaf anda ditolak karena tidak berstatus mahasiswa atau sedang mendapatkan sanksi");
        }
        sc.close();
    }
}