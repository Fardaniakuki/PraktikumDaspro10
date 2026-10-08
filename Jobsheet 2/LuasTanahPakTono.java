public class LuasTanahPakTono {
    public static void main(String[] args) {
        double lebar = 30;
        double panjang = 100;
        double diameterKolam = 5;
        double sisiTaman = 2;

        double luasTanah = panjang * lebar;
        double jarijariKolam = diameterKolam / 2;
        double luasKolam = Math.PI * jarijariKolam * jarijariKolam;

        double luasTaman = sisiTaman * sisiTaman;
        double luasTanahSisa = luasTanah - luasKolam -luasTaman;

        System.out.println("-- Perhitungan Sisa Tanah Pak Tono --");
        System.out.println("Luas Tanah Total = "+luasTanah +" meter persegi");
        System.out.println("luas Kolam Ikan = "+luasKolam +" meter persegi");
        System.out.println("Luas Taman Total = "+luasTaman +" meter persegi");
        System.out.println("luas Tanah Sisa = "+luasTanahSisa +" meter persegi");
    }
}