
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
		   
		    
		    // 2数が同じときのみ2を足すのが丸そう
		    int[] a = new int[3];
		    a[0] = Integer.parseInt(sc.next());
		    a[1] = Integer.parseInt(sc.next());
		    a[2] = Integer.parseInt(sc.next());
		    int count = 0;
		    
		    Arrays.sort(a);
		    
		    while(a[1] != a[2]) {
		    	a[0]++;
		    	a[1]++;
		    	count++;
		    }
		    if((a[2]-a[0]) % 2 ==0) {
		    	count += (a[2]-a[0])/2;
		    }else {
		    	count += (a[2]+1-a[0])/2+1;
		    }
		    System.out.println(count);
		    
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
