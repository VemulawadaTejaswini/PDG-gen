import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int T = Integer.parseInt(ss0[1]);

		// 1行目個数、2行目以降文字列を配列に格納
		ss0 = br.readLine().trim().split(" ", 0);
		Integer[] ii0 = new Integer[N];
		for(int i = 0; i < N; i++){
			ii0[i] = Integer.parseInt(ss0[i]);
		}


		int iCount = 0;
		int iSa = 0;
		int iN = 0;
		boolean b = true;
		for(int i = 1; i < N; i++){
			//差がより大きいなら、
			if ( (ii0[i] - ii0[iN]) > iSa){
				iSa = ii0[i] - ii0[iN];
				iCount = 1;
				continue;
			}
			
			//差が同じなら、カウントを増やす
			if ( (ii0[i] - ii0[iN]) == iSa){
				if (b) {
					iCount = iCount + 1;
					b = false;
				}
				continue;
			}
			
			//最小値が小さくなったら、位置情報を変える
			if (ii0[iN] > ii0[i]) {
				iN = i;
				b = true;
				continue;
			}

		}
		
		
		System.out.println(iCount);
		
		
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}
