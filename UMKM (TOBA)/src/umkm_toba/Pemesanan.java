/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umkm_toba;

/**
 *
 * @author Win10
 */
public class Pemesanan extends Calon_Pembeli{
    DaftarUMKM jenisProduk;
    int id_vendor;
    String namaProduk;
    String namaUMKM;
    int jumlahPesan;
    int totalHarga;
    String status;

    public Pemesanan(int id_pembeli,int id_vendor,DaftarUMKM jenisProduk, String namaProduk, String namaUMKM,int jumlahPesan, int totalHarga, String status) {
        this.id_vendor = id_vendor;
        this.id_pembeli = id_pembeli;
        this.jenisProduk = jenisProduk;
        this.namaProduk = namaProduk;
        this.namaUMKM = namaUMKM;
        this.jumlahPesan = jumlahPesan;
        this.totalHarga = totalHarga;
        this.status = status;
    }

    public void setJenisProduk(DaftarUMKM jenisProduk) {
        this.jenisProduk = jenisProduk;
    }

    public void setId_vendor(int id_vendor) {
        this.id_vendor = id_vendor;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setNamaUMKM(String namaUMKM) {
        this.namaUMKM = namaUMKM;
    }

    public void setJumlahPesan(int jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    public void cetakPemesanan(){
        System.out.println(
                "Nama Produk : "+namaProduk
                + "\nHarga : "+totalHarga
                +"\nTotal Pesanan : "+jumlahPesan
        );
    }
}
