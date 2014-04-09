/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marthin
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        int alas =3;
        int tinggi = 7;
        
        double luas = (double)(alas*tinggi)/2;
        double rounded = Math.round(luas);
        System.out.println("Luas Segitiga :" + rounded );
               
    }
}
