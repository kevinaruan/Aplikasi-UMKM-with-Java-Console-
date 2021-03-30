package umkm_toba;

abstract class User implements Login{
    String nama;
    String alamat;

    public User() {
    }

    
    
    public User(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    
    
    abstract void cetakProfil();
}
