
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] d = new int[N];
		// 初期化
		for (int i = 0; i < N; i++) {
			d[i] = Integer.parseInt(br.readLine());
		}

		// バケット( 100 < bで)
		int[] b = new int[110];
		int count = 0;
		for (int i = 0; i < N; i++) {
			// バケットを１で埋める
			b[d[i]]++;
		}

		for (int i = 1; i <= 100;i++) {
			if (b[i] != 0) {
				count++;
			}
		}

		System.out.println(count);
	}

}
