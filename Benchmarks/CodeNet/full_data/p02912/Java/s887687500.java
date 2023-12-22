import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int [] cost = new int [N];

		for (int index=0; index<N; index++) {
			cost[index]=sc.nextInt();
		}
		for (int index=0; index<M; index++) {
			Arrays.sort(cost);
			cost[N-1]=cost[N-1]/2;
		}
		long total = 0;
		for (int index=0; index<N; index++) {
			total+=cost[index];
		}
		System.out.println(total);
	}
}