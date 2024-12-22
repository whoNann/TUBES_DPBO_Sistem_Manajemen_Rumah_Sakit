class Ruangan {
    private String idRuangan;
    private String namaRuangan;
    private int kapasitasTempatTidur;

    public Ruangan(String idRuangan, String namaRuangan, int kapasitasTempatTidur) {
        this.idRuangan = idRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitasTempatTidur = kapasitasTempatTidur;
    }

    public void tampilkanInformasiRuangan() {
        System.out.println("Informasi Ruangan:");
        System.out.println("ID Ruangan: " + idRuangan);
        System.out.println("Nama Ruangan: " + namaRuangan);
        System.out.println("Kapasitas Tempat Tidur: " + kapasitasTempatTidur);
    }

    public void updateKapasitas(int kapasitas) {
        this.kapasitasTempatTidur = kapasitas;
        System.out.println("Kapasitas ruangan diperbarui menjadi: " + kapasitasTempatTidur);
    }
}
