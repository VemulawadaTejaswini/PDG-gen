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
		int C = sc.nextInt();
		long K = sc.nextLong();
		long[] T = nextLongArray(sc,N);

		sc.close();

		Arrays.sort(T);

		int ans = 0;

		int cnt = 0;
		long t=0;

		for(int i=0;i<N;i++) {
			//バスにのってるひとがいない
			if(cnt == 0) {
				t = T[i]+K;
				cnt++;
			}else {
				if(T[i] > t) {
					//T[i]が出発時刻をすぎていたら、
					ans++;//バス出発して
					cnt=1;//次のバスに乗る
					t = T[i]+K;
				}else {
					//T[i]が出発時刻をすぎていない
					//まだ乗れるなら乗る
					if(cnt < C) {
						cnt++;
					}else {
						//乗れないなら、
						ans++; //バス出発
						cnt=1; //新しいバスに乗る
						t = T[i]+K;
					}
				}
			}
		}
		//乗ってる人が残っていたら、バス出発
		if(cnt>0) {
			ans++;
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
