/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marthin
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        int r = 7;
        final double PI =  3.14;
        double lingkaran = (double)(PI*r*r);
        double bulat = Math.round(lingkaran);
        System.out.println("Luas Lingkaran = " + bulat);
    }
}
