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

		    String s = sc.next();
		    String t = sc.next();
		    if(s.length() > t.length()) {
		    	System.out.println("GREATER");
		    }else if(t.length() > s.length()) {
		    	System.out.println("LESS");
		    }else {
		    	for(int i = 0; i < s.length(); i++) {
		    		if(s.substring(i, i+1).equals(t.substring(i, i+1))) {
		    			continue;
		    		}else {
		    			int si = Integer.parseInt(s.substring(i,i+1));
		    			int ti = Integer.parseInt(t.substring(i,i+1));
		    			if(si > ti) {
		    				System.out.println("GREATER");
		    			}else {
		    				System.out.println("LESS");
		    			}
		    			break;
		    		}
		    	}
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
