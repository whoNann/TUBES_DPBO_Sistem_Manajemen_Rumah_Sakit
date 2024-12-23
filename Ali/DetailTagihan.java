class DetailTagihan {
    private String idLayanan;
    private String namaLayanan;
    private double biayaLayanan;

    public DetailTagihan(String idLayanan, String namaLayanan, double biayaLayanan) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.biayaLayanan = biayaLayanan;
    }

    public void tampilkanDetail() {
        System.out.println(idLayanan + " - " + namaLayanan + ": Rp." + biayaLayanan);
    }

    public void tambahLayanan(String namaLayanan, double biaya) {
        this.namaLayanan = namaLayanan;
        this.biayaLayanan = biaya;
    }

     public double getBiayaLayanan() {
        return biayaLayanan;
    }
}
