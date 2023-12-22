/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode.cp;

import java.util.Scanner;

/**
 *
 * @author Ivan Eka
 */
public class ProgrammingEducation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char N = sc.next().charAt(0);
        if(N == '1'){
            System.out.println("Hello World");
        } else if(N == '2'){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
