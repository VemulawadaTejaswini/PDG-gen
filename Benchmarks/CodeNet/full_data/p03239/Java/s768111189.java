import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();

		int[] cn = new int[n];
		int[] tn = new int[n];

		int minCost = 1001;

		for (int i=0; i<n; i++) {
			cn[i] = sc.nextInt();
			tn[i] = sc.nextInt();

			if (tn[i] <= t) {
				if (cn[i] < minCost) {
					minCost = cn[i];
				}
			}
		}

		if (minCost == 1001) {
			System.out.println("TLE");
		} else {
			System.out.println(minCost);
		}

		sc.close();
	}

}