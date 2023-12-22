import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int L = sc.nextInt();
		
		sc.close();

		int truePi = (N*(1+N))/2  -N + N*L;
		
		int minMi = Integer.MAX_VALUE;
		int x = -1;
		for(int i=1;i<=N;i++) {
			int mi = L+i-1;
			if(minMi > Math.abs(mi)) {
				minMi = Math.abs(mi);
				x = i;
			}
		}
		
		out.println(truePi - (L+x-1));
		
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
	
	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
