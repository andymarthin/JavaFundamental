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
public class Penambahan {
    public static void main(String[] args) {
        int x,y,z;
        
        x = 42;
        y= x++;
        System.out.println(x);
        System.out.println(y);

        System.out.println(x);
        z=++x;
        System.out.println(z);
    }
}
