

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a+1;
		int ans = 0;
		boolean boo = false;
		while(true) {
			boo = isPrime(b);
			if(boo) {
				break;
			}
			b++;
		}
		System.out.println(b);
	}

	private static boolean isPrime(int b) {
		int c = 3;
		for(;c<b;c+=2) {
			if(b%c==0) {
				return false;
			}
		}
		return true;
	}
}
