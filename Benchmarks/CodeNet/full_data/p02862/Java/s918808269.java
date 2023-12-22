
public class Main {
	public static void main(String args[]) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();

		long mod = 1000000007;

		long tmp = (X + Y) / 3;

		long result = 1;
		for (int i = 1; i <= tmp; i++) {
			result = (result * i % mod);
		}
		System.out.println(result % mod);
	}
}
