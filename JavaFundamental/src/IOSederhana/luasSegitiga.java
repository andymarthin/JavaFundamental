/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IOSederhana;

/**
 *
 * @author marthin
 */
public class luasSegitiga {
    public static void main(String[] args) {
        double alas = Double.parseDouble(args[0]);
        double tinggi = Double.parseDouble(args[1]);
        
        double luas = (alas * tinggi)/2;
        
        System.out.println("Luas Segitga :" + luas);
    }
}
