/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umkm_toba;

/**
 *
 * @author Win10
 */
public class Komentarsaran {
    int id_komentarsaran;
    String isi;

    public Komentarsaran(int id_komentarsaran, String isi) {
        this.id_komentarsaran = id_komentarsaran;
        this.isi = isi;
    }

    @Override
    public String toString() {
        return "Komentarsaran{" + "id_komentarsaran=" + id_komentarsaran + ", isi=" + isi + '}';
    }
    
    
}
