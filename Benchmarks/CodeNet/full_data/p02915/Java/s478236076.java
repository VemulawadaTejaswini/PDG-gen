/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atcodertestingcode;

import java.util.Scanner;
// import java.util.Math;

/**
 *
 * @author Bob
 */
public class AtCoderTestingCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intN = new Scanner(System.in);
        System.out.println("Please enter the value for N");
        int n = intN.nextInt();
        while (n <= 0 || n >= 9) {
            System.out.println("Please enter a valid value.");
            n = intN.nextInt();
        }
        System.out.println(n*n*n);
    }
}
