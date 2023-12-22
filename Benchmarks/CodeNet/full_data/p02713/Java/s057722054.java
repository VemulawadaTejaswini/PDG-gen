import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sum = new int[201];
		sum[1] = 1;
		for (int i = 2; i <= n; i++) {
			sum[i]+= sum[i-1];
			for (int j = 1; j <= i ; j++) {
				for (int k = 1; k <= i ; k++) {
					for (int l = 1; l <= i; l++) {
						if (j == i || k == i || l ==i) {
							sum[i] += gcd(j,k,l);
						}
					}
				}
			}
		}
		System.out.println(sum[n]);
	}

	private static int gcd(int a, int b) {
//		      辗转相减法
      while(a!=b) {
          if(a>b) {
              a=a-b;
          }else {
              b=b-a;
          }
      }
      return b;
	}


	private static int gcd(int a, int b, int c) {
		int gcd1 = gcd(a,b);
		return gcd(gcd1, c);
	}
}
