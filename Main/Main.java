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

          
