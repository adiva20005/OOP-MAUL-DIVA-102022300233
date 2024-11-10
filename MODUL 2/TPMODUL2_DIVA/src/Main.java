public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║              DETAIL HEWAN                  ║");
        System.out.println("╚════════════════════════════════════════════╝\n");
        
        Kucing kucing = new Kucing("Momo", 2, "Persia");
        kucing.perkenalan();
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");
        System.out.println();
        
        Burung burung = new Burung("Rio", 1, "Hijau");
        burung.perkenalan();
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");
        
        kucing.infoHewan();
        burung.infoHewan();
    }
}