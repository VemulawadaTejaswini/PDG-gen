import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

		// 1行目数字、2行目文字
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int max = 0;
		int n = 0;
		int j=0;
		
		for(int i = 0; i < N; i++){
			
			if (s.substring(i, i+1).equals("I")) {
				n = n + 1;
			} else {
				n = n - 1;
			}
			//System.out.println(n);
			max = (max > n) ? max : n;  //Max

		}
		


        System.out.println(max);
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