package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int Y = sc.nextInt();
        int sum = 0;
        int man = 0;
        int gosen = 0;
        int sen = 0;
        int flag = 0;
        for (int i = 0; i < N; i++) {
            man = i;
            for (int j = 0; j < N-i; j++) {
                gosen = j;
                sen = N - man - gosen;
                sum = man *10000 + gosen * 5000 + sen * 1000;
                if (sum == Y) {
                    System.out.print(man);
                    System.out.print(" ");
                    System.out.print(gosen);
                    System.out.print(" ");
                    System.out.print(sen);
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) break;
        }
        if (flag == 0) {
            System.out.println("-1 -1 -1");
        }


    }

}