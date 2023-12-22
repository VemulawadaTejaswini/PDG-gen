//package com.grand9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] =new int [N];
        int B[] = new int [N];

        for(int i=0;i<N;i++){
            A[i]= sc.nextInt();
            B[i]=sc.nextInt();
        }

        long ans = 0;
        for(int i =N-1;i>=0;i-- ){
            if(A[i]%B[i]!=0){
                long plus = ((A[i]+ans)/B[i]+1)*B[i]-A[i]-ans;
                ans += plus;
            }
           // System.out.println(ans);
        }


        System.out.println(ans);


        sc.close();

    }

 }
