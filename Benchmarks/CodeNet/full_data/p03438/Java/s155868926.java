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
		long[] a = nextLongArray(sc,N);
		long[] b = nextLongArray(sc,N);
		sc.close();

		Arrays.sort(a);
		Arrays.sort(b);

		String ans ="Yes";
		for(int i=0;i<N-1;i++) {
			if(a[i] == b[i]) {
				//nop
			}else if(a[i] > b[i]) {
				ans = "No";
				break;
			}else if( (b[i]-a[i]) %2 == 1 ) {
				//差が奇数の場合
				//a[i]とb[i]をそれぞれ+2, +1する
				b[i] += 1;
				a[i] += 2;

				long n = b[i]-a[i];
				a[i] = b[i]; //a[i]をb[i]になるまで+2する
				a[N-1] += n/2; //aを+2した回数だけbの最後の値を+1する

			}else {
				//差が偶数の場合
				long n = b[i]-a[i];
				a[i] = b[i]; //a[i]をb[i]になるまで+2する
				a[N-1] += n/2; //aを+2した回数だけbの最後の値を+1する
			}
		}

		//最後の値が、aのほうがおおきければ、一致させられない
		if(a[N-1] > b[N-1]) {
			ans = "No";
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}
}
