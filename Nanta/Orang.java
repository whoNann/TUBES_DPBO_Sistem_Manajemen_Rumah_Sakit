abstract class Orang {
    private String id;
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Orang(String id, String nama, String alamat, String nomorTelepon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public abstract void tampilkanInformasi();

    // Getter
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getNomorTelepon() { return nomorTelepon; }
}