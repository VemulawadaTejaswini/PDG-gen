import java.util.Arrays;

//intのオーバーフローに気をつけろ,AGCはだいたいlongにしておけ
//毎回余りを求めることでオーバーフローしなくなる
//nextLineよりnextだ
//charは''で囲うんだぞ
//読み込みは先に全部やっておけ
//for文を回す回数に気をつけろ
	//for文は10^3の三重はTLE,10^5の二重はTLE,10^9のforはTLE
//貪欲は使えるか？？試した？？

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int[] road = new int[2*n];
		    int[] counter = new int[n];
		    for(int i = 0; i < 2 * n; i++) {
		    	road[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n; i++) {
		    	counter[i] = 0;
		    }
		    
		    
		    for(int i = 0; i < 2*n; i++) {
		    	counter[road[i]]++;
		    }
		    
		    for(int i = 0; i < n; i++) {
		    	System.out.println(counter[i]);
		    }
		    
		    sc.close(); }

	public static void saiki(int a, String b) {
		//再帰コーディングのお手本

		if(a == 0) {
			System.out.println(b);
		}else {
			for(char ch = 'a'; ch <= 'c'; ch++) {
				saiki(a-1,b + ch);
			}
		}
	}

	public static  int gcd(int a, int b) {
	    if (a < b) {
	        int tmp = a;
	        a = b;
	        b = tmp;
	    }

	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;
	}
}
