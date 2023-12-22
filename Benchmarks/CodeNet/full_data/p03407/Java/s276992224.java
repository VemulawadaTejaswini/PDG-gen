/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc091;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class ABC091_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if( C <= (A+B)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
