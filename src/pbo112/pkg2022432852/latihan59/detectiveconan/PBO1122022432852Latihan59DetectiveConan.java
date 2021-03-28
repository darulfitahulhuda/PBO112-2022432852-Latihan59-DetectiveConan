/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112.pkg2022432852.latihan59.detectiveconan;

/**
 *
 * @author Mini Pc
 * Nama : DaruL Fitahul Huda 
 * NIM : 2022432852 
 * Kode Kelas :FS112B (PBO112B) 
 * Deksripsi Program : Menampilkan karakter dari Anime Detective Conan

 */
public class PBO1122022432852Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===Anime Detective Conan===");
        
        KarakterUtama ku = new KarakterUtama("Shinichi Kudo", "pai", "ambisius", 21, "Utama");
        ku.setNamaSamaran("Conan");
        ku.displayKarakter();
        System.out.println("Nama Samaran : "+ ku.getNamaSamaran());
        
        System.out.println("");
    
        KarakterPendukung kp = new KarakterPendukung("Kogoro Mouri","Ramen","pantang Menyerah", 30, "Pendukung");
        kp.setPanggilan("Heiji");
        kp.displayKarakter();
        System.out.println("Nama Panggilan : " + kp.getPanggilan());
        System.out.println("");
    }
    
}
