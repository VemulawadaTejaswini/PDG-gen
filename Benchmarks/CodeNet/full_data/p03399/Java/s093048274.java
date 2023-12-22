package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i<4;i++){
            arr[i] = input.nextInt();
        }

        int t=0, b=0;

        t = (arr[0]>arr[1])? arr[1]:arr[0];
        b = (arr[2]>arr[3])? arr[3]:arr[2];


        //Arrays.sort(arr);


        System.out.print(t+b);


    }
}
