public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Orang> orangList = new ArrayList<>();
        ArrayList<RekamMedis> rekamMedisList = new ArrayList<>();
        ArrayList<ResepObat> resepObatList = new ArrayList<>();
        ArrayList<Obat> obatList = new ArrayList<>();
        ArrayList<Ruangan> ruanganList = new ArrayList<>();
        ArrayList<TempatTidur> tempatTidurList = new ArrayList<>();
        ArrayList<Pembayaran> pembayaranList = new ArrayList<>();
        ArrayList<Tagihan> tagihanList = new ArrayList<>();
        ArrayList<DetailTagihan> detailTagihanList = new ArrayList<>();
        ArrayList<JadwalDokter> jadwalDokterList = new ArrayList<>();
        ArrayList<SlotKonsultasi> slotKonsultasiList = new ArrayList<>();
        ArrayList<Laboratorium> laboratoriumList = new ArrayList<>();
        ArrayList<HasilLab> hasilLabList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tambah Dokter");
            System.out.println("3. Tambah Perawat");
            System.out.println("4. Tampilkan Semua Orang");
            System.out.println("5. Tambah Rekam Medis");
            System.out.println("6. Tampilkan Rekam Medis");
            System.out.println("7. Tambah Resep Obat");
            System.out.println("8. Tampilkan Resep Obat");
            System.out.println("9. Tambah Obat");
            System.out.println("10. Tampilkan Obat");
            System.out.println("11. Tambah Ruangan");
            System.out.println("12. Tampilkan Ruangan");
            System.out.println("13. Tambah Tempat Tidur");
            System.out.println("14. Tampilkan Tempat Tidur");
            System.out.println("15. Tambah Pembayaran");
            System.out.println("16. Tampilkan Pembayaran");
            System.out.println("17. Tambah Tagihan");
            System.out.println("18. Tampilkan Tagihan");
            System.out.println("19. Tambah Detail Tagihan");
            System.out.println("20. Tampilkan Detail Tagihan");
            System.out.println("21. Tambah Jadwal Dokter");
            System.out.println("22. Tampilkan Jadwal Dokter");
            System.out.println("23. Tambah Slot Konsultasi");
            System.out.println("24. Tampilkan Slot Konsultasi");
            System.out.println("25. Tambah Laboratorium");
            System.out.println("26. Tampilkan Laboratorium");
            System.out.println("27. Tambah Hasil Lab");
            System.out.println("28. Tampilkan Hasil Lab");
            System.out.println("29. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1: // Tambah Pasien
                    System.out.print("ID Pasien: ");
                    String idPasien = scanner.nextLine();
                    System.out.print("Nama Pasien: ");
                    String namaPasien = scanner.nextLine();
                    System.out.print("Alamat Pasien: ");
                    String alamatPasien = scanner.nextLine();
                    System.out.print("Nomor Telepon Pasien: ");
                    String nomorTeleponPasien = scanner.nextLine();
                    System.out.print("Umur Pasien: ");
                    int umurPasien = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Jenis Kelamin Pasien: ");
                    String jenisKelaminPasien = scanner.nextLine();
                    System.out.print("Riwayat Medis Pasien: ");
                    String riwayatMedisPasien = scanner.nextLine();
                    orangList.add(new Pasien(idPasien, namaPasien, alamatPasien, nomorTeleponPasien, umurPasien, jenisKelaminPasien, riwayatMedisPasien));
                    break;

                case 2: // Tambah Dokter
                    System.out.print("ID Dokter: ");
                    String idDokter = scanner.nextLine();
                    System.out.print("Nama Dokter: ");
                    String namaDokter = scanner.nextLine();
                    System.out.print("Alamat Dokter: ");
                    String alamatDokter = scanner.nextLine();
                    System.out.print("Nomor Telepon Dokter: ");
                    String nomorTeleponDokter = scanner.nextLine();
                    System.out.print("Spesialisasi Dokter: ");
                    String spesialisasiDokter = scanner.nextLine();
                    System.out.print("Jadwal Praktek Dokter: ");
                    String jadwalPraktekDokter = scanner.nextLine();
                    System.out.print("Gaji Pokok Dokter: ");
                    double gajiPokokDokter = scanner.nextDouble();
                    scanner.nextLine();
                    orangList.add(new Dokter(idDokter, namaDokter, alamatDokter, nomorTeleponDokter, spesialisasiDokter, jadwalPraktekDokter, gajiPokokDokter));
                    break;

                case 3: // Tambah Perawat
                    System.out.print("ID Perawat: ");
                    String idPerawat = scanner.nextLine();
                    System.out.print("Nama Perawat: ");
                    String namaPerawat = scanner.nextLine();
                    System.out.print("Alamat Perawat: ");
                    String alamatPerawat = scanner.nextLine();
                    System.out.print("Nomor Telepon Perawat: ");
                    String nomorTeleponPerawat = scanner.nextLine();
                    System.out.print("Ruang Tugas Perawat: ");
                    String ruangTugasPerawat = scanner.nextLine();
                    System.out.print("Jadwal Jaga Perawat: ");
                    String jadwalJagaPerawat = scanner.nextLine();
                    orangList.add(new Perawat(idPerawat, namaPerawat, alamatPerawat, nomorTeleponPerawat, ruangTugasPerawat, jadwalJagaPerawat));
                    break;

                case 4: // Tampilkan Semua Orang
                    System.out.println("Daftar Semua Orang:");
                    for (Orang orang : orangList) {
                        orang.tampilkanInformasi();
                        System.out.println();
                    }
                    break;
                case 5: // Tambah Rekam Medis
                    System.out.print("ID Rekam Medis: ");
                    String idRekamMedis = scanner.nextLine();
                    System.out.print("Riwayat Pemeriksaan: ");
                    String riwayatPemeriksaan = scanner.nextLine();
                    System.out.print("Resep Obat: ");
                    String resepObat = scanner.nextLine();
                    rekamMedisList.add(new RekamMedis(idRekamMedis, riwayatPemeriksaan, resepObat));
                    break;

                case 6: // Tampilkan Rekam Medis
                    System.out.println("Daftar Rekam Medis:");
                    for (RekamMedis rekamMedis : rekamMedisList) {
                        rekamMedis.ambilRiwayatMedis();
                        System.out.println();
                    }
                    break;

                case 7: // Tambah Resep Obat
                    System.out.print("ID Resep: ");
                    String idResep = scanner.nextLine();
                    System.out.print("Nama Obat: ");
                    String namaObat = scanner.nextLine();
                    System.out.print("Dosis: ");
                    String dosis = scanner.nextLine();
                    System.out.print("Jumlah Obat: ");
                    int jumlahObat = scanner.nextInt();
                    scanner.nextLine();
                    resepObatList.add(new ResepObat(idResep, namaObat, dosis, jumlahObat));
                    break;

                case 8: // Tampilkan Resep Obat
                    System.out.println("Daftar Resep Obat:");
                    for (ResepObat resepObatItem : resepObatList) {
                        resepObatItem.tampilkanResep();
                        System.out.println();
                    }
                    break;

                case 9: // Tambah Obat
                    System.out.print("Nama Obat: ");
                    String namaObatBaru = scanner.nextLine();
                    System.out.print("Kode Obat: ");
                    String kodeObat = scanner.nextLine();
                    System.out.print("Harga Obat: ");
                    double hargaObat = scanner.nextDouble();
                    System.out.print("Jumlah Stok: ");
                    int jumlahStok = scanner.nextInt();
                    scanner.nextLine();
                    obatList.add(new Obat(namaObatBaru, kodeObat, hargaObat, jumlahStok));
                    break;

                case 10: // Tampilkan Obat
                    System.out.println("Daftar Obat:");
                    for (Obat obat : obatList) {
                        System.out.println("Nama Obat: " + obat.getNamaObat());
                        System.out.println("Kode Obat: " + obat.getKodeObat());
                        System.out.println("Harga Obat: " + obat.getHargaObat());
                        System.out.println("Jumlah Stok: " + obat.getJumlahStok());
                        System.out.println();
                    }
                    break;

                case 11: // Tambah Ruangan
                    System.out.print("ID Ruangan: ");
                    String idRuangan = scanner.nextLine();
                    System.out.print("Nama Ruangan: ");
                    String namaRuangan = scanner.nextLine();
                    System.out.print("Kapasitas Tempat Tidur: ");
                    int kapasitasTempatTidur = scanner.nextInt();
                    scanner.nextLine();
                    ruanganList.add(new Ruangan(idRuangan, namaRuangan, kapasitasTempatTidur));
                    break;

                case 12: // Tampilkan Ruangan
                    System.out.println("Daftar Ruangan:");
                    for (Ruangan ruangan : ruanganList) {
                        ruangan.tampilkanInformasiRuangan();
                        System.out.println();
                    }
                    break;

                case 13: // Tambah Tempat Tidur
                    System.out.print("ID Tempat Tidur: ");
                    String idTempatTidur = scanner.nextLine();
                    System.out.print("Status (terisi/kosong): ");
                    String status = scanner.nextLine();
                    System.out.print("Tipe Tempat Tidur: ");
                    String tipeTempatTidur = scanner.nextLine();
                    tempatTidurList.add(new TempatTidur(idTempatTidur, status, tipeTempatTidur));
                    break;

                case 14: // Tampilkan Tempat Tidur
                    System.out.println("Daftar Tempat Tidur:");
                    for (TempatTidur tempatTidur : tempatTidurList) {
                        tempatTidur.cekStatusTempatTidur();
                        System.out.println();
                    }
                    break;

                 case 15: // Tambah Pembayaran
                    System.out.print("ID Pembayaran: ");
                    String idPembayaran = scanner.nextLine();
                    System.out.print("Total Biaya: ");
                    double totalBiaya = scanner.nextDouble();
                    scanner.nextLine(); // membersihkan newline
                    System.out.print("Metode Pembayaran: ");
                    String metodePembayaran = scanner.nextLine();
                    pembayaranList.add(new Pembayaran(idPembayaran, totalBiaya, metodePembayaran));
                    break;

                case 16: // Tampilkan Pembayaran
                    System.out.println("Daftar Pembayaran:");
                    for (Pembayaran pembayaran : pembayaranList) {
                        System.out.println("ID Pembayaran: " + pembayaran.getIdPembayaran());
                        System.out.println("Total Biaya: " + pembayaran.getTotalBiaya());
                        System.out.println("Metode Pembayaran: " + pembayaran.getMetodePembayaran());
                        System.out.println();
                    }
                    break;

                case 17: // Tambah Tagihan
                    System.out.print("ID Tagihan: ");
                    String idTagihan = scanner.nextLine();
                    System.out.print("Jumlah Total: ");
                    double jumlahTotal = scanner.nextDouble();
                    scanner.nextLine(); // membersihkan newline
                    System.out.print("Status Pembayaran: ");
                    String statusPembayaran = scanner.nextLine();
                    tagihanList.add(new Tagihan(idTagihan, jumlahTotal, statusPembayaran));
                    break;

                case 18: // Tampilkan Tagihan
                    System.out.println("Daftar Tagihan:");
                    for (Tagihan tagihan : tagihanList) {
                        tagihan.tampilkanTagihan();
                        System.out.println();
                    }
                    break;

                case 19: // Tambah Detail Tagihan
                    System.out.print("ID Layanan: ");
                    String idLayanan = scanner.nextLine();
                    System.out.print("Nama Layanan: ");
                    String namaLayanan = scanner.nextLine();
                    System.out.print("Biaya Layanan: ");
                    double biayaLayanan = scanner.nextDouble();
                    scanner.nextLine(); // membersihkan newline
                    detailTagihanList.add(new DetailTagihan(idLayanan, namaLayanan, biayaLayanan));
                    break;

                case 20: // Tampilkan Detail Tagihan
                    System.out.println("Daftar Detail Tagihan:");
                    for (DetailTagihan detailTagihan : detailTagihanList) {
                        detailTagihan.tampilkanDetail();
                        System.out.println();
                    }
                    break;
                    
                case 25: // Tambah Laboratorium
                    System.out.print("ID Laboratorium: ");
                    String idLaboratorium = scanner.nextLine();
                    System.out.print("Nama Laboratorium: ");
                    String namaLaboratorium = scanner.nextLine();
                    System.out.print("Fasilitas: ");
                    String fasilitas = scanner.nextLine();
                    laboratoriumList.add(new Laboratorium(idLaboratorium, namaLaboratorium, fasilitas));
                    break;

                case 26: // Tampilkan Laboratorium
                    System.out.println("Daftar Laboratorium:");
                    for (Laboratorium laboratorium : laboratoriumList) {
                        System.out.println("ID Laboratorium: " + laboratorium.getIdLaboratorium());
                        System.out.println("Nama Laboratorium: " + laboratorium.getNamaLaboratorium());
                        System.out.println("Fasilitas: " + laboratorium.getFasilitas());
                        System.out.println();
                    }
                    break;

                case 27: // Tambah Hasil Lab
                    System.out.print("ID Hasil Lab: ");
                    String idHasilLab = scanner.nextLine();
                    System.out.print("Jenis Pemeriksaan: ");
                    String jenisPemeriksaan = scanner.nextLine();
                    System.out.print("Hasil: ");
                    String hasil = scanner.nextLine();
                    hasilLabList.add(new HasilLab(idHasilLab, jenisPemeriksaan, hasil));
                    break;

                case 28: // Tampilkan Hasil Lab
                    System.out.println("Daftar Hasil Lab:");
                    for (HasilLab hasilLab : hasilLabList) {
                        hasilLab.tampilkanHasil();
                        System.out.println();
                    }
                    break;

                case 29: // Keluar
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}


