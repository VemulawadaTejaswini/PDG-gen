

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count1 = 0;
		while (s.charAt(count1)=='1')
			count1++;
		long k = sc.nextLong();
		if (k<=count1) System.out.println(1);
		else System.out.println(s.charAt(count1));
	}
}
