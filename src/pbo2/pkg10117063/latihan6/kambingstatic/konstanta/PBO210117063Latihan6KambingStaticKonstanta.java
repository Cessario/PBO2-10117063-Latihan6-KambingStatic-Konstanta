/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan6.kambingstatic.konstanta;

/**
 *
 * @author DEADPOOL
 *NAMA : Cessario
 *NIM : 10117063
 *KELAS : IF-2
 *Deskripsi Program : menampilkan banyak kambing yang dimiliki midun */
public class PBO210117063Latihan6KambingStaticKonstanta {

    /**
     * @param args the command line arguments
     */
    // Nama_Kambing sebagai konstanta
    public static final String Nama_Kambing = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(Nama_Kambing + " memiliki kambing sebanyak " + 
                Mamalia.jumlahKambing);
    }
    
}
