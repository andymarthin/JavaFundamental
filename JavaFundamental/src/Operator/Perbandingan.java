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
public class Perbandingan {
    public static void main(String[] args) {
        int age = 36;
        boolean hasilbanding1 = age < 25;
        if(hasilbanding1){
            System.out.println("Hasil perbandingan True");   
        }else{
            System.out.println("Hasil Perbandingan False");
        }
        boolean hasilbanding2 = age != 26;
        if(hasilbanding2){
            System.out.println("Hasil Perbandingan 2 True");
        }else{
            System.out.println("Hasil Perbandingan 2 False");
        }
    }
}
