package com.hhs.xgn.atcoder.abc070;

import java.math.BigInteger;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            BigInteger mul=BigInteger.ONE;
            BigInteger mul2;
            BigInteger[] arr=new BigInteger[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextBigInteger();
                mul2=mul.multiply(arr[i]);
                mul=arr[i].gcd(mul);
                mul=mul2.divide(mul);
            }
            System.out.println(mul);
        }
    }
}
