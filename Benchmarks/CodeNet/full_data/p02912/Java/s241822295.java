import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		//時間短縮
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String[] line = reader.readLine().split(" ");
		int[] A = new int[N];
		double[] Alog = new double[N];
		double Alog_sum = 0.0;

		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(line[i]);
			Alog[i] = Math.log(A[i]);
			Alog_sum += Alog[i];
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int maisuu = (int) Math.round(M * Alog[i] / Alog_sum);
			ans += (int) Math.floor(A[i] / Math.pow(2, maisuu));
		}
		
		System.out.println(ans);
	}
	
	
	//	//全通り調べるやり方(タイムオーバーは自明)
	//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//			String[] str = reader.readLine().split(" ");
	//			int N = Integer.parseInt(str[0]);
	//			int M = Integer.parseInt(str[1]);
	//			String[] line = reader.readLine().split(" ");
	//			int[] A = new int[N];
	//
	//			for (int i = 0; i < N; i++) {
	//				A[i] = Integer.parseInt(line[i]);
	//			}
	//
	//			int min = Integer.MAX_VALUE;
	//			for (int i = 0; i < M; i++) {
	//				for (int j = 0; j < M - i; j++) {
	//					for (int k = 0; k < M - i - j; k++) {
	//						int l = M - i - j - k;
	//						int keep = (int)Math.floor(A[0] / Math.pow(2, i)) + (int)Math.floor(A[1] / Math.pow(2, j)) + (int)Math.floor(A[2] / Math.pow(2, k)) + (int)Math.floor(A[3] / Math.pow(2, l));
	//						if (keep < min) {
	//							min = keep;
	//							System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", l=" + l + ", keep=" + keep);   //////////////////
	//						}
	//					}
	//				}
	//			}
	//			System.out.println(min);
	//		}
}
