import java.util.Scanner;

public class LuasTanahPakTonoModif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Tanah = ");
        double panjangTanah = sc.nextDouble();

        System.out.print("Masukkan Lebar Tanah = ");
        double lebarTanah = sc.nextDouble();

        System.out.print("Masukkan Diameter Kolam = ");
        double diameterKolam = sc.nextDouble();

        System.out.print("Masukkan Panjang Sisi Taman = ");
        double sisiTaman = sc.nextDouble();

        double luasTanah = panjangTanah * lebarTanah;
        double jarijariKolam = diameterKolam / 2;
        double luasKolam = Math.PI * jarijariKolam * jarijariKolam;
        double luasTaman = sisiTaman * sisiTaman;
        double luasTanahSisa = luasTanah - luasKolam - luasTaman;

        System.out.println("-- Tanah Sisa Pak Tono --");
        System.out.println("Luas Tanah Total = "+luasTanah+" meter persegi");
        System.out.println("Luas Kolam Ikan = "+luasKolam+" meter persegi");
        System.out.println("Luas Taman = "+luasTaman+" meter persegi");
        System.out.println("Luas Tanah Sisa = "+luasTanahSisa+" meter persegi");

        sc.close();
    }
}