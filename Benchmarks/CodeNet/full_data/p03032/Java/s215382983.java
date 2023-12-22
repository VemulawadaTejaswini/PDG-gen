import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int[] v = new int[n];
		int minus = 0;
		int total = 0;
		for ( int i = 0; i < n; i++ ) {
			v[i] = in.nextInt();
			if(v[i] < 0) minus++;
			else total += v[i];
		}
		
		if(n + minus <= k) {
			System.out.println(total);
			return;
		}

		in.close();

	}
}
