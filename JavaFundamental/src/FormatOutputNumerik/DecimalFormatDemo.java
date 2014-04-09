/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FormatOutputNumerik;

import java.text.DecimalFormat;

/**
 *
 * @author marthin
 */
public class DecimalFormatDemo {
    public static void main(String[] args) {
        DecimalFormat formatku = new DecimalFormat("###.##");
         System.out.println(formatku.format(45.8398767));
    }
    
}
