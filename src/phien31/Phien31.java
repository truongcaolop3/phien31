/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien31;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do F: ");
        x = sc.nextDouble();
        
        double c = (( 5 *(x - 32.0)) / 9.0);
        System.out.println(x + " do F = " + c + "do C" );
    }
    
}
