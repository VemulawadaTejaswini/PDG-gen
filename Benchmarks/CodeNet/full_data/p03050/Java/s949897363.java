import java.util.Scanner;
 
public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		in.close();
		
		/*
		long testSum = 0;
		for (long i=1; i<=N; i++) {
			if (N / i == N % i) {
				testSum += i;
				//System.out.println("m = " + i + " : N mod m = " + (N%i));
			}
		}
		System.out.println("testSum = " + testSum);
		*/
		long sum = 0;
		// x is N mod m
		for (long x=1; x<Math.ceil(Math.sqrt(N)); x++) {
			if ((N-x) % x == 0) {
				sum += ((N-x) / x);
			}
		}
		System.out.println(sum);
	
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
