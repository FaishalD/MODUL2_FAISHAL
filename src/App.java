public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir = new TransportasiAir(5, 40000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();
        System.out.println();

        Sampan sampan = new Sampan(4, 40000, 4);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(5);

        Kapal kapal = new Kapal(30, 20000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
}
