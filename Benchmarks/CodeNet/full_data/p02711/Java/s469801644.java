

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
		
		if(n%10==7 || (n/10)%10==7 || n/100==7) 
			System.out.println("Yes");
		else
		 	System.out.println("No");
		
		/*
		 * if(f)
		 *	System.out.println("Yes");
		 * else
		 * 	System.out.println("No");
		 */
	}
}
