import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行目個数、2行目の複数の数字を配列に格納
		//   3
		//   1 2 3
		int N = Integer.parseInt(br.readLine());
		String[] ss0 = br.readLine().trim().split(" ", 0);
		Integer[] ii0 = new Integer[N];
		for(int i = 0; i < N; i++){
			ii0[i] = Integer.parseInt(ss0[i]);
		}
		
		//dp(N);
					//入力値確認
					for(int i=0; i < N; i++){
						//dp(ii0[i]);
					}

		long l = 1;
		int outHikisu = 0;
		for(int i = 0; i < N; i++){
			dp(i*2+1 + " > " + ii0[i]);
			
			if ( ((i-outHikisu)*2+1) > ii0[i] ) {
				//アウト
				l = (l * (i+1 - outHikisu)) % 1000000007;
				outHikisu += 1;
				dp("Out " + l + ", outHikisu " + outHikisu);
			} else {
			}
		}
		
		
			dp("--------");
		dp("l=" + l);
		dp("N=" + N);
		dp("outHikisu=" + outHikisu);
		dp("(N - outHikisu)=" + (N - outHikisu));
		for(int i = (N - outHikisu); i > 0; i--){
			l = l * i  % 1000000007;
		}


        System.out.println(l);
        return;
    }
    // Debug.Print
    static void dp(String s) {
		//System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}
