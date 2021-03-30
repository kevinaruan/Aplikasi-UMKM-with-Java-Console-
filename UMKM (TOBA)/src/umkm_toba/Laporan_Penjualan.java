package umkm_toba;

/**
 *
 * @author Win10
 */
public class Laporan_Penjualan extends Vendor{
    int jumlahProdukTerjual;
    int sisaProduk;

    public Laporan_Penjualan(int id_vendor,int jumlahProdukTerjual, int sisaProduk) {
        this.id_vendor = id_vendor;
        this.jumlahProdukTerjual = jumlahProdukTerjual;
        this.sisaProduk = sisaProduk;
    }

    public int getJumlahProdukTerjual() {
        return jumlahProdukTerjual;
    }

    public int getSisaProduk() {
        return sisaProduk;
    }

    public int getId_vendor() {
        return id_vendor;
    }
    
    
    
    public void cetakLaporan(){
        System.out.println("Jumlah Terjual : "+jumlahProdukTerjual
                + "Sisa produk : "+sisaProduk
                + "id_vendor : "+id_vendor
                + "");
    }
//     public String toString(){
////        return jumlahProdukTerjual; 
//     }
}
