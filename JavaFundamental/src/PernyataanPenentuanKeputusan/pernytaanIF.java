/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PernyataanPenentuanKeputusan;

/**
 *
 * @author marthin
 */
public class pernytaanIF {
    public static void main(String[] args) {
        int diskon =0,totalBelanja= 50000;
        
        if(totalBelanja >= 100000){
            diskon = totalBelanja/10;
        }else{
            diskon = 0;
        }
 
        System.out.println("Diskon = " + diskon);
    }
}