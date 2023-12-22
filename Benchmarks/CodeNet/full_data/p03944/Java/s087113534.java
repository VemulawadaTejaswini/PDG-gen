import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int W = Integer.parseInt(ss0[0]);
		int H = Integer.parseInt(ss0[1]);
		int N = Integer.parseInt(ss0[2]);


		int WMin = 0;
		int WMax = W;
		int HMin = 0;
		int HMax = H;

		for(int i=0; i<N; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			int x = Integer.parseInt(ss0[0]);
			int y = Integer.parseInt(ss0[1]);
			int a = Integer.parseInt(ss0[2]);
			
			
			if(a==1){ WMin = WMin > x ? WMin : x; }
			if(a==2){ WMax = WMax > x ? x : WMax; }
			if(a==3){ HMin = HMin > y ? HMin : y; }
			if(a==4){ HMax = HMax > y ? y : HMax; }
		}
		
		W = WMax - WMin;
		W = W > 0 ? W : 0;
		
		H = HMax - HMin;
		H = H > 0 ? H : 0;
		
		
		System.out.println(W * H);
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}
