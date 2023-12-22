

import java.util.*;

public class Main {
	static boolean f;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 入力の受け取り
		 * String s = sc.next();
		 * int a = sc.nextInt();
		 * long a = sc.nextLong();
		 */
		
		// 文字列(String)を文字(char)に分解
		// char[] s_char = s.toCharArray();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		int sum_a = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			sum_a += a[i];
		}
		
		int p;
		if(sum_a%(4*m) == 0)
			p = sum_a/(4*m);
		else
			p = sum_a/(4*m)+1;
		
		int tmp_m = 0;
		for(int i=0;i<n;i++) {
			if(a[i] >= p)
				tmp_m++;
			if(tmp_m >= m) {
				f = true;
				break;
			}
		}

		if(f)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
