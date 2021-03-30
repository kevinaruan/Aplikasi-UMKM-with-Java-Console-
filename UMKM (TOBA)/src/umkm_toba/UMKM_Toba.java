package umkm_toba;

import java.util.Scanner;
import java.util.ArrayList;

 
public class UMKM_Toba {
         static Scanner keyboard = new Scanner(System.in);
         static int pilihan,pilihan2,pilihan3,y=0,u=0;
         static String username,password;
  
       
         
    public static void main(String[] args) {
           
         
        
          UMKM_Toba app = new UMKM_Toba();
          
          Pembeli pembeli = new Pembeli();
          Vendors vendor = new Vendors();
          Komentar komentar = new Komentar();
          Produk produk = new Produk();
          Pendapatans pendapatan = new Pendapatans();
          LaporanPenjualan laporanPenjualan= new LaporanPenjualan();
          Pesanan pesanan = new Pesanan();
          
          
          
          pembeli.addPembeli(1,50000,"pembeli","pembeli","Laki-Laki","1141232123",8,"Permana","Del");
//          pembeli.addPembeli(2,50000,"s","s","Laki-Laki","1141232123",8,"Permana","Del");
          vendor.addVendor(1, "Permana", "vendor", "vendor", "Del Camp", "Sitoluama");
//          vendor.addVendor(2, "Neko", "p", "p", "Go In", "Sitoluama");
//          id_vendor,harga,namaProduk,daftarUMKM,nama, namaUMKMs
          
          produk.addUMKM(1,1,30,0,2500,"Excalibur",DaftarUMKM.TokoCendramata,"Permana", "Del Camp",Status.terima);
           produk.addUMKM(1,2,20,0,3000,"Gold Ring",DaftarUMKM.TokoCendramata,"Permana", "Del Camp",Status.terima);

//          pesanan.addPesanan(2, 1, DaftarUMKM.TokoCendramata, "Excalibur", "Indomaret", 2, 100000, "proses");
//          pesanan.addPesanan(2, 1, DaftarUMKM.TokoCendramata, "Excalibur", "Indomaret", 2, 100000, "pesan");
//          produk.addUMKM(u, y, password, DaftarUMKM.Hotel, username, password);sds
//          pendapatan.setPendapatan(1, 2, "password", 5000);
//          int id_vendor, int jumlahProdukTerjual, String listHagraPordukTerjual, int totalPendaptan
//          laporanPenjualan.addLaporanPenjualan(1, 20, 20);
//          

          
         
          
          do{
              System.out.println("==================================================");
              System.out.println("Selamat Datang di aplikasi UMKM toba Silahkan pilih menu di bawah ini");
              System.out.println("==================================================");
              System.out.println("------------------");
                 System.out.println("/    1.Login      /"
                        + "\n/    2.Daftar     /"
                        + "\n/    0.Keluar     /");
                 System.out.println("------------------");
                pilihan = keyboard.nextInt();
                switch(pilihan){
                    case 1:
                        System.out.printf("Username : ");
                        keyboard.nextLine();
                        username = keyboard.nextLine();
                        System.out.printf("Password : ");
                        password = keyboard.nextLine();
                        Login admin = new Admin();
//                        Login pem = new Calon_Pembeli();
            
                        y=0;    
                       for(int i =0 ; i<pembeli.pembeli.size();i++){
                           if(username.equals(pembeli.pembeli.get(i).username()) && password.equals(pembeli.pembeli.get(i).password())){
                               y = 1;
                               u = i;
                               break;
                           }
                       }
                       
                       for(int i=0;i<vendor.vendor.size();i++){
                           if(username.equals(vendor.vendor.get(i).username()) && password.equals(vendor.vendor.get(i).password())){
                               y = 2;
                               u =i;
                               break;
                           }     
                        }
                        
                        if(username.equals(admin.username()) && password.equals(admin.password())){        
                            do{
                              System.out.println("==========="
                                                        + "Selamat Datang ADMIN"
                                                        + "==========");
                                System.out.println("1.Kelola status Update"
                                                            + "\n2.Buat Notifikasi"
                                                            + "\n3.Lihat TOP produk"
                                                            + "\n4.Cek Transaksi"
                                                            + "\n5.UMKM"
                                                            + "\n6.Lihat Komentar/Saran"
                                                            + "\n0.Keluar"); 
                                pilihan2 = keyboard.nextInt();
                                switch(pilihan2){
                                    case 1:
                                        pesanan.cetakPesanan();
                                        System.out.printf("Masukkan produk : ");
                                        int pil= keyboard.nextInt();
                                        for(int i=0;i<pesanan.pemesanan.size();i++){
                                            if(i == pil-1 && pesanan.pemesanan.get(i).status.equals("proses")){
                                                System.out.println("Verifikasi Pembelian : ");
                                                System.out.println("1.Terima / 2.Tolak");
                                                int ver = keyboard.nextInt();
                                                String status;
                                                switch(ver){
                                                    case 1:
                                                        int id_vendor = pesanan.pemesanan.get(i).id_vendor;
                                                        int totalHarga = pesanan.pemesanan.get(i).totalHarga;
                                                        int jumlahPesan = pesanan.pemesanan.get(i).jumlahPesan;
                                                        int pen=0;
                                                        int jmlh=0;
                                                        for( i=0;i<pendapatan.pendapatan.size();i++){
                                                            if(pendapatan.pendapatan.get(i).id_vendor == id_vendor){
                                                              pen=  pendapatan.pendapatan.get(i).totalPendaptan;
                                                              jmlh = pendapatan.pendapatan.get(i).jumlahProdukTerjual;
                                                            }
                                                        }
                                                        int totalPendapatan = pen +totalHarga;
                                                        int jumlahProdukTerjual= jmlh+jumlahPesan;
                                                        String  listHargaProdukTerjual = null;
            //                                            System.out.println(totalPendapatan);
//                                                        System.out.println(pesanan.pemesanan.get(i-1).namaProduk);
                                                        pesanan.pemesanan.get(i).setStatus(status="terima");
//pesanan.addPesanan(id_pembeli,id_vendor,jenisProduk, namaProduk, namaUMKM, jumlahPesan, totalHarga, status="proses");
                                                       int jumlahProdukTerjuals=0,sisaProduk=0;
                                                       
                                                       for(i=0;i<produk.umkm.size();i++){
                                                           if(produk.umkm.get(i).id_vendor == id_vendor){
                                                               sisaProduk += produk.umkm.get(i).stok;
                                                           }
                                                       }
                                                       
                                                     
                                                        if(laporanPenjualan.laporanPenjualan.isEmpty()){
                                                            jumlahProdukTerjuals = jumlahPesan;
                                                          
                                                        }
                                                       
                                                        laporanPenjualan.addLaporanPenjualan(id_vendor,jumlahProdukTerjuals , sisaProduk);
                                                        pendapatan.setPendapatan(id_vendor, jumlahProdukTerjual, listHargaProdukTerjual, totalPendapatan);
                                                          break;
                                                    case 2:
                                                        pesanan.pemesanan.get(i-1).setStatus(status="tolak");
                                                        break;
                                                    default:
                                                }
                                            }
                                        }
                                        
                                        break;
                                    case 2:
                                    int x=0;
                                    int pilih=0;
                                        for(int i=0;i<produk.umkm.size();i++){
                                            if(produk.umkm.get(i).status.equals(Status.proses)){
                                                System.out.printf("No=> "+(i+1)+".");
                                                 produk.umkm.get(i).cetakUmkm();
                                                 
                                                 x=1;
                                            }
                                        }
                                        if(x==1){
                                            System.out.printf("Masukkan no UMKM : ");
                                            pilih = keyboard.nextInt();  
                                        }else{
                                            System.out.println("Tidak ada UMKM");
                                        }

                                        for(int i=0;i<produk.umkm.size();i++){
                                            
             
                                            if(pilih-1==i && produk.umkm.get(pilih-1).status.equals(Status.proses)){
                                                
                                                System.out.println("1.Terima 2.Tolak");
                                                int pilih1 = keyboard.nextInt();
                                                
                                                Status status =  null;
                                                switch(pilih1){
                                                    case 1:
                                                        status = Status.terima;
                                                        break;
                                                    case 2:
                                                        status = Status.tolak;
                                                        break;
                                                    default: System.out.println("Menu tidak tersedia");
                                                            break;
                                                                                               }
                                                int  id_umkm = produk.umkm.get(i).id_umkm;

                                                String namaProduk= produk.umkm.get(i).namaProduk;
                             
                                                int stok = produk.umkm.get(i).stok;
                     
                                                int harga = produk.umkm.get(i).harga;
                                                String namaUMKM = produk.umkm.get(i).namaUMKM;
                                                String nama = produk.umkm.get(i).nama;
                                                int terjual =  produk.umkm.get(i).terjual;
                                                DaftarUMKM daftarUMKM = produk.umkm.get(i).daftarUMKM;
                                                int id_vendor = produk.umkm.get(i).id_vendor;
                                                
                                                produk.editUMKM(i,id_umkm,id_vendor,stok,terjual,harga,namaProduk,daftarUMKM, namaUMKM,status);
                                                if(status.equals(Status.terima)){
                                                    System.out.println("Sukses Meneria UMKM");
                                                }else{
                                                    System.out.println("Sukses Menolak UMKM");
                                                }
                                            
                                            }
                                        }
                                        break;
                                    case 0:
                                        break;
                                    case 4:
                                        
                                        if(laporanPenjualan.laporanPenjualan.isEmpty()){
                                            System.out.println("Belum ada transaksi");
                                        }
                                        for(int i=0;i<laporanPenjualan.laporanPenjualan.size();i++){
                                            System.out.println(
                                                     i+1+"."+
                                                    "Produk Terjual : "+laporanPenjualan.laporanPenjualan.get(i).jumlahProdukTerjual+
                                                     "\nId Vendor : "+laporanPenjualan.laporanPenjualan.get(i).id_vendor
                                                    +"\nSisa Produk : "+laporanPenjualan.laporanPenjualan.get(i).sisaProduk
                                            
                                            
                                            );
                                        }
                                        break;
                                    case 5:
                                        System.out.println("1.View UMKM"
                                                + "\n2.Delete UMKM"
                                                + "\n0.Hapus");
                                        
                                       int pili = keyboard.nextInt();
                                       
                                       switch(pili){
                                           case 1:
                                               for(int i=0;i<produk.umkm.size();i++){
                                                   System.out.print(i+1);
                                                   System.out.printf(" id UMKM: ");
                                                   System.out.println(produk.umkm.get(i).id_umkm);
                                                   produk.umkm.get(i).cetakUmkm();
                                               }
                                               break;
                                           case 2:
                                               System.out.println("Masukkan Code UMKM");
                                               int code = keyboard.nextInt();
                                               
                                               for(int i=0;i<produk.umkm.size();i++){
                                                   if(produk.umkm.get(i).id_umkm==code){
                                                       produk.umkm.remove(i);
                                                       System.out.println("Sukses menghapus data");
                                                   }
                                                   
                                               }
                                               break;
                                       }
                                        break;
                                    case 3:
                                        int max=0;
                                        int min =10000;
                                               
                                        System.out.println("Berikut ini daftar TOP produk berdasarkan pembelian : ");
                                        System.out.println("No\tNaamaUMKM\tStok\tTerjual\tHarga\tNamaProduk\tJenusUMKM");
                                        
                                        for(int i=0;i<produk.umkm.size();i++){
                                 
                                           if(produk.umkm.get(i).status.equals(Status.terima )&& produk.umkm.get(i).terjual!=0){
                                            
                                                System.out.print(i+1);
                                            if(produk.umkm.get(i).terjual<max ){
//                                                max = produk.umkm.get(i).terjual;
                                                System.out.println("\t"+produk.umkm.get(i).namaUMKM
                                                            +"\t\t"+produk.umkm.get(i).stok  
                                                            +"\t"+produk.umkm.get(i).terjual
                                                            + "\t"+produk.umkm.get(i).harga
                                                            + "\t"+produk.umkm.get(i).namaProduk
                                                            + "\t"+produk.umkm.get(i).daftarUMKM  
                                                            + "");
                                            }else if(produk.umkm.get(i).terjual>min){
//                                                min = produk.umkm.get(i).terjual;
                                                System.out.println("\t"+produk.umkm.get(i).namaUMKM
                                                            +"\t\t"+produk.umkm.get(i).stok  
                                                            +"\t"+produk.umkm.get(i).terjual
                                                            + "\t"+produk.umkm.get(i).harga
                                                            + "\t"+produk.umkm.get(i).namaProduk
                                                            + "\t"+produk.umkm.get(i).daftarUMKM  
                                                            );
                                            }
                                            }
                                        }
                                        break;
                                    case 6:
                                        komentar.viewKomentar();
                                        if(komentar.komentar.isEmpty()){
                                            System.out.println("Belum ada saran/komentar");
                                        }
                                        break;
                                    default:
                                        System.out.println("Tidak ada pilihan yang sesuai");
                                        break;
                                }
                            }while(pilihan2!=0);
                        }else if(y==1){
                           
                            do {
                                 System.out.println("Hallo "+pembeli.pembeli.get(u).nama+" | "+"Saldo anda : "+pembeli.pembeli.get(u).saldo);
                            System.out.println("Silahakan pilih menu dibawha");
                                   System.out.println("1.Ubah Profil"
                                    + "\n2.Checkout"
                                    + "\n3.Lihat favorit"
                                    + "\n4.Lihat Produk"
                                    + "\n5.Cari Produk"
//                                    + "\n6.Checkout"
//                                    + "\n7.Pesan"
                                    + "\n6.Komentar & Saran"
                                           + "\n0.Keluar"
                                           
                                        );
                                   
                            pilihan2 = keyboard.nextInt();
                            switch(pilihan2){
                                case 0:
                                    System.out.println("Berhasi Keluar");
                                    break;
                                case 1:
                                pembeli.showProfil(u);
                                    
                            System.out.println("Data baru : ");
                            System.out.printf("Nama : ");
                            keyboard.nextLine();
                            String nama =  keyboard.nextLine();
                            System.out.printf("Username : ");
                            String username = keyboard.nextLine();
                            System.out.printf("Password : ");
                            String password =  keyboard.nextLine();
                            System.out.printf("Alamat : ");
                            String alamat =  keyboard.nextLine();
                            System.out.println("Jenis Kelamin");
                            System.out.printf("1.Laki-laki | 2.Perampuan : ");
                            int jk = keyboard.nextInt();
                            String jenisKelamin = "null";
                            switch(jk){
                                case 1:
                                    jenisKelamin = "Laki-laki";
                                    break;
                                case 2:
                                    jenisKelamin = "Perampuan";
                                    break;
                                default: System.out.println("Menu tidak tersedia");
                            }
                            System.out.printf("NIK : ");
                            keyboard.nextLine();
                            String nik = keyboard.nextLine();
                            System.out.printf("Nomor Telepon/Hp : ");
                            int nomorTelepon = keyboard.nextInt();
                            int id_pembeli = u+1;
                            
                            int saldo;
                            
                            if(pembeli.pembeli.get(u).saldo!=0){
                                 saldo = pembeli.pembeli.get(u).saldo;
                            }else{
                                 saldo= 0;
                            }
                            
                             System.out.println("Data baru yakin ingin mengubahnya?"
                                     + "\nNama : "+nama
                                    +"\nUsername  : "+username
                                    + "\nPassword : "+password
                                    + "\nAlamat : "+alamat
                                    + "\nJenis Kelamin : "+jenisKelamin
                                    + "\nNIK : "+nik
                                    + "\nNo Telepon : "+nomorTelepon
                                     + "\n1.Ya | 2.Batal"
                            );
                             
                             int op = keyboard.nextInt();
                             switch(op){
                                 case 1:
                                      pembeli.editProfil(u,id_pembeli,saldo, username, password, jenisKelamin, nik, nomorTelepon, nama, alamat);
                                     System.out.println("Sukses mengubah data");
                                      break;
                                 case 2:
                                     System.out.println("Data batal diubah");
                                     break;
                                 default:
                                     System.out.println("Menu tidak tersedia");
                                     break;
                             }                           
                                    break;
                                case 2:
//                                    xz  
                                    int pesan = 0;
                                    pesanan.cetakPesananSaya(u+1,-1);
                                    
                                      for(int i=0;i<pesanan.pemesanan.size();i++){
                                        if(u+1 == pesanan.pemesanan.get(i).id_pembeli && pesanan.pemesanan.get(i).status.equals("pesan")){
                                                 System.out.printf("Pilih daftar pesanan : ");
                                                 pesan = keyboard.nextInt();
                                        break;
                                        
                                        }else{

                                        }
                                    }


                                    if(pesanan.pemesanan.isEmpty()){
                                        System.out.println("Tidak apa pesanan");
                                    }
                                                 int x=0;
                                    if(pesan <=0){
                                        break;
                                    }else{
//                                        System.out.println("asdasd");
                                      for(int i=0;i<pesanan.pemesanan.size();i++){
                                     
                                          if (u+1 != pesanan.pemesanan.get(i).id_pembeli && !pesanan.pemesanan.get(i).status.equals("pesan") && pesan-1 !=i){
                                               
                                          x=1;
                                          }else if(u+1 == pesanan.pemesanan.get(i).id_pembeli && pesanan.pemesanan.get(i).status.equals("pesan") && pesan-1 ==i){                
                                                 x=0;
                                              System.out.println("1.Bayar Pesanan"
                                                + "\n2.Hapus Pesanan");
                                        int opsi = keyboard.nextInt();
                                        switch(opsi){
                                            case 1:
                                             
                                            id_pembeli =pesanan.pemesanan.get(i).id_vendor;
                                            DaftarUMKM jenisProduk = pesanan.pemesanan.get(i).jenisProduk;
                                            String namaProduk =  pesanan.pemesanan.get(i).namaProduk;
                                            String namaUMKM =  pesanan.pemesanan.get(i).namaUMKM;
                                            
                                            int jumlahPesan =  pesanan.pemesanan.get(i).jumlahPesan;
                                            int totalHarga =  pesanan.pemesanan.get(i).totalHarga;
                                            String status;
                                            System.out.println("Stok sebelum terjual : "+produk.umkm.get(pesan-1).stok);
                                            int stok= produk.umkm.get(pesan-1).stok - jumlahPesan;
                                            produk.umkm.get(pesan-1).setStok(stok);
                                            System.out.println("Stok setelah  terjual : "+produk.umkm.get(pesan-1).stok);
                                            int id_vendor = produk.umkm.get(pesan-1).id_vendor;
                                             produk.umkm.get(pesan-1).setTerjual(jumlahPesan);
                                             
                                            int sald = pembeli.pembeli.get(u).saldo-totalHarga;
                                            
                                            
                                                System.out.println(sald);
                                             pembeli.pembeli.get(u).setSaldo(sald);
                                          
                                       
                                            pesanan.addPesanan(id_pembeli,id_vendor,jenisProduk, namaProduk, namaUMKM, jumlahPesan, totalHarga, status="proses");
                                                break;
                                            case 2:
                                                pesanan.hapusPesanan(pesan-1);
                                                System.out.println("Pesanan berhasil di hapus dari keranjang");
                                                break;
                                            default : 
                                                break;
                                             
                                        }
                                        break;
                                          
                                          }else{
                                                x=1;
                                                }
                                      }
                                        if(x==1){
                                            System.out.println("Menu tidak ada");
                                        }
                                    }
//                                    tet
                                    break;
                                case 3:
                                    int max=0;
                                    int min=    0;
                                    System.out.println("Berikut ini daftar TOP produk berdasarkan pembelian : ");
                                    System.out.println("No\tNaamaUMKM\tStok\tTerjual\tHarga\tNamaProduk\tJenusUMKM");
                                    for(int i=0;i<produk.umkm.size();i++){
                                 
                                            if(produk.umkm.get(i).status.equals(Status.terima )&& produk.umkm.get(i).terjual!=0){
                                            
                                                System.out.print(i+1);
                                            if(produk.umkm.get(i).terjual<max ){
//                                                max = produk.umkm.get(i).terjual;
                                                System.out.println("\t"+produk.umkm.get(i).namaUMKM
                                                            +"\t\t"+produk.umkm.get(i).stok  
                                                            +"\t"+produk.umkm.get(i).terjual
                                                            + "\t"+produk.umkm.get(i).harga
                                                            + "\t"+produk.umkm.get(i).namaProduk
                                                            + "\t"+produk.umkm.get(i).daftarUMKM  
                                                            + "");
                                            }else if(produk.umkm.get(i).terjual>min){
//                                                min = produk.umkm.get(i).terjual;
                                                System.out.println("\t"+produk.umkm.get(i).namaUMKM
                                                            +"\t\t"+produk.umkm.get(i).stok  
                                                            +"\t"+produk.umkm.get(i).terjual
                                                            + "\t"+produk.umkm.get(i).harga
                                                            + "\t"+produk.umkm.get(i).namaProduk
                                                            + "\t"+produk.umkm.get(i).daftarUMKM  
                                                            );
                                            }
                                            }
                                        }
                                    
                                    System.out.printf("\nMasukkan Pilihan : ");
                                     pesan = keyboard.nextInt();
                                    
                                    for(int i=0;i<produk.umkm.size();i++){
                                 
                                            if(produk.umkm.get(i).status.equals(Status.terima) && i==pesan-1 && produk.umkm.get(i).terjual!=0){
                                                System.out.println("1.Beli UMKM"
                                                        + "\n2.Pesan UMKM"
                                                        + "\n0.Kembali");
                                                int pilih1 = keyboard.nextInt();
                                                switch(pilih1){
                                                    case 1:
                                                        id_pembeli = u+1;
                                            DaftarUMKM jenisProduk = produk.umkm.get(pesan-1).getDaftarUMKM();
                                            String namaProduk = produk.umkm.get(pesan-1).namaProduk;
                                            String namaUMKM = produk.umkm.get(pesan-1).namaUMKM;
                                            System.out.println("Jumlah Pesan : ");
                                            int jumlahPesan = keyboard.nextInt();
                                            int totalHarga = jumlahPesan * produk.umkm.get(pesan-1).harga;
                                            String status;
                                            System.out.println("Stok sebelum terjual : "+produk.umkm.get(pesan-1).stok);
                                            int stok= produk.umkm.get(pesan-1).stok - jumlahPesan;
                                            produk.umkm.get(pesan-1).setStok(stok);
                                            System.out.println("Stok setelah  terjual : "+produk.umkm.get(pesan-1).stok);
                                            int id_vendor = produk.umkm.get(pesan-1).id_vendor;
                                               int sald = pembeli.pembeli.get(u).saldo-totalHarga;
                                            
                                            
                                                System.out.println(sald);
                                             pembeli.pembeli.get(u).setSaldo(sald);
                                            System.out.println(namaProduk);
                                            System.out.println(id_vendor);
                                            int jumlahProdukTerjual=0,totalPendapatan=0;
                                            String listHargaProdukTerjual = null;
                                            
                                           int psn = produk.umkm.get(pesan-1).terjual + jumlahPesan;
                                           produk.umkm.get(pesan-1).setTerjual(psn);
                                         
                                            pesanan.addPesanan(id_pembeli,id_vendor,jenisProduk, namaProduk, namaUMKM, jumlahPesan, totalHarga, status="proses");
                                                        break;
                                                    case 2:
                                                        id_pembeli = u+1;
                                            jenisProduk = produk.umkm.get(pesan-1).getDaftarUMKM();
                                            namaProduk = produk.umkm.get(pesan-1).namaProduk;
                                            namaUMKM = produk.umkm.get(pesan-1).namaUMKM;
                                            System.out.println("Jumlah Pesan : ");
                                            jumlahPesan = keyboard.nextInt();
                                            totalHarga = jumlahPesan * produk.umkm.get(pesan-1).harga;
                                            status ="pesan";
                                            System.out.println("Stok sebelum terjual : "+produk.umkm.get(pesan-1).stok);
                                            stok= produk.umkm.get(pesan-1).stok;
//                                            produk.umkm.set(pesan-1, stok);
                                            produk.umkm.get(pesan-1).setStok(stok);
                                            System.out.println("Stok setelah  terjual : "+produk.umkm.get(pesan-1).stok);
                                            id_vendor = produk.umkm.get(pesan-1).id_vendor;
                                            
                                        
//                                            produk.umkm.set(pesan-1, new UMKM(id_vendor,stok,terjual,harga,namaProduk,daftarUMKM,nama, namaUMKM));
                                            pesanan.addPesanan(id_pembeli,id_vendor,jenisProduk, namaProduk, namaUMKM, jumlahPesan, totalHarga, status);
                                                        break;
                                                    case 0:
                                                        break;
                                                    default: System.out.println("Menu tidak tersedia");
                                                        break;
                                                }
                                                
                                            }else{
                                                System.out.println("Menu tidak tersedia");
                                                break;
                                            }
                                    }
                                    break;
                                case 4:
                                    produk.cetakSemuaUMKM();
//                                    sds
                                    pesan = keyboard.nextInt();
                                    
                                    if(pesan <=0){
                                        break;
                                    }else{
                                    produk.pesan(pesan);
                                    
                                    System.out.println("1.Beli | 2.Pesan");
                                    int psn = keyboard.nextInt();
                                    switch(psn){
                                        case 1:
                                            id_pembeli = u+1;
                                            DaftarUMKM jenisProduk = produk.umkm.get(pesan-1).getDaftarUMKM();
                                            String namaProduk = produk.umkm.get(pesan-1).namaProduk;
                                            String namaUMKM = produk.umkm.get(pesan-1).namaUMKM;
                                            System.out.println("Jumlah Pesan : ");
                                            int jumlahPesan = keyboard.nextInt();
                                            if(jumlahPesan>= produk.umkm.get(pesan-1).stok){
                                                System.out.println("Stok Tidak cukup");
                                            }else{
                                                 int totalHarga = jumlahPesan * produk.umkm.get(pesan-1).harga;
                                            String status;
                                          
                                            int stok= produk.umkm.get(pesan-1).stok - jumlahPesan;
                                            produk.umkm.get(pesan-1).setStok(stok);
                                            int id_vendor = produk.umkm.get(pesan-1).id_vendor;                           
                                            System.out.println(namaProduk);
                                            System.out.println(id_vendor);
                                         psn = produk.umkm.get(pesan-1).terjual + jumlahPesan;
                                           produk.umkm.get(pesan-1).setTerjual(psn);
                                           
                                         
                                            pesanan.addPesanan(id_pembeli,id_vendor,jenisProduk, namaProduk, namaUMKM, jumlahPesan, totalHarga, status="proses");
                                            
                                            }
                                             break;
                                        case 2:
                                            id_pembeli = u+1;
                                            jenisProduk = produk.umkm.get(pesan-1).getDaftarUMKM();
                                            namaProduk = produk.umkm.get(pesan-1).namaProduk;
                                            namaUMKM = produk.umkm.get(pesan-1).namaUMKM;
                                            System.out.println("Jumlah Pesan : ");
                                            jumlahPesan = keyboard.nextInt();
                                            if(jumlahPesan>=produk.umkm.get(pesan-1).stok){
                                                System.out.println("Stok Tidak cukup");
                                            }else{
                                            int totalHarga = jumlahPesan * produk.umkm.get(pesan-1).harga;
                                            String status ="pesan";
                                            int stok= produk.umkm.get(pesan-1).stok;
                                            produk.umkm.get(pesan-1).setStok(stok);
                                            int id_vendor = produk.umkm.get(pesan-1).id_vendor;
                                                                                    
                                           pesanan.addPesanan(id_pembeli,id_vendor,jenisProduk, namaProduk, namaUMKM, jumlahPesan, totalHarga, status);
                                            }
                                            break;
                                        default :System.out.println("Menu tidak tersedia");
                                            break;
                                     }
                                    }
                                    break;
                                case 5:
                                    keyboard.nextLine();
                                    System.out.printf("Masukkan Nama Produk : ");
                                    String cari = keyboard.nextLine();
                                    int y=0;
                                    for(int i=0;i<produk.umkm.size();i++){
                                        if(!produk.umkm.get(i).namaProduk.equals(cari)){
                                           y=2;
                                        }else if(produk.umkm.get(i).namaProduk.equals(cari) && produk.umkm.get(i).status.equals(Status.terima)){
                                           produk.umkm.get(i).cetakUmkm();
                                           
                                           
                                            System.out.println("");
//                                            id_pembeli = u+1;
//                                            DaftarUMKM jenisProduk = produk.umkm.get(i).getDaftarUMKM();
//                                            String namaProduk = produk.umkm.get(i).namaProduk;
//                                            String namaUMKM = produk.umkm.get(i).namaUMKM;
//                                            System.out.println("Jumlah Pesan : ");
//                                            int jumlahPesan = keyboard.nextInt();
//                                            int totalHarga = jumlahPesan * produk.umkm.get(i).harga;
//                                            String status ="pesan";
//                                            System.out.println("Stok sebelum terjual : "+produk.umkm.get(i).stok);
//                                            int stok= produk.umkm.get(i).stok;
////                                            produk.umkm.set(pesan-1, stok);
//                                            produk.umkm.get(i).setStok(stok);
//                                            System.out.println("Stok setelah  terjual : "+produk.umkm.get(i).stok);
//                                            int id_vendor = produk.umkm.get(i).id_vendor;
//                                            produk.umkm.set(pesan-1, new UMKM(id_vendor,stok,terjual,harga,namaProduk,daftarUMKM,nama, namaUMKM));
                                           
                                           
                                             y=1;
                                             
                                             break;
                                        }
                                    }
                                    
                                    if(y==2){
                                        System.out.println("Tidak ada produk ditemukan");
                                    }
                                    break;
                                case 6:
                                    System.out.println("Masukkan komentar atau Saran anda");
                                    keyboard.nextLine();
                                    String isi=keyboard.nextLine();
                                    int id=0;
                                    for(int i=0;i<komentar.komentar.size();i++){
                                        id= komentar.komentar.get(i).id_komentarsaran+1;
                                    }
                                    
                                    System.out.println("Sukkses menambahkan komnetar/saran");
                                if(komentar.komentar.isEmpty()){
                                    id=1;
                                }
                                komentar.addKoemntar(id, isi);
                                    break;
                                default :
                                    System.out.println("Menu tidak tersedia");
                                    break;
                            }
                           } while (pilihan2!=0);
                        }else if(y==2){
                            System.out.printf("Hallo "+vendor.vendor.get(u).nama+"\n");
                            
                            
                           pendapatan.cetakPendapatan(u+1);
                            
                           
                            do{
                               System.out.println("1.Ubah Profil"
                                       + "\n2.Tambahkan Produk"
                                       + "\n3.Cari Produk"
                                       + "\n4.Daftar Produk"
                                       + "\n5.Laporan Penjualan"
                                       + "\n6.Total Pendapatan"
                                       + "\n0.Keluar");                               
                               pilihan2 = keyboard.nextInt();
                               switch(pilihan2){
                                   case 0:
                                       System.out.println("Berhasil Keluar");
                                       break;
                                   case 1:
                                       vendor.vendor.get(u).cetakProfil();
                                        System.out.printf("Nama : ");
                                        keyboard.nextLine();
                                        String nama =  keyboard.nextLine();
                                        System.out.printf("Nama UMKM :");
                                        String namaUMKM = keyboard.nextLine();
                                        System.out.printf("Username : ");
                                        String username = keyboard.nextLine();
                                        System.out.printf("Password : ");
                                        String password =  keyboard.nextLine();
                                        System.out.printf("Alamat : ");
                                        String alamat =  keyboard.nextLine();
                                        int id_vendor = u+1;
                                        
                                         System.out.println("Data baru yakin ingin mengubahnya?"
                                            + "\nNama : "+nama
                                           +"\nUsername  : "+username
                                           + "\nPassword : "+password
                                           + "\nAlamat : "+alamat
                                            + "\n1.Ya | 2.Batal"
                                        );
                                         int conf = keyboard.nextInt();
                                         switch(conf){
                                             case 1:
                                                   vendor.editVendor(u,id_vendor,namaUMKM, username, password, nama, alamat);
                                                   System.out.println("Sukses Mengubah data");
                                                 break;
                                             case 2:
                                                 System.out.println("Batal Mengubah data");
                                                 break;
                                         }
                             
                                       break;
                                   case 2:
                                       System.out.println("Pilih jenis UMKM : "
                                               + "\n1.Hotel"
                                               + "\n2.Losmen"
                                               + "\n3.Tempat Wisata"
                                               + "\n4.Kuliner"
                                               + "\n5.Toko Cendramata");
                                       
                                       pilihan3 = keyboard.nextInt();
                                       id_vendor = u+1;
                                       int id_umkm = 0;
                                        for(int i=0;i<produk.umkm.size();i++){
                                           id_umkm = produk.umkm.get(i).id_umkm +1;
                                       }
                                        
                                   
                                       switch(pilihan3){
                                          
                                           case 1:
                                                System.out.printf("Nama Hotel : ");
                                                keyboard.nextLine();
                                                String namaProduk= keyboard.nextLine();
                                                System.out.printf("Stok : ");
                                                int stok = keyboard.nextInt();
                                                System.out.printf("Harga : ");
                                                int harga = keyboard.nextInt();
                                                namaUMKM = vendor.vendor.get(u).namaUMKM;
                                                nama = vendor.vendor.get(u).nama;
                                                produk.addUMKM(id_umkm,id_vendor,stok,0,harga,namaProduk, DaftarUMKM.Hotel, nama, namaUMKM,Status.proses);
                                               break;
                                           case 2:
                                                System.out.printf("Nama Losmen : ");
                                                keyboard.nextLine();
                                                namaProduk= keyboard.nextLine();
                                                System.out.printf("Stok : ");
                                                stok = keyboard.nextInt();
                                                System.out.printf("Harga : ");
                                                harga = keyboard.nextInt();
                                                namaUMKM = vendor.vendor.get(u).namaUMKM;
                                                 nama = vendor.vendor.get(u).nama;
                                                produk.addUMKM(id_umkm,id_vendor,stok,0,harga,namaProduk, DaftarUMKM.Losmen, nama, namaUMKM,Status.proses);
                                               break;
                                           case 3:
                                               System.out.printf("Nama Losmen : ");
                                                keyboard.nextLine();
                                                namaProduk= keyboard.nextLine();
                                                System.out.printf("Stok : ");
                                                stok = keyboard.nextInt();
                                                System.out.printf("Harga : ");
                                                harga = keyboard.nextInt();
                                                namaUMKM = vendor.vendor.get(u).namaUMKM;
                                                nama = vendor.vendor.get(u).nama;
                                                produk.addUMKM(id_umkm,id_vendor,stok,0,harga,namaProduk, DaftarUMKM.TempatWisata, nama, namaUMKM,Status.proses);
                                               break;
                                           case 4:
                                                System.out.printf("Nama Losmen : ");
                                                keyboard.nextLine();
                                                namaProduk= keyboard.nextLine();
                                                System.out.printf("Stok : ");
                                                stok = keyboard.nextInt();
                                                System.out.printf("Harga : ");
                                                harga = keyboard.nextInt();
                                                namaUMKM = vendor.vendor.get(u).namaUMKM;
                                                nama = vendor.vendor.get(u).nama;
                                                produk.addUMKM(id_umkm,id_vendor,stok,0,harga,namaProduk, DaftarUMKM.Kuliner, nama, namaUMKM,Status.proses);
                                               break;
                                           case 5:
                                                System.out.printf("Nama Barang : ");
                                                keyboard.nextLine();
                                                namaProduk= keyboard.nextLine();
                                                System.out.printf("Stok : ");
                                                stok = keyboard.nextInt();
                                                System.out.printf("Harga : ");
                                                harga = keyboard.nextInt();
                                                namaUMKM = vendor.vendor.get(u).namaUMKM;
                                                nama = vendor.vendor.get(u).nama;
                                                produk.addUMKM(id_umkm,id_vendor,stok,0,harga,namaProduk, DaftarUMKM.TokoCendramata, nama, namaUMKM,Status.proses);
                                               break;                 
                                           default :
                                               System.out.println("Menu tidak tersedia");
                                               break;                                          
                                       }
                                  
                                       break;
                                   
                                   case 3:
                                       
                                       System.out.printf("Cari nama produk : ");
                                       keyboard.nextLine();
                                       String cari = keyboard.nextLine();
                                       
                                       produk.cariUMKMVendor(cari,u+1);
                                       
                                       break;
                                   case 4:
                                       int pilih = 0;
                                       if(produk.umkm.isEmpty()){
                                           System.out.println("Produk tidak ada");
                                       }else{
                                           produk.cetakNamaProduk(u+1,pilih);
                                       }
                                       
                                       System.out.println("Pilih Produk : ");
                                       pilih = keyboard.nextInt();
                                      
                                       int pilih1 = 0;
                                       if(pilih <= 0){
                                           System.out.println("Menu tidak tersedia");
                                            break;
                                        }else{
                                            if(produk.umkm.get(pilih-1).id_vendor == u+1){
                                                produk.cetakUMKMK(u+1, pilihan);
                                            System.out.println("1.Tambahakan Stok"
                                                    + "\n2.Edit Produk"
                                                    + "\n3.Hapus Dari daftar");

                                            pilih1= keyboard.nextInt();
                                            }else{
                                                System.out.println("Okeh");
                                            }
                                       }
                                       switch(pilih1){
                                           case 1:
                                               System.out.printf("Tambahakan jumlah stok yg akan di tambahakan : ");
                                               int stok = keyboard.nextInt();   
                                               int stoks =produk.umkm.get(pilih-1).stok;
                                               produk.umkm.get(pilih-1).setStok(stok+stoks);
//                                               sds
                                               break;
                                           case 2:
//                                               int id_umkm = produk.umkm.get(pilih-1).id_umkm;
                                               int id = pilih-1;
                                               id_umkm = produk.umkm.get(pilih-1).id_umkm;
                                               id_vendor = produk.umkm.get(pilih-1).id_vendor;
                                               System.out.printf("Jumlah Stok : ");
                                               stok = keyboard.nextInt();
                                               int terjual = produk.umkm.get(pilih-1).terjual;
                                               System.out.printf("Harga : ");
                                               int harga = keyboard.nextInt();
                                               System.out.printf("Nama Produk : ");
                                               keyboard.nextLine();
                                               String namaProduks = keyboard.nextLine();
                                               System.out.println("Pilih jenis UMKM : "
                                               + "\n1.Hotel"
                                               + "\n2.Losmen"
                                               + "\n3.Tempat Wisata"
                                               + "\n4.Kuliner"
                                               + "\n5.Toko Cendramata");
                                               
                                               
//                                               String tes = keyboard.nextLine();
                                               DaftarUMKM daftarUMKM = DaftarUMKM.TokoCendramata;
                                               int pilihan3 = keyboard.nextInt();
                                               switch(pilihan3){
                                                   case 1:
                                                       daftarUMKM = DaftarUMKM.Hotel;
                                                       break;
                                                   case 2:
                                                       daftarUMKM = DaftarUMKM.Losmen;
                                                       break;
                                                   case 3:
                                                       daftarUMKM = DaftarUMKM.TempatWisata;
                                                       break;
                                                   case 4:
                                                       daftarUMKM = DaftarUMKM.Kuliner;
                                                       break;
                                                   case 5:
                                                       daftarUMKM = DaftarUMKM.TokoCendramata;
                                                       break;
                                               }
//                                               System.out.println("--=--0-="+nama);
                                               namaUMKM = produk.umkm.get(pilih-1).namaUMKM;
                                               Status status = produk.umkm.get(pilih-1).status;
                                               produk.editUMKM(id,id_umkm,id_vendor,stok,terjual,harga,namaProduks,daftarUMKM, namaUMKM,status);

//int id_vendor,int stok,int terjual,int harga,String namaProduk, DaftarUMKM daftarUMKM,String nama, String namaUMKM
                                               break;
                                           case 3:
                                               
                                               System.out.println(pilih);
                                               produk.deletUmkm(pilih-1, u+1);
                                               
                                               
                                               break;
                                           default : System.out.println("Menu tidak tersedia");
                                       }
                                      
                                       break;
                                   case 5:

                                       laporanPenjualan.showLaporan(u+1);
                                       break;
                                   case 6:
                                     pendapatan.cetakPendapatan(u+1);
                                    break;
                                   default : System.out.println("Menu tidak tersedia");
                                       
                               }
                               
                            }while(pilihan2 !=0);
                        }else{
                             System.out.println("Username atau password tidak sesuai");
                        }
                        break;
                    case 2:
                        System.out.println("Anda ingin mendaftar sebagai : ");
                        System.out.printf("1.Pembeli"
                                + "\n2.Vendor\n");                     
                        int user = keyboard.nextInt();
                        
                        if(user==1){
                            
                            int id_pembeli =0;
                            System.out.println("Untuk mendaftar sebagai Pembeli silahkan isi data dibawah ini");
                            
                             for(int i=0;i<pembeli.pembeli.size();i++){
                               id_pembeli = pembeli.pembeli.get(i).id_pembeli+1;
                            }
                             
//                            username, password, jenisKelamin, nik, nomorTelepon, nama, alamat
                             int saldo = 10000000;
                            System.out.printf("Nama : ");
                            keyboard.nextLine();
                            String nama =  keyboard.nextLine();
                            System.out.printf("Username : ");
                            String username = keyboard.nextLine();
                            System.out.printf("Password : ");
                            String password =  keyboard.nextLine();
                            System.out.printf("Alamat : ");
                            String alamat =  keyboard.nextLine();
                            System.out.println("Jenis Kelamin");
                            System.out.printf("1.Laki-laki | 2.Perampuan : ");
                            int jk = keyboard.nextInt();
                            String jenisKelamin = "null";
                            switch(jk){
                                case 1:
                                    jenisKelamin = "Laki-laki";
                                    break;
                                case 2:
                                    jenisKelamin = "Perampuan";
                                    break;
                                default: System.out.println("Menu tidak tersedia");
                            }
                            System.out.printf("NIK : ");
                            keyboard.nextLine();
                            String nik = keyboard.nextLine();
                            System.out.printf("Nomor Telepon/Hp : ");
                            int nomorTelepon = keyboard.nextInt();
                            
                            int cek = 0;
                            if(pembeli.pembeli.isEmpty() || vendor.vendor.isEmpty()){
                                cek =1;
                            }else{
                                for(int i=0;i<pembeli.pembeli.size();i++){
                                    if(!username.equals(pembeli.pembeli.get(i).username())){
                                         for(int y=0;y<vendor.vendor.size();y++){
                                                if(!username.equals(vendor.vendor.get(y).username())){
                                                    cek = 1;
                                                }else{
                                                    cek = 0;
                                                }
                                             }
                                    }else{
                                        cek = 0;
                                    }
                                }
                            }
                           if(cek==1){
                                   pembeli.addPembeli(id_pembeli,saldo,username, password, jenisKelamin, nik, nomorTelepon, nama, alamat);
                                  System.out.println("\nSukses mendaftar");
                           }else{
                               System.out.println("Username telah terdaftar");
                           }
                  
                         
                        }else if(user == 2){
                            int id_vendor = 0;
                            
                            for(int i=0;i<vendor.vendor.size();i++){
                                id_vendor = vendor.vendor.get(i).id_vendor+1;
                            }
                            System.out.println("Untuk mendaftar sebagai Vendor silahkan isi data dibawah ini");
                            System.out.printf("Nama : ");
                            keyboard.nextLine();
                            String nama =  keyboard.nextLine();
                            System.out.printf("Nama UMKM :");
                            String namaUMKM = keyboard.nextLine();
                            System.out.printf("Username : ");
                            String username = keyboard.nextLine();
                           
                            int cek = 0;
                            if(pembeli.pembeli.isEmpty() && vendor.vendor.isEmpty()){
                                cek =1;
                            }else{
                                for(int i=0;i<pembeli.pembeli.size();i++){
                                    if(!username.equals(pembeli.pembeli.get(i).username())){
                                         for(int y=0;y<vendor.vendor.size();y++){
                                                if(!username.equals(vendor.vendor.get(y).username())){
                                                    cek = 1;
                                                }else{
                                                    cek = 0;
                                                }
                                             }
                                    }else{
                                        cek = 0;
                                    }
                                }
                            }
                            if(cek == 1){
                       
                            System.out.printf("Password : ");
                            String password =  keyboard.nextLine();
                            System.out.printf("Alamat : ");
                            String alamat =  keyboard.nextLine();
                            vendor.addVendor(id_vendor, namaUMKM, username, password, nama, alamat);
                            System.out.println("\nSukses mendaftar");
                            }else{
                                System.out.println("Username telah terdaftar");
                             }
                        }else{
                            System.out.println("Menu tidak tersedia");
                        }
                        
                        break;
                    case 3:
                        System.out.println("Program Selesai");
                        break;
                    default: 
                        System.out.println("Tidak ada pilihan yang sesuai");
                    }
               }while(pilihan!=0);
               
        }
} 
    
class Vendors{
            ArrayList<Vendor> vendor;

            public Vendors(){
                vendor = new ArrayList<Vendor>();
            }
            
            public void addVendor(int id_vendor, String namaUMKM,String username, String password, String nama, String alamat){
                vendor.add(new Vendor(id_vendor, namaUMKM, username, password, nama, alamat));
            }
         
            public void editVendor(int u,int id_vendor,String namaUMKM, String username, String password, String nama, String alamat){
               vendor.set(u,new Vendor(id_vendor,namaUMKM, username, password, nama, alamat));
            }
            
}


class Pembeli{
            ArrayList<Calon_Pembeli> pembeli;
            public Pembeli(){
                pembeli = new ArrayList<Calon_Pembeli>();
            }

            public void addPembeli(int id_pembeli,int saldo,String username, String password, String jenisKelamin, String nik, int nomorTelepon, String nama, String alamat){
                pembeli.add(new Calon_Pembeli(id_pembeli,saldo,username, password, jenisKelamin, nik, nomorTelepon, nama, alamat));
            }

            public void showProfil(int u){
                  pembeli.get(u).cetakProfil();
            }
            
            public void editProfil(int u ,int id_pembeli,int saldo,String username, String password, String jenisKelamin, String nik, int nomorTelepon, String nama, String alamat){
                    pembeli.set(u, new Calon_Pembeli(id_pembeli,saldo,username, password, jenisKelamin, nik, nomorTelepon, nama, alamat));
            }
}
            

class Pendapatans{
    ArrayList<Pendapatan> pendapatan;
    
    public Pendapatans(){
        pendapatan = new ArrayList<Pendapatan>();
    }
    

   public void setPendapatan(int id_vendor, int jumlahProdukTerjual, String listHagraPordukTerjual, int totalPendaptan){
       if(pendapatan.isEmpty()){
            pendapatan.add(new Pendapatan(id_vendor, jumlahProdukTerjual, listHagraPordukTerjual, totalPendaptan));
       }else{
       for(int i = 0; i<pendapatan.size();i++){
           if(id_vendor != pendapatan.get(i).id_vendor){
               pendapatan.add(new Pendapatan(id_vendor, jumlahProdukTerjual, listHagraPordukTerjual, totalPendaptan));
               System.out.println("Sukses");
           }else if(!pendapatan.isEmpty() &&id_vendor == pendapatan.get(i).id_vendor ){
              pendapatan.set(i, new Pendapatan(id_vendor, jumlahProdukTerjual, listHagraPordukTerjual, totalPendaptan));
               System.out.println("Sukses");
           }else{
//               System.out.println("Tidak ada ba");
           }
       }
       }
       
       
   }
   
   
   public void cetakPendapatan(int u){
      
       for(int i=0;i<pendapatan.size();i++){
          
           if(pendapatan.get(i).id_vendor==u){
               System.out.println("Pendapatan anda : "+pendapatan.get(i).totalPendaptan+" \t |  produk terjual : "+pendapatan.get(i).jumlahProdukTerjual);
                     break;    
           }else{
                System.out.println("Blum ada produk anda terjual");
           }
       }
       if(pendapatan.isEmpty()){
           System.out.println("Tidak ada pendapatan");
       }
   }
   
   
   
}
 

class Produk{
    ArrayList<UMKM> umkm;
    
    public Produk(){
        umkm = new ArrayList<UMKM>();
    }
    
    public void addUMKM(int id_umkm,int id_vendor,int stok,int terjual,int harga,String namaProduk, DaftarUMKM daftarUMKM,String nama, String namaUMKM,Status status){
        umkm.add(new UMKM(id_umkm,id_vendor,stok,terjual,harga,namaProduk,daftarUMKM, namaUMKM,status));
    }
    
    public void cetakUMKMK(int u,int pilihan){
        for(int i=0;i<umkm.size();i++){
            if(u==umkm.get(i).id_vendor){
                System.out.printf(i+1+".");umkm.get(i).cetakUmkm();
            }else if(u==umkm.get(i).id_vendor && pilihan == i+1){
                   System.out.printf(umkm.get(i).namaProduk);
            }else{
//                System.out.println("Tidak ada Produk");
            }
        }
    }
    
//    public void ceakUMKM2(int u,int y){
//        for(int i=0;i<umkm.size();i++){
//            if(u==umkm.get(i).id_vendor){
//                    
//            }
//        }
//    }
    
    public void cetakNamaProduk(int u,int pilihan){
        System.out.println("No\tNamaProduk\tStatus");
        for(int i=0;i<umkm.size();i++){
            if(u==umkm.get(i).id_vendor && umkm.get(i).status.equals(Status.terima) || umkm.get(i).status.equals(Status.proses)){
                
                System.out.printf(i+1+"\t"+umkm.get(i).namaProduk);
                System.out.println("\t"+umkm.get(i).status);
            }else if(u==umkm.get(i).id_vendor && pilihan == i+1 && umkm.get(i).status.equals(Status.terima)){
                   System.out.printf(umkm.get(i).namaProduk);
            }else{
//                System.out.println("Tidak ada Produk");
            } 
        }
    }
    
    public void cetakSemuaUMKM(){
        for(int i=0;i<umkm.size();i++){
            if(umkm.get(i).status.equals(Status.terima)){
            System.out.printf(i+1+".");umkm.get(i).cetakUmkm();
            }
            
        }
    }
    
    public void pesan(int pesan){
//        System.out.println(umkm.get(1));
        System.out.println(umkm.get(pesan-1).namaProduk);
    }
    
    public void editUMKM(int id,int id_umkm,int id_vendor,int stok,int terjual,int harga,String namaProduk, DaftarUMKM daftarUMKM, String namaUMKM,Status status){
         umkm.set(id, new UMKM(id_umkm,id_vendor,stok,terjual,harga,namaProduk,daftarUMKM, namaUMKM,status));        
    }
    
    public void cariUMKMVendor(String cari,int id_vendor){
        for(int i=0;i<umkm.size();i++){
            if(cari.equals(umkm.get(i).namaProduk) && id_vendor == umkm.get(i).id_vendor){
              umkm.get(i).cetakUmkm();
            }
        }
    }
    
    public void deletUmkm(int u,int id_vendor){
        for(int i=0;i<umkm.size();i++){
            if(umkm.get(i).id_vendor==id_vendor && u == i){
                umkm.remove(i);
                System.out.println("Sukses Menghapus UMKM");
            }else{
               
            }
        }
    }
    
}

class LaporanPenjualan{
//    int u = ;
    ArrayList<Laporan_Penjualan> laporanPenjualan;
    
    public LaporanPenjualan(){
        laporanPenjualan = new ArrayList<Laporan_Penjualan>();
    }
    
    public void addLaporanPenjualan(int id_vendor, int jumlahProdukTerjual, int sisaProduk){
        for(int i=0;i<laporanPenjualan.size();i++){
            if(laporanPenjualan.get(i).id_vendor == id_vendor){
                laporanPenjualan.set(i, new Laporan_Penjualan(id_vendor,jumlahProdukTerjual,sisaProduk));
            }else{
                laporanPenjualan.add(new Laporan_Penjualan(id_vendor,jumlahProdukTerjual,sisaProduk));
            }
        }
        
        
        if(laporanPenjualan.isEmpty()){
            laporanPenjualan.add(new Laporan_Penjualan(id_vendor,jumlahProdukTerjual,sisaProduk));
        }
    }

    public void editLaporanPenjualan(int u,int id_vendor,int jumlahProdukTerjual, int listProdukTerjual, int sisaProduk){
        laporanPenjualan.set(u, new Laporan_Penjualan(id_vendor, jumlahProdukTerjual,  sisaProduk));
    }
    
    public void showLaporan(int u){
        for(int i=0;i<laporanPenjualan.size();i++){
           if(u==laporanPenjualan.get(i).id_vendor){
                laporanPenjualan.get(i).cetakLaporan();
           }
        }
    }
}

class Komentar{
    ArrayList<Komentarsaran> komentar;

    public Komentar(){
        komentar = new ArrayList<Komentarsaran>();
    }
    public void addKoemntar(int id_komentarsaran, String isi){
        komentar.add(new Komentarsaran(id_komentarsaran, isi));
    }  
    public void viewKomentar(){
        for (int i=0;i<komentar.size();i++){
            System.out.println(i+1+".");
            System.out.println(komentar.get(i).isi);
        }
    }
}
class Pesanan{
    ArrayList<Pemesanan> pemesanan;
    
    public Pesanan(){
        pemesanan = new ArrayList<Pemesanan>();
    }
    
    public void addPesanan(int id_pembeli,int id_vendor,DaftarUMKM jenisProduk, String namaProduk, String namaUMKM,int jumlahPesan, int totalHarga, String status){
        pemesanan.add(new Pemesanan(id_pembeli,id_vendor,jenisProduk, namaProduk, namaUMKM, jumlahPesan, totalHarga, status));
    }
//    asds
    public void cetakPesananSaya(int id_pembeli,int pilih){
        
        for(int i=0;i<pemesanan.size();i++){
            if(id_pembeli == pemesanan.get(i).id_pembeli && pemesanan.get(i).status.equals("pesan") && pilih ==-1){
                    System.out.printf(i+1+".");
                     System.out.println(pemesanan.get(i).namaProduk);
               
            }
        else{
//                 System.out.println("Anda belum memilik pemesanan");

            }
        }
        
        
        if(pemesanan.isEmpty()){
//            System.out.println("Anda belum memiliki pemesanan");
        }
    }
    
    public void cetakPesanan(){
        for(int i=0;i<pemesanan.size();i++){
            if(pemesanan.get(i).status.equals("proses")){
                System.out.printf(i+1+".");
                pemesanan.get(i).cetakPemesanan();
            }

        }
    }
    
    public void hapusPesanan(int id){
        pemesanan.remove(id);
    }
}
