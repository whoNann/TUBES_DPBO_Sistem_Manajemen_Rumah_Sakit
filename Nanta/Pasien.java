class Pasien extends Orang {
    private int umur;
    private String jenisKelamin;
    private String riwayatMedis;

    public Pasien(String id, String nama, String alamat, String nomorTelepon, int umur, String jenisKelamin, String riwayatMedis) {
        super(id, nama, alamat, nomorTelepon);
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.riwayatMedis = riwayatMedis;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Informasi Pasien:");
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Telepon: " + getNomorTelepon());
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Riwayat Medis: " + riwayatMedis);
    }
}