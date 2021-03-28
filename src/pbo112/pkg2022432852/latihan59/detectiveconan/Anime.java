/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112.pkg2022432852.latihan59.detectiveconan;

/**
 *
 * @author Mini Pc
 */
public class Anime {
    protected String nama;
    protected String makanan;
    protected String sifat;
    protected int umur;
    protected String tokoh;
    
    public Anime(String nama, String makanan, String sifat, int umur, String tokoh){
        this.nama = nama;
        this.makanan = makanan;
        this.sifat = sifat;
        this.umur = umur;
        this.tokoh = tokoh;
}

    
    public void displayKarakter(){
        System.out.println("Nama : "+nama);
        System.out.println("Makanan kesukaan : "+makanan);
        System.out.println("Sifat : "+sifat);
        System.out.println("Umur : "+umur);
        System.out.println("Tokoh : "+tokoh);
    }
    
}
