import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int k=0;k<N;k++) {
			A[k] = sc.nextInt();
		}
		for(int k=0;k<N;k++) {
			B[k] = sc.nextInt();
		}
		int ans=0;
		for(int k=0;k<N;k++) {
			for(int l=0;l<N;l++) {
				ans ^= (A[l]+B[k]);
			}
		}
		
		
		// 出力
		System.out.println(ans);
		sc.close();
	}
}
