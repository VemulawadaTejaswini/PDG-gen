/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author c0117321c5
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        for (int i = 0; i <= 2; i++) {
            if (S.charAt(i)==T.charAt(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

}
