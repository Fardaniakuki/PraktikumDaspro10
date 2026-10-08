public class GajiPakDanur {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganPerAnak = 100000;
        int jumlahAnak = 4;
        double potonganPensiun = 0.10;

        int totalTunjangan = tunjanganPerAnak * jumlahAnak;
        double totalPotongan = gajiPokok * potonganPensiun;
        double gajiBersih = gajiPokok + totalTunjangan - totalPotongan;


        System.out.println("--- Gaji Pak Danur ---");
        System.out.println("Gaji Pokok      = "+gajiPokok);
        System.out.println("Total Tunjangan = "+totalTunjangan);
        System.out.println("Total Potongan  = "+totalPotongan);
        System.out.println("Gaji Bersih     = "+ gajiBersih);
    }
    
}
