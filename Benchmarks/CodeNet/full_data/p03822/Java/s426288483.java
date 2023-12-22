//package com.grand9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int match[] = new int [N];
        for(int i=1;i<N;i++){
            match[i]= sc.nextInt();
        }

        int ans = findDepth(1,match);


        System.out.println(ans);


        sc.close();

    }

    private static int findDepth(int tar , int match[]){
        int ret = 0;
        int cnt = 0;
        for(int i=0;i<match.length;i++){
            if(match[i]==tar){
                cnt++;
                ret = Math.max(ret, findDepth(i+1,match)+1);
            }
        }
        ret = Math.max(ret,cnt);
        return ret;
    }

 }
