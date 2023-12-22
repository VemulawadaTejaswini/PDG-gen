/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author Jeel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        if(n==1&a!=b)
        {
            System.out.print("0");
            return;
        }
        else if(b<a)
        {
            System.out.print("0");
            return;
        }
        System.out.print((b*(n-1)+a)-((a*(n-1))+b)+1);
    }
    
}
