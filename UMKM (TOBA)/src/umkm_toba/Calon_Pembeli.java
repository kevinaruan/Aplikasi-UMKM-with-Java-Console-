package umkm_toba;

public class Calon_Pembeli extends User implements Login{
    int id_pembeli;
    int saldo;
    String username;
    String password;
    String jenisKelamin;
    String nik;
    int nomorTelepon;

    public Calon_Pembeli() {
    }

    public Calon_Pembeli(int id_pembeli,int saldo,String username, String password, String jenisKelamin, String nik, int nomorTelepon, String nama, String alamat) {
        super(nama, alamat);
        this.id_pembeli = id_pembeli;
        this.saldo = saldo;
        this.username = username;
        this.password = password;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.nomorTelepon = nomorTelepon;
    } 

    public int getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(int id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(int nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    
    
    
    @Override
    void cetakProfil() {
        System.out.println("Nama : "+nama
                +"\nSalod : "+saldo
                +"\nUsername  : "+username
                + "\nPassword : "+password
                + "\nAlamat : "+alamat
                + "\nJenis Kelamin : "+jenisKelamin
                + "\nNIK : "+nik
                + "\nNo Telepon : "+nomorTelepon
        );  
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
