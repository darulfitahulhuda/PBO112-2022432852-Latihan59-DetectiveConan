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
public class KarakterUtama extends Anime {
    private String namaSamaran;

    public KarakterUtama(String nama, String makanan, String sifat, int umur, String tokoh) {
        super(nama, makanan, sifat, umur, tokoh);
        this.nama = nama;
        this.makanan = makanan;
        this.sifat = sifat;
        this.umur = umur;
        this.tokoh = tokoh;
    }

    public String getNamaSamaran() {
        return namaSamaran;
    }

    public void setNamaSamaran(String namaSamaran) {
        this.namaSamaran = namaSamaran;
    }
}
