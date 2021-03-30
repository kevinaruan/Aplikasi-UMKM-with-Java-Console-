package umkm_toba;

enum DaftarUMKM {
        Hotel,Losmen,TempatWisata,Kuliner,TokoCendramata;
        
     public String toString(){
          switch(this){
              case Hotel:
                  return "Hotel";
              case Losmen:
                  return "Losmen";
              case TempatWisata:
                  return "Tempat Wisata";
              case Kuliner:
                  return "Kuliner";
              case TokoCendramata:
                  return "Toko Cendra Mata";
              default : return "NULL";
          }
      }
}
