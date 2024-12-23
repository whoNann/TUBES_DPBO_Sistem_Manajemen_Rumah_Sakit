class JadwalDokter {
    private String idJadwal;
    private String idDokter;
    private String hari;
    private LocalTime jamMulai;
    private LocalTime jamSelesai;
    private List<SlotKonsultasi> slotKonsultasi;

    public JadwalDokter(String idJadwal, String idDokter, String hari, 
                       LocalTime jamMulai, LocalTime jamSelesai) {
        this.idJadwal = idJadwal;
        this.idDokter = idDokter;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.slotKonsultasi = new ArrayList<>();
    }
    
    public void tampilkanJadwal() {
        System.out.println("Jadwal Dokter ID: " + idDokter);
        System.out.println("Hari: " + hari);
        System.out.println("Jam: " + jamMulai + " - " + jamSelesai);
    }

    public void updateJadwal(String hari, LocalTime jamMulai, LocalTime jamSelesai) {
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }
}
