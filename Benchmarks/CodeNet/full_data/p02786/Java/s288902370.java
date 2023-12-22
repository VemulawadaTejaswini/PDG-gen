import java.util.Scanner;

public class Main {

	static long sum = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();

		attack(n);
		long sum2=0;
		for(int i=1; i<sum; ++i) {
			sum2+=i;
		}
		System.out.println((long)n + sum2);
	}

	public static void attack(double n) {
		++sum;
		if(n == 1) {
			return;
		}
		float devided = (float) Math.floor(n / 2);
		attack(devided);
	}

}