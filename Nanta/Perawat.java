class Perawat extends Orang {
    private String ruangTugas;
    private String jadwalJaga;

    public Perawat(String id, String nama, String alamat, String nomorTelepon, String ruangTugas, String jadwalJaga) {
        super(id, nama, alamat, nomorTelepon);
        this.ruangTugas = ruangTugas;
        this.jadwalJaga = jadwalJaga;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Informasi Perawat:");
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Telepon: " + getNomorTelepon());
        System.out.println("Ruang Tugas: " + ruangTugas);
        System.out.println("Jadwal Jaga: " + jadwalJaga);
    }
}