
// int型のオーバーフローに注意
// 文字列の比較は==ではなく.equalsを使おう
// Stringの入力はnext();が丸い

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int c11 = sc.nextInt();
		    int c12 = sc.nextInt();
		    int c13 = sc.nextInt();
		    int c21 = sc.nextInt();
		    int c22 = sc.nextInt();
		    int c23 = sc.nextInt();
		    int c31 = sc.nextInt();
		    int c32 = sc.nextInt();
		    int c33 = sc.nextInt();
		    int count = 0;
		    
		    if(c12 - c11== c22 - c21 && c22 - c21 == c32 - c31) {
		    	if(c13 - c12== c23 - c22 && c23 - c22 == c33 - c32) {
		    		if(c11 - c13== c21 - c23 && c21 - c23 == c31 - c33) {
		    			if(c21 -c11 == c22 -c12 && c22 - c12 == c23 - c13) {
		    				if(c31 -c21 == c32 -c22 && c32 - c22 == c33 - c23) {
		    					if(c11 -c31 == c12 -c32 && c12 - c32 == c13 - c33) {
				    				
				    			}
			    			}else {
			    				count++;
			    			}
		    			}else {
		    				count++;
		    			}
			    	}else {
			    		count++;
			    	}
		    	}else {
		    		count++;
		    	}
		    }else {
		    	count++;
		    }
		    if(count != 0) {
		    	System.out.println("No");
		    }else {
		    	System.out.println("Yes");
		    }
		    
		    sc.close(); }

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
