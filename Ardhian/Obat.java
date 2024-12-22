class Obat {
    private String namaObat;
    private String kodeObat;
    private double hargaObat;
    private int jumlahStok;

    public Obat(String namaObat, String kodeObat, double hargaObat, int jumlahStok) {
        this.namaObat = namaObat;
        this.kodeObat = kodeObat;
        this.hargaObat = hargaObat;
        this.jumlahStok = jumlahStok;
    }

    public String getNamaObat() { return namaObat; }
    public String getKodeObat() { return kodeObat; }
    public double getHargaObat() { return hargaObat; }
    public int getJumlahStok() { return jumlahStok; }

    public void cekStok() {
        System.out.println("Stok untuk " + namaObat + ": " + jumlahStok + " unit.");
    }

    public void updateStok(int jumlah) {
        this.jumlahStok += jumlah;
        System.out.println("Stok untuk " + namaObat + " diperbarui menjadi: " + jumlahStok + " unit.");
    }
}
