import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		long sum = 0;
		for (int a = 1; a <= K; a++) {
			for (int b = 1; b <= K; b++) {
				for (int c = 1; c <= K; c++){
					sum+=GCD(a,b,c);
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
}