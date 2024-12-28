class Laboratorium {
    private String idLaboratorium;
    private String namaLaboratorium;
    private String fasilitas;

    public Laboratorium(String idLaboratorium, String namaLaboratorium, String fasilitas) {
        this.idLaboratorium = idLaboratorium;
        this.namaLaboratorium = namaLaboratorium;
        this.fasilitas = fasilitas;
    }

    public String getIdLaboratorium() { return idLaboratorium; }
    public String getNamaLaboratorium() { return namaLaboratorium; }
    public String getFasilitas() { return fasilitas; }

    public void lakukanPemeriksaan() {
        System.out.println("Pemeriksaan dilakukan di " + namaLaboratorium + ".");
    }

    public void tampilkanHasilLab() {
        System.out.println("Hasil pemeriksaan laboratorium dari " + namaLaboratorium + ".");
    }
}
