/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author marthin
 */
public class TestScopeVariabel {
    static int x = 50;
    
    public static void main(String[] args) {
        int a = 20;
        System.out.println("Nilai dari x" + x);
        System.out.println("Nilai Dari a" + a);
        {
            int b = 30;
            
            System.out.println("Nilai dari b" + b);
            System.out.println("Nilai dari x" + x);
            System.out.println("Nilai Dari a" + a);
        }
        //System.out.println("nilai b =" + b);
    }
}
