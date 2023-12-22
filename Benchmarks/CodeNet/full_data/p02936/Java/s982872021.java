import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = bf.readLine().split(" ");
		int N = Integer.parseInt(s1[0]);
		int Q = Integer.parseInt(s1[1]);
		int[] ary = new int[N];
		for(int i = 0;i< N-1;i++) {
			String[] s2 = bf.readLine().split(" ");
			int a = Integer.parseInt(s2[0]);
			int b = Integer.parseInt(s2[1]);
			ary[b-1] = a-1;
		}

		long[] cnt = new long[N];
		Arrays.fill(cnt, 0);
		for(int i = 0;i< Q;i++) {
			String[] s3 = bf.readLine().split(" ");
			int p = Integer.parseInt(s3[0]);
			int x = Integer.parseInt(s3[1]);
			cnt[p-1] += x;
		}
		bf.close();

		for(int i = 1;i < N;i++) {
			cnt[i] += cnt[ary[i]];
		}
		for(int i = 0;i < N-1;i++) {
			System.out.print(cnt[i] + " ");
		}
		System.out.print(cnt[N-1]);
	}
}