
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
		    
		    int n = Integer.parseInt(sc.next());
		    int[] a = new int[n];
		    int[] tmp = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(sc.next());
				tmp[i] = a[i];
			}
			Arrays.sort(a);
			
		    for(int i = 0; i < n; i++) {
		    	if(tmp[i] == a[0]) {
		    		if(a[n]*a[1] < 0) {
		    			System.out.println((a[n]-a[1])*2);
		    		}else {
		    			System.out.println(Math.max(Math.abs(a[1]), Math.abs(a[n]))*2);
		    		}
		    	}else if (tmp[i] == a[n]) {
		    		if(a[n-1]*a[0] < 0) {
		    			System.out.println((a[n-1]-a[0])*2);
		    		}else {
		    			System.out.println(Math.max(Math.abs(a[0]), Math.abs(a[n-1]))*2);
		    		}
		    	}else {
		    		if(a[n]*a[0] < 0) {
		    			System.out.println((a[n]-a[0])*2);
		    		}else {
		    			System.out.println(Math.max(Math.abs(a[0]), Math.abs(a[n]))*2);
		    		}
		    	}
		    }
			
		    sc.close(); }
	
	
	public static String caesar(String a, int k) {
		//シーザー暗号
		String t = ""; 
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) < 'a') {
				t = t + String.valueOf((char)(a.charAt(i)) );
			}else if(a.charAt(i) + k <= 'z') {
				t = t + String.valueOf((char)(a.charAt(i) + k));
			}else {
				t = t + String.valueOf((char)(a.charAt(i) + k - 26));
			}
		}
		return t;
	}
	public static String raseac(String a, int k) {
		//シーザー暗号の復号
		String t = ""; 
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) < 'a') {
				t = t + String.valueOf((char)(a.charAt(i)) );
			}else if(a.charAt(i) - k >= 'a') {
				t = t + String.valueOf((char)(a.charAt(i) - k));
			}else {
				t = t + String.valueOf((char)(a.charAt(i) - k + 26));
			}
		}
		return t;
	}


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
