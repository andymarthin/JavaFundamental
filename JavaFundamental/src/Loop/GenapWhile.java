/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Loop;

/**
 *
 * @author marthin
 */
public class GenapWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 20) {
            if (i % 2 == 0) {
                System.out.print(i+",");
            }
            i++;
        }
   
    }
}
