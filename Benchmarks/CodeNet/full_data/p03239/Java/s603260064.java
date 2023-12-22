import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int minCost = 1001;

		int N = sc.nextInt();
		int T = sc.nextInt();

		int c;int t;
		for (int i=0;i<N;i++) {
			c = sc.nextInt();
			t = sc.nextInt();
			if (t<=T) {
				if (c<=minCost) {
					minCost = c;
				}
			}
		}

		if (minCost==1001) {
			System.out.println("TLE");
		} else {
			System.out.println(minCost);
		}

	}
}