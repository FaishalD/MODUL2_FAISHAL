public class Sampan extends TransportasiAir {
    protected int layar;

    Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public void informasi() {
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    
    public void berlayar() {
        System.out.println("Transportasi Air dengan jenis Sampan sedang berlayar dengan 2 layar");
    }

    public void berlabuh() {
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar) {
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai menggunakan "+jangkar+" jangkar");
    }
}
