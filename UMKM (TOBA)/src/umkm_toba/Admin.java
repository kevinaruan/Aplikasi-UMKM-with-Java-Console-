package umkm_toba;

public class Admin implements Login{
   final String username = "admin";
   final String password = "admin";

    @Override
    public String username() {
        return username;
    }

    @Override
    public String password() {
        return password;
    } 
   
}
