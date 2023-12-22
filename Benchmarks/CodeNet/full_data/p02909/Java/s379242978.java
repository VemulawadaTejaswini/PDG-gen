/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Nour
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x;
        Scanner n =new Scanner(System.in);
        x=n.next();
        if(x.equals("Sunny"))
            System.out.print("Cloudy");
        else if(x.equals("Cloudy"))
            System.out.print("Rainy");
        else if(x.equals("Rainy"))
            System.out.print("Sunny");
    }
    
}
