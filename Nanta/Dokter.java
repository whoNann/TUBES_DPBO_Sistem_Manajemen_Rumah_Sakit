class Dokter extends Orang {
    private String spesialisasi;
    private String jadwalPraktek;
    private double gajiPokok;

    public Dokter(String id, String nama, String alamat, String nomorTelepon, String spesialisasi, String jadwalPraktek, double gajiPokok) {
        super(id, nama, alamat, nomorTelepon);
        this.spesialisasi = spesialisasi;
        this.jadwalPraktek = jadwalPraktek;
        this.gajiPokok = gajiPokok;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Informasi Dokter:");
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Telepon: " + getNomorTelepon());
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Jadwal Praktek: " + jadwalPraktek);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}