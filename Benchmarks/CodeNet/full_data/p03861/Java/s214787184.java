

import java.util.Scanner;

public class Main {
	public static void Main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		int c = 1;
		if (a == 0 && b== 0) {
			System.out.println(1);	
		} else if(a !=0) {
			System.out.println(b / x - a / x + 1);
		} else {
			c = b / x + 1;
			System.out.println(c);	
		}
	}
}
