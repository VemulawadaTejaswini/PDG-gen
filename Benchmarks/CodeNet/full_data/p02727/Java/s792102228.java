import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		long sum = 0;
		int[] p = new int[A + 1];
		for (int i = 0; i < A; i++) {
			p[i] = sc.nextInt();
			sum = sum + p[i];
		}
		p[A] = Integer.MAX_VALUE;
		Arrays.sort(p);
		int[] q = new int[B + 1];
		for (int i = 0; i < B; i++) {
			q[i] = sc.nextInt();
			sum = sum + q[i];
		}
		q[B] = Integer.MAX_VALUE;
		Arrays.sort(q);
		int[] r = new int[C + 1];
		for (int i = 0; i < C; i++) {
			r[i] = sc.nextInt();
			sum = sum + r[i];
		}
		r[C] = Integer.MAX_VALUE;
		Arrays.sort(r);
		sc.close();

		int cura = 0;
		int curb = 0;
		int curc = 0;
		long sumd = 0;
		int dis = A + B + C - X - Y;
		while ( cura + curb + curc < dis ) {
			int rem = C - curc;
			if ( X < A - cura + rem && p[cura] <= q[curb] && p[cura] <= r[curc] ) {
				sumd = sumd + p[cura];
				cura++;
			} else if ( Y < B - curb + rem && q[curb] <= r[curc] ) {
				sumd = sumd + q[curb];
				curb++;
			} else {
				sumd = sumd + r[curc];
				curc++;
			}
		}
		long ans = sum - sumd;
		System.out.println(ans);
	}
}
