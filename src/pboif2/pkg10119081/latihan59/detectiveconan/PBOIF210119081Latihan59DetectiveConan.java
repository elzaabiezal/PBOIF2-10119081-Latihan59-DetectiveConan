/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan59.detectiveconan;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Detective Conan
 */
public class PBOIF210119081Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Karakter conan = new Karakter("Conan Edogawa (Shinichi Kudo)","Tokyo",true,"Investigasi");
        conan.tampilKarakter();
        
        Karakter ran = new Karakter("Ran Mouri","Osaka",false,"Karate");
        ran.tampilKarakter();
        
        Karakter ai = new Karakter("Ai Haibara (Shiho Miyano / Sherry)","Tokyo",true,"Kimia dan Farmasi");
        ai.tampilKarakter();
    }
    
}
