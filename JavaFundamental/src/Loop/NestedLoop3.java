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
public class NestedLoop3 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
