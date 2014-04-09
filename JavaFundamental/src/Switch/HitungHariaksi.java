/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Switch;

import java.util.Scanner;

/**
 *
 * @author marthin
 */
public class HitungHariaksi {
    public static void main(String[] args) {
        HitungHari hitung = new HitungHari();
        Scanner mTahun = new Scanner(System.in);
        
        System.out.println("Masukan Tahun :");
        int tahun = mTahun.nextInt();
        
        Scanner mBulan = new Scanner(System.in);
        System.out.println("Masukan Bulan :");
        int bulan = mBulan.nextInt();
        
        hitung.Hitung(bulan, tahun);
        
        
        
        
    }
}
