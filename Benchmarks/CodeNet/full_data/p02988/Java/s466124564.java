import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		
		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
        int ans = 0;
        for (int i = 0; i < N-2; i++) {
        int l = d[i];
        int m = d[i+1];
        int r = d[i+2];        
        if(((l > m) && (m > r)) || ((l < m) && (m < r))){
          ans++;
        }
        }
		System.out.println(ans);
	}		
}
