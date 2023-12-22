import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String[] str2 = reader.readLine().split(" ");
		long[] A = new long[N];
		//ArrayList <Integer> list = new ArrayList <Integer>();
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(str2[i]);
			//list.add(A[i]);
		}
		Arrays.sort(A);  //小さい順
		for (int i = 0; i < M; i++) {
			line = reader.readLine();
			String[] BC = line.split(" ");
			int B = Integer.parseInt(BC[0]);
			long C = Long.parseLong(BC[1]);
			for (int k = 0; k < B; k++) {
				if (A[k] < C) {
				    A[k] = C;
				}
			}
			Arrays.sort(A);
		}
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += A[i];
		}
		System.out.println(ans);
	}
}