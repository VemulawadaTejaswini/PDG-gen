//C
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long[] P = new long[5];

		long[] Q = new long[5];

		long q = 0;

		long ans = 5;

		for(int i=0;i<5;i++) {

			P[i] = sc.nextLong();

			q = N/P[i];

			if(q!=0) q++;

			Q[i] = q;

		}
		for(int i=0;i<4;i++) {

			if(Q[i+1]>Q[i]) {

				ans += (Q[i+1]-Q[i]);
			}
		}

		if(Q[0]>1) ans += (Q[0]-1);

		System.out.println(ans);
	}

}
