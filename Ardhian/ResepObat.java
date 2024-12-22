class ResepObat {
    private String idResep;
    private String namaObat;
    private String dosis;
    private int jumlahObat;

    public ResepObat(String idResep, String namaObat, String dosis, int jumlahObat) {
        this.idResep = idResep;
        this.namaObat = namaObat;
        this.dosis = dosis;
        this.jumlahObat = jumlahObat;
    }

    public void buatResep() {
        System.out.println("Resep dibuat untuk " + namaObat + " dengan dosis " + dosis + " sebanyak " + jumlahObat + " unit.");
    }

    public void tampilkanResep() {
        System.out.println("Resep Obat:");
        System.out.println("ID Resep: " + idResep);
        System.out.println("Nama Obat: " + namaObat);
        System.out.println("Dosis: " + dosis);
        System.out.println("Jumlah Obat: " + jumlahObat);
    }
}
