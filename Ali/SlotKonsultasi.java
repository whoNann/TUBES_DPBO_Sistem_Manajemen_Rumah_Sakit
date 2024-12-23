class SlotKonsultasi {
    private String idSlot;
    private String idJadwal;
    private LocalTime waktuSlot;
    private boolean statusTerisi;

    public SlotKonsultasi(String idSlot, String idJadwal, LocalTime waktuSlot) {
        this.idSlot = idSlot;
        this.idJadwal = idJadwal;
        this.waktuSlot = waktuSlot;
        this.statusTerisi = false;
    }

    public boolean ambilSlot() {
        if (!statusTerisi) {
            statusTerisi = true;
            return true;
        }
        return false;
    }

    public void updateSlot(boolean status) {
        this.statusTerisi = status;
    }
}
