package atcoder.beg50;

import java.util.Scanner;

public class A050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String op = sc.next();
		String b = sc.next();
		sc.close();
		if (op.equals("+")) {
			System.out.println(Integer.valueOf(a) + Integer.valueOf(b));; 
		} else {
			System.out.println(Integer.valueOf(a) - Integer.valueOf(b));; 
		}
	}

}
