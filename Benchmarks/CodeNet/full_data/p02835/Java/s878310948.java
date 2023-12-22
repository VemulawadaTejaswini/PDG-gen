import java.util.Scanner;

class Main {
	static int mod = 1000000007;
	private static long[] fact;
	private static long[] inv_fact;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = a + b+ c;

		if(sum>=22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}

	}

}