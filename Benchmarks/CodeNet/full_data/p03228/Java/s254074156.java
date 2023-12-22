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

		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int k = sc.nextInt();
		    
		    for(int i = 0; i < k; i++) {
		    	if(i % 2 == 0) {
		    		if(a % 2 == 0) {
		    			a /= 2;
		    			b += a;
		    		}else {
		    			a--;
		    			a/=2;
		    			b+= a;
		    		}
		    	}else {
		    		if(b % 2 == 0) {
		    			b/=2;
		    			a += b;
		    		}else {
		    			b--;
		    			b /=2;
		    			a += b;
		    		}
		    	}
		    }
		    System.out.println(a + " " + b);
		    
		    
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
