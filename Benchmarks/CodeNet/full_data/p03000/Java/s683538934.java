import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] d = new int[N];
        int ans = 0;
		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
          if(i+d[i] <= X){
            ans++;
          }
		}
		System.out.println(ans);
	}		
}
