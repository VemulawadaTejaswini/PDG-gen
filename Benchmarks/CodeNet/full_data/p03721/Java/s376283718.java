import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] arrayInfo = new long[100000 + 1];
		for(int i =0; i < n; i++) {
			int a = sc.nextInt();
			long b = sc.nextLong();
			arrayInfo[a] += b;
		}
		for(int i = 1; i <= 100000;i++) {
			k -= arrayInfo[i];
			if(k <= 0) {
				System.out.println(i);
				return;
			}
		}
	}
}