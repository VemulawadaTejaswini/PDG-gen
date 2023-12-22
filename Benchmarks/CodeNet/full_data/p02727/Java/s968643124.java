import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Long[] p = new Long[a];
		Long[] q = new Long[b];
		Long[] r = new Long[c];

		Long[] pq = new Long[x + y];

		for(int i = 0 ; i < a ; i++) {
			p[i] = sc.nextLong();
		}
		for(int i = 0 ; i < b ; i++) {
			q[i] = sc.nextLong();
		}
		for(int i = 0 ; i < c ; i++) {
			r[i] = sc.nextLong();
		}
		Arrays.sort(p, Comparator.reverseOrder());
		Arrays.sort(q, Comparator.reverseOrder());
		Arrays.sort(r, Comparator.reverseOrder());

		long sum = 0;

		for(int i = 0 ; i < x ; i++) {
			sum += p[i];
			pq[i] = p[i];
		}
		for(int i = 0 ; i < y ; i++) {
			sum += q[i];
			pq[i + x] = q[i];
		}
		Arrays.sort(pq);

		int change = 0;
		for(int i = 0 ; i < Math.min(x + y, c) ; i++) {
			if(r[i] > pq[change]) {
				sum += r[i] - pq[change];
				change++;
			}
		}

		System.out.println(sum);
		sc.close();

	}
}

