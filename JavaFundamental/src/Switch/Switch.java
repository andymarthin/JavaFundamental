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
public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Pilihan :");
        int pilihan = scan.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Soto ayam");
                break;
            case 2:
                System.out.println("Gule Kambing");
                break;
            case 3:
                System.out.println("Nasi Goreng");
                break;
            default:
                System.out.println("Silahkan pilih 1 2 atau 3 ");
        }
    }
}
