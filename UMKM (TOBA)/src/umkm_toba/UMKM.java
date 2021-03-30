package umkm_toba;


public class UMKM extends Vendor{
    int id_umkm;
    int stok;
    int harga;
    int terjual;
    String namaProduk;
    DaftarUMKM daftarUMKM;
    Status status;

    
    public UMKM(int id_umkm,int id_vendor,int stok,int terjual,int harga,String namaProduk, DaftarUMKM daftarUMKM, String namaUMKM,Status status) {
        this.id_umkm = id_umkm;
        this.stok=stok;
        this.terjual = terjual;
        this.harga= harga;
        this.namaProduk = namaProduk;
        this.namaUMKM = namaUMKM;
        this.id_vendor = id_vendor;
        this.daftarUMKM = daftarUMKM;
        this.status = status;
    }

    public DaftarUMKM getDaftarUMKM() {
        return daftarUMKM;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getId_umkm() {
        return id_umkm;
    }

    public void setId_umkm(int id_umkm) {
        this.id_umkm = id_umkm;
    }

    public int getTerjual() {
        return terjual;
    }

    public void setTerjual(int terjual) {
        this.terjual = terjual;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
    public int getHarga() {
        return harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
    
    
   
    public void cetakUmkm(){
        
        System.out.println("\tNaamaUMKM\tStok\tTerjual\tHarga\tNamaProduk\tJenusUMKM");
        System.out.println("\t"+namaUMKM
                +"\t\t"+stok  
                +"\t"+terjual
                + "\t"+harga
                + "\t"+namaProduk
                + "\t"+daftarUMKM  
                + "");
    }
}
