// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args){
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int N=sc.nextInt();
		int[] A=new int[N];
		int[] B=new int[N];
		for(int i=0;i<N;++i){
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
		}
		long[] dp=new long[H+1];
		Arrays.fill(dp,Long.MAX_VALUE/3);
		dp[0]=0;
		for(int i=0;i<N;++i){
			for(int h=0;h<=H;++h){
				dp[Math.min(H,h+A[i])]=Math.min(dp[Math.min(H,h+A[i])],dp[h]+B[i]);
			}
		}
		System.out.println(dp[H]);
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
