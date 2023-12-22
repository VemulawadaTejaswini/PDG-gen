import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int A = Integer.parseInt(ss0[1]);
		int B = Integer.parseInt(ss0[2]);
		//
		String[] X = br.readLine().trim().split(" ", 0);

		int sa = 0;
		float h = 0;
		for(int i = 0; (i+1) < N; i++){
			sa = Integer.parseInt(X[i+1]) - Integer.parseInt(X[i]);
			
			if ( (float)(sa * A) <= (float)B ){
				h = h + (sa * A);
			}else{
				h = h + B;
			}
		}


		


        System.out.println((int)h);
        return;
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}