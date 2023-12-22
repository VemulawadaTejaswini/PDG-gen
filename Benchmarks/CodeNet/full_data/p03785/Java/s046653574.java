import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.valueOf(in.nextInt()); // Number of passengers
		long C = Long.valueOf(in.nextLong()); // Size of bus
		long K = Long.valueOf(in.nextLong()); // Max wait time
		long[] T = new long[N]; // Arrival timings
		for (int x = 0; x < N; x++) {
			T[x] = in.nextLong();
		}
		int Ti = 0; // Current passenger
		int buses = 1;
		while (Ti != N){
			// UpperBound = T + K
			for (int x = Ti; x <= Ti + C; x++) {
				if (x == Ti + C || T[x] > T[Ti] + K) {
					buses++;
					Ti = x;
					break;
				}
			}
		}
		System.out.println(buses);
	}
}