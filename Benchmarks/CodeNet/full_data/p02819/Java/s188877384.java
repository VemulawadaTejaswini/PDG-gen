import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] isPrime = new boolean[1000000];
		Arrays.fill(isPrime, true);
		for(int i = 2; i < isPrime.length; i++) {
			if(isPrime[i]) {
				for(int j = 2 * i; j < isPrime.length; j += i) isPrime[j] = false;
			}
		}
		int X = sc.nextInt();
		for(int i = X; i < isPrime.length; i++) {
			if(isPrime[i]) {
				System.out.println(i);
				break;
			}
		}
	}
}