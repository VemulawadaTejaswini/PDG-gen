/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atcoder;

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
        Scanner sc = new Scanner(System.in);
        String weather = sc.next();
        if (weather.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }

}
