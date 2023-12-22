
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.nextLine());
			// https://atcoder.jp/contests/abc125/submissions/5147323の9行目
			int[] A = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();
			
			int[] preGCD = new int[N+1]; // 前からGCDを計算した結果
			for (int i = 0; i < N; i++) {
				preGCD[i + 1] = gcd(preGCD[i], A[i]); 
//				System.out.println("preGCD [" + i + "] = " + preGCD[i] + ", A[" + i + "] = " + A[i]);
//				System.out.println("preGCD [" + (i+1) + "] = " + preGCD[i+1] );
//				System.out.println("");
			}
			
			int[] postGCD = new int[N+1]; // 後ろからGCDを計算した結果
			for (int i = N -1;  0 <= i; i--) {
				postGCD[i] = gcd(postGCD[i + 1], A[i]); 
//				System.out.println("postGCD [" + (i+1) + "] = " + postGCD[i+1] + ", A[" + i + "] = " + A[i]);
//				System.out.println("postGCD [" + (i) + "] = " + postGCD[i] );
//				System.out.println("");
			}
			
			int maxGcd = 1;
			for (int i = 0; i < N; i++) {
				// 無視する場所の”1 ~ i-1まで”の公約数と"i+1 ~ N"までの公約数の公約数を求めれば、OK
				maxGcd = Math.max(gcd(preGCD[i], postGCD[i+1]), maxGcd);
			}
			
			System.out.println(maxGcd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
		
}
