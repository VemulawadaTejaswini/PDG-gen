import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long pow2 = 1;
		int count = 0;
		while (true) {
			if (pow2 > H) {
				break;
			}
			count++;
			pow2 *= 2;
		}
		System.out.print((long) Math.pow(2, count) - 1);
	}
}