class HasilLab {
    private String idHasilLab;
    private String jenisPemeriksaan;
    private String hasil;

    public HasilLab(String idHasilLab, String jenisPemeriksaan, String hasil) {
        this.idHasilLab = idHasilLab;
        this.jenisPemeriksaan = jenisPemeriksaan;
        this.hasil = hasil;
    }

    public String getIdHasilLab() { return idHasilLab; }
    public String getJenisPemeriksaan() { return jenisPemeriksaan; }
    public String getHasil() { return hasil; }

    public void tampilkanHasil() {
        System.out.println("Hasil Lab:");
        System.out.println("ID Hasil Lab: " + idHasilLab);
        System.out.println("Jenis Pemeriksaan: " + jenisPemeriksaan);
        System.out.println("Hasil: " + hasil);
    }

    public void updateHasil(String hasil) {
        this.hasil = hasil;
        System.out.println("Hasil diperbarui.");
    }
}
