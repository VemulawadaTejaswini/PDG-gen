import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] D = nextIntArray(sc,N);
		int M = sc.nextInt();
		int[] T = nextIntArray(sc,M);
		
		sc.close();

		Arrays.sort(D);
		Arrays.sort(T);
		
		for(int i=0,j=0;i<M;i++) {
			while(T[i] > D[j]) {
				j++;
			}
			
			if(T[i] == D[j]) {
				j++;
				continue;
			}else {
				out.println("NO");
				return;
			}
		}
		out.println("YES");
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
	
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
