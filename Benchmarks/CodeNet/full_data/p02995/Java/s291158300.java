import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		int lcm = lcm(C,D);
//		System.out.println(lcm);
		int countA = 0;
		int countB = 0;
		int countlcm = 0;
		int count = 0;
		
		for (int i = A; i <= B; i++) {
			if(i % C == 0) {
//				System.out.println(i + "は2で割り切れる");
				countA += 1;
			}
			if(i % D == 0) {
//				System.out.println(i + "は3で割り切れる");
				countB += 1;
			}
			if(i % lcm == 0) {
				countlcm += 1;
			}
		}
//		System.out.println(countA);
//		System.out.println(countB);
//		System.out.println(countlcm);
		count = B - A + 1 - countA - countB + countlcm;
		System.out.println(count);
	}
	
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	
	private static int lcm(int m, int n) {
	    return m * n / gcd(m, n);
	}
		
}