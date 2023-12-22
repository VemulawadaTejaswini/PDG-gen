//intのオーバーフローに気をつけろ,AGCはだいたいlongにしておけ
//毎回余りを求めることでオーバーフローしなくなる
//nextLineよりnextだ
//charは''で囲うんだぞ
//読み込みは先に全部やっておけ
//for文を回す回数に気をつけろ

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);
		    
		    String s = sc.next();
		    while(!s.equals("")) {
		    	if(s.endsWith("dream")) {
		    		s = s.substring(0,s.length()-5);
		    	}else if(s.endsWith("dreamer")) {
		    		s = s.substring(0,s.length()-7);
		    	}else if(s.endsWith("eraser")) {
		    		s = s.substring(0,s.length()-6);
		    	}else if(s.endsWith("erase")) {
		    		s = s.substring(0,s.length()-5);
		    	}else {
		    		break;
		    	}
		    }
		    if(s.equals("")) {
		    	System.out.println("YES");
		    }else {
		    	System.out.println("NO");
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
