package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextLong();
        long w = in.nextLong();

        long hw = h*w;
        long hw2 = h*w/2;

        System.out.println(w==1 || h==1 ? 1 : hw2 + hw % 2);
    }
}