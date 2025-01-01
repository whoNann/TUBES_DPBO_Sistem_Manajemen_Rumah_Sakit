/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class TempatTidur {
    private String idTempatTidur;
    private String status; // terisi/kosong
    private String tipeTempatTidur;

    public TempatTidur(String idTempatTidur, String status, String tipeTempatTidur) {
        this.idTempatTidur = idTempatTidur;
        this.status = status;
        this.tipeTempatTidur = tipeTempatTidur;
    }
    public void updateStatusTempatTidur(String status) {
        this.status = status;
        System.out.println("Status tempat tidur " + idTempatTidur + " diperbarui menjadi: " + status);
    }

    public void cekStatusTempatTidur() {
        System.out.println("Status tempat tidur " + idTempatTidur + ": " + status);
    }
}