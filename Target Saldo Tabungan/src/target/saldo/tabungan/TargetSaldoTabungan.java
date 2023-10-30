/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package target.saldo.tabungan;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Inisialisasi variabel
        int saldoAwal = 3500000;
        float bungaPerBulan = 8;
        int saldoTarget = 6000000;

        // Perulangan
        int bulan = 1;
        while (saldoAwal < saldoTarget) {
            // Hitung bunga
            int bunga = (int) (saldoAwal * bungaPerBulan / 100);

            // Tambahkan saldo
            saldoAwal += bunga;

            // Cetak saldo
            System.out.println("Saldo di bulan ke-" + bulan + " = Rp." + saldoAwal);

            bulan++;
        }

        // Cetak saldo akhir
        System.out.println("Saldo akhir = Rp." + saldoAwal);
    }
    
}
