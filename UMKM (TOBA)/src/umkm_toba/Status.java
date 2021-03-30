package umkm_toba;

enum Status {
    tolak,proses,terima;
    
    public String toString(){
        switch(this){
            case tolak:
                return "tolak";

            case proses:
                return "proses";

            case terima:
                return "terima";
      
            default:return null;
        }
    }
}
