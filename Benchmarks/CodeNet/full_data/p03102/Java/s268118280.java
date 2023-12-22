import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.abc121B();
	}
}

class Calc {
	void abc121B() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0,count = 0;
		int[] b = new int[m];
		for(int i=0 ; i < m ; i++) {
			b[i] = sc.nextInt();
		}
		int[][] code = new int[n][m];
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				code[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				sum += b[j] * code[i][j];
			}
			if(sum+c >0) {
				count ++;
			}
          sum = 0;
		}
		System.out.println(count);
	}
}