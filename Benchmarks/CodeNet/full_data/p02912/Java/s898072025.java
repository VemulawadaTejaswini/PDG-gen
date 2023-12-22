import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final int M = sc.nextInt();

		final int[] A = new int[N];

		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for(int i=0;i<N/2;i++) {
			int tmp = A[i];
			A[i] = A[N-i-1];
			A[N-i-1] = tmp;
		}
		int m = M;
		int i = 0;
		while(true) {
			A[i] = A[i] / 2;
			m--;
			if(m == 0) {
				break;
			}
			if((i+1)!=N && A[i] >= A[i+1]) {
				// 最大値が変わらないなら、まだ割り引ける。
				continue;
			}
			// 最大値が小さくなって2番目のほうが大きくなったら再ソートして、最初から。
			Arrays.sort(A);
			for(int j=0;j<N/2;j++) {
				int tmp = A[j];
				A[j] = A[N-j-1];
				A[N-j-1] = tmp;
			}
			i=0;
		}
		long sum = 0;
		for(int x=0;x<N;x++) {
			sum += A[x];
		}
		out.println(sum);
	}

}
