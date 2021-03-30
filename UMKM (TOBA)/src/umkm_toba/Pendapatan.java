/*
Nama : Permana
NIM : 11418028
KELAS :  42TRPL1
 */
package umkm_toba;

/**
 *
 * @author Win10
 */
public class Pendapatan extends Vendor{
        int jumlahProdukTerjual;
        String listHagraPordukTerjual;
        int totalPendaptan;

    public Pendapatan(int id_vendor, int jumlahProdukTerjual, String listHagraPordukTerjual, int totalPendaptan) {
        this.id_vendor = id_vendor;
        this.jumlahProdukTerjual = jumlahProdukTerjual;
        this.listHagraPordukTerjual = listHagraPordukTerjual;
        this.totalPendaptan = totalPendaptan;
    }

    public int getJumlahProdukTerjual() {
        return jumlahProdukTerjual;
    }

    public void setJumlahProdukTerjual(int jumlahProdukTerjual) {
        this.jumlahProdukTerjual = jumlahProdukTerjual;
    }

    public String getListHagraPordukTerjual() {
        return listHagraPordukTerjual;
    }

    public void setListHagraPordukTerjual(String listHagraPordukTerjual) {
        this.listHagraPordukTerjual = listHagraPordukTerjual;
    }

    public int getTotalPendaptan() {
        return totalPendaptan;
    }

    public void setTotalPendaptan(int totalPendaptan) {
        this.totalPendaptan = totalPendaptan;
    }
    
    
}
