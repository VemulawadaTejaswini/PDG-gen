package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for(int i = 0;i < S.length();i++){
            if(S.charAt(i) == 1) continue;
            System.out.println(S.charAt(i));
            return;
        }

        System.out.println(1);
        sc.close();
        return;
    }

    static long nextInt(Scanner sc){
        return Long.parseLong(sc.next());
    }

}

