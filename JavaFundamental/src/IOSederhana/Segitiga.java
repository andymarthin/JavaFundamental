/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IOSederhana;
import java.util.Scanner;
/**
 *
 * @author marthin
 */
public class Segitiga {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukan Alas : ");
        int alas = scan.nextInt();
        
        System.out.println("Masukan Tinggi :");
        int tinggi = scan.nextInt();
        
        double luas = (double)(alas*tinggi)/2;
        double rounded = Math.round(luas);
        System.out.println("Luas Segitiga :" + luas );
        
        
    }
}
