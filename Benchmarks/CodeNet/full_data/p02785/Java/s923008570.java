import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long [] pwr = new long[n];
		
		for (int i=0;i<n; i++) {
			pwr[i] = sc.nextLong();
		}
		Arrays.sort(pwr);

		// pwr の高い法からk回必殺攻撃
		int rest = n-k;
		long regAttacks = 0;
		for (int i=0; i<rest;i++) {
			regAttacks+=pwr[i];
		}
		
		log(regAttacks);
		sc.close();
	}

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	static void log(long i) {
		System.out.println(i);
	}

	static void log(double d) {
		System.out.printf("%.12f\n",d);
	}
	
}
