//package com.regular.arc069;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int ans = 0;
        if(N>=2*M){
            ans = N;
        }
        else{
            ans = N + (M-2*N)/4;
        }

        System.out.println(ans);


        sc.close();

    }

}
