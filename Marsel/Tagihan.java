/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Tagihan {
    private String idTagihan;
    private double jumlahTotal;
    private String statusPembayaran;

    public Tagihan(String idTagihan, double jumlahTotal, String statusPembayaran) {
        this.idTagihan = idTagihan;
        this.jumlahTotal = jumlahTotal;
        this.statusPembayaran = statusPembayaran;
    }

    public void generateTagihan() {
        System.out.println("Tagihan ID: " + idTagihan + " dengan jumlah total: " + jumlahTotal + " telah dibuat.");
    }

    public void tampilkanTagihan() {
        System.out.println("Tagihan:");
        System.out.println("ID Tagihan: " + idTagihan);
        System.out.println("Jumlah Total: " + jumlahTotal);
        System.out.println("Status Pembayaran: " + statusPembayaran);
    }
}