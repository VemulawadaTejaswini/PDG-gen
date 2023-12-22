//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int M = Integer.parseInt(ss0[1]);

		// 1行目個数、2行目以降文字列を配列に格納
		Integer[] a = new Integer[N];
		Integer[] b = new Integer[N];
		Integer[] ans = new Integer[N];
		for(int i = 0; i < N; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			a[i] = Integer.parseInt(ss0[0]);
			b[i] = Integer.parseInt(ss0[1]);
		}

		Integer[] c = new Integer[M];
		Integer[] d = new Integer[M];
		for(int i = 0; i < M; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			c[i] = Integer.parseInt(ss0[0]);
			d[i] = Integer.parseInt(ss0[1]);
		}

		int m = 0;  //マンハッタン距離を保持
		int min = 0;  //最小のマンハッタン距離
		for(int i = 0; i < N; i++){
			min = Integer.MAX_VALUE;
			for(int j = 0; j < M; j++){
				m = Math.abs(a[i]-c[j]) + Math.abs(b[i]-d[j]);
				if (Math.abs(min) > Math.abs(m)) {
					ans[i] = j+1;
					min = m;
				}
			}
		}

		//
		for(int i = 0; i < N; i++){
			System.out.println(ans[i]);
		}

		return;
    }

}

//-----------------------------------------------------------
//-----------------------------------------------------------

