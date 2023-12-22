import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		long sum = 0;
		for (int i = 1; i <= K; i++) {
			sum+=i;
		}
		for (int a = 1; a <= K; a++) {
			for (int b = a+1; b <= K&& b!=a; b++) {
				sum+=GCD(a,b,b)*3;
				sum+=GCD(a,a,b)*3;
				for (int c = b+1; c <= K && c!=a&&c!=b; c++){
					sum+=GCD(a,b,c)*6;
				} 
			}
		}
		System.out.println(sum);
	}
	public static long GCD(int a, int b, int c) {
		long max = 1;
		int min = Math.min(Math.min(a, b),c);
		for (long i = 2; i <= min; i++) {
			if (a%i==0&&b%i==0&&c%i==0) max=i;
		} 
		return max;
	}
	public static boolean Prime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) return false;
		}
		return true;
	}
}