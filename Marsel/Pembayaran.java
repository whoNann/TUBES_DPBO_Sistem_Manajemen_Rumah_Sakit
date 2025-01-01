/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Pembayaran {
    private String idPembayaran;
    private double totalBiaya;
    private String metodePembayaran;

    public Pembayaran(String idPembayaran, double totalBiaya, String metodePembayaran) {
        this.idPembayaran = idPembayaran;
        this.totalBiaya = totalBiaya;
        this.metodePembayaran = metodePembayaran;
    }

    public String getIdPembayaran() { return idPembayaran; }
    public double getTotalBiaya() { return totalBiaya; }
    public String getMetodePembayaran() { return metodePembayaran; }

    public void hitungTotalBiaya(double biaya) {
        this.totalBiaya += biaya;
        System.out.println("Total biaya diperbarui menjadi: " + totalBiaya);
    }
    public void prosesPembayaran() {
        System.out.println("Pembayaran dengan metode " + metodePembayaran + " sebesar " + totalBiaya + " telah diproses.");
    }
}