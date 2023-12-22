import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if (M<=2*N) {
			System.out.println(M/2);
		} else if (M>2*N) {
			long sum = N;
			long temp = M - 2*N;
			sum +=temp/4;
			System.out.println(sum);
		}
	}
}