/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author AlFar
 */
public class pelajar extends orang {
    private String nim ;
    private String asalSekolah;
    private double nilai;
    
    public pelajar (String nama, double tinggi, double berat, String nim, String sekolah, 
            double nilai){
       super (nama, tinggi, berat);
       this.nim = nim;
       asalSekolah = sekolah;
       this.nilai = nilai;
    }
    public String toString(){
        return (super.toString() + "\nNIM : " + nim + "\nSeolah : " + asalSekolah +
                "\nNilai : " + nilai);
    }
    
}
    



