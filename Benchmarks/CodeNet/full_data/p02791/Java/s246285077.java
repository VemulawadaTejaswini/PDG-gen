public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int min = p[0];

		for (int i = 0; i < n; i++) {
			for (int ii = 0; ii <= i; ii++) {
				if(min < p[i]) {
					break;
				}
				
				if (min > p[ii]) {
					min = p[ii];
				}

				if (ii == i && min == p[i]) {
					sum++;
				}

			}
		}

		System.out.println(sum);

	}
}
