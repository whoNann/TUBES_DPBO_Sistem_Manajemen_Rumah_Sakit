class RekamMedis {
    private String idRekamMedis;
    private String riwayatPemeriksaan;
    private String resepObat;

    public RekamMedis(String idRekamMedis, String riwayatPemeriksaan, String resepObat) {
        this.idRekamMedis = idRekamMedis;
        this.riwayatPemeriksaan = riwayatPemeriksaan;
        this.resepObat = resepObat;
    }

    public void tambahRekamMedis(String riwayatPemeriksaan, String resepObat) {
        this.riwayatPemeriksaan = riwayatPemeriksaan;
        this.resepObat = resepObat;
    }

    public void ambilRiwayatMedis() {
        System.out.println("Riwayat Pemeriksaan: " + riwayatPemeriksaan);
        System.out.println("Resep Obat: " + resepObat);
    }
}
