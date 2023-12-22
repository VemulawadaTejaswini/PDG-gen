//package com.beginner.b052;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cities [] = new int [n];
        for(int i=0;i<n;i++)
            cities[i] = sc.nextInt();

        Long minCost = 0L;

        for(int i=0;i<n-1;i++){
            int dist = cities[i+1]-cities[i];
            minCost+=Math.min(dist*a,b);
        }

        System.out.print(minCost);

        sc.close();
    }

}