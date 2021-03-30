package umkm_toba;

public class Vendor extends User{
//    String alamat;
    int id_vendor;
//    String nama;
    String namaUMKM;
    String username;
    String password;

    public Vendor() {
    }

    
    
    public Vendor(int id_vendor, String namaUMKM, String username, String password, String nama, String alamat) {
        super(nama, alamat);
        this.id_vendor = id_vendor;
        this.namaUMKM = namaUMKM;
        this.username = username;
        this.password = password;
    }

    
    
  
    @Override
    void cetakProfil() {
        System.out.println("Nama : "+nama
                + "\nId : "+id_vendor
                + "\nAlamat : "+alamat
                + "\nNama UMKM : "+namaUMKM
                + "\nUsername : "+username
                + "\nPassword : "+password);
    }

    @Override
    public String username() {
        return username;
    }

    @Override
    public String password() {
        return password;
    }
}
