package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int D = input.nextInt();
        int X = input.nextInt();
        int Total = 0;


        int[] A = new int[N];
        for(int i = 0; i < N;i++){
            A[i] = input.nextInt();
        }

        for(int j=0;j<N;j++){
            int numCho = count(A[j],D);
            Total = Total+numCho;
        }

        System.out.print(Total+X);

    }

    public static int count(int a, int d){
        int n = 1;
        int sum = a+1;
        while(sum <= d) {
            n++;
            sum = sum + a;
        }
        return n;
    }


}
