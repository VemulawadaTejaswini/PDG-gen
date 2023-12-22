import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		long g = scan.nextLong();
		int count = 0;
		long sum = 0;
		final int INF = Integer.MAX_VALUE / 10;
		int min = INF;
		int[] p = new int[d];
		int[] c = new int[d];
		for (int i = 0; i < d; i++) {
			p[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}
		for (int i = d-1; i >= 0; i--) {
			for (int j = 1; j <= p[i]; j++) {
				sum += (i+1)*100;
				if(j == p[i]) {
					sum+=c[i];
					}
				count++;
				if (sum >= g) {
					if (min>count) {
						min = count;
						count = 0;
						sum = 0;
						break;
					}
					sum = 0;
				}
			}
		}
		System.out.println(min);
	}
}
