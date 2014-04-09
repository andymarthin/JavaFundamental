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
public class Perkalian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukan Bilangan Pertama :");
        int bilangan1 = scan.nextInt();
        
        System.out.println("Masukan Bilangan Kedua :");
        int bilangan2 = scan.nextInt();
        
        System.out.println("Hasil Perkalian " + (bilangan1 * bilangan2));
    }
}
