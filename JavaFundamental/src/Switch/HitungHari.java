/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Switch;


/**
 *
 * @author marthin
 */
public class HitungHari {
    int hari;

    void Hitung(int bulan, int tahun) {
        switch (bulan) {
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                hari =31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                hari = 30;
                break;
                
            case 2:
                 if(((bulan %  4 == 0) && !(bulan % 100 == 0)) || (bulan % 400 == 0))
                    hari = 29;
                 else
                    hari = 28;
                break;
            default:
                System.out.println("Masukan Pilihan");
        }
        System.out.println("Pada Tahun " + tahun + " bulan " + bulan +" adalah " + hari + " hari");
    }

    
}
