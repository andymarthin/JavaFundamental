/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operator;

/**
 *
 * @author marthin
 */
public class Pengurangan2 {
  static int w = 5,x = 5,y,z;
    public static void main(String[] args) {
        y = 8 - x--;
        z = 8 - --w;
        
        System.out.println("Nilai Dari Y : " + y);
        System.out.println("Nilai Dari Z : " + z);
        
    }
}
