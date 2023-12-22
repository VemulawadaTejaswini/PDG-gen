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
		    //2*nが連続する2整数の積で表されたとき行けるっぽい.
		    int i = 1;
		    int count = 0;
		    while(i * (i+1) <= 2*n) {
		    	if(i*(i+1)==2*n) {
		    		count++;
		    		break;
		    	}else {
		    		i++;
		    		continue;
		    	}
		    }

	    	int[][] array  = new int[i][i+1];
		    if(count == 0 || i == 1) {
		    	System.out.println("No");
		    }else {
		    	System.out.println("Yes");
		    	System.out.println(i+1);
		    	for(int j = 0; j < i; j++) {
		    		for(int k = 0; k < i+1; k++) {
		    			if( j >= k)//オリジナル
		    				array[j][k] = j + i*k - k*(k+1)/2 + 1;
		    			
		    		}
		    	}
		    	for(int j = 0; j < i; j++) {
		    		for(int k = 0; k < i+1; k++) {
		    			if( j < k)
		    				array[j][k] = array[k-1][j];
		    			
		    		}
		    	}

			    for(int k = 0; k < i+1; k++) {
			    	System.out.print(i);
			    	for(int j = 0; j < i; j++) {
			    		System.out.print(" "+ array[j][k]);
			    	}
			    	if(k < i) {
			    			System.out.print("\n");
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
