import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cntEven = 0;
		int cntOdd = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 2 == 0) {
				cntEven++;
			} else {
				cntOdd++;
			}
		}

		int ans = (int) (Math.pow(3, n) - Math.pow(2, cntEven));

		System.out.print(ans);
	}

}
