import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong(), n = 5l;
		Double Cap = 1e15;
		for (int i = 0; i < n; i++){
			Double cap = s.nextDouble();
			if (Cap > cap) Cap = cap;
		}
		long t = (long)Math.ceil(N / Cap);
		System.out.println(t + n - 1l);
		/*
		5 3 2 4 3 5 -> 7
		10 123 123 123 123 123 -> 5
		10000000007 2 3 5 7 11 -> 5000000008
		*/
	}
}
