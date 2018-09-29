/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

/**
 *
 * @author seanbunker
 */

import java.util.Scanner;

public class TempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please input Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit =((9.0/5.0)*celsius+32.0);
        System.out.println("The temperature is " + fahrenheit + " degrees in Fahrenheit"); 
        
    }
    
}
