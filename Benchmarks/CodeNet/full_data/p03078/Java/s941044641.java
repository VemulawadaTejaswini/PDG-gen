//ABの全探索->結果の絞り込み->結果とCの全探索の解法
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[X];
		long B[] = new long[Y];
		long C[] = new long[Z];
		for(int i=0;i<X;i++)A[i]=sc.nextLong();
		for(int i=0;i<Y;i++)B[i]=sc.nextLong();
		for(int i=0;i<Z;i++)C[i]=sc.nextLong();
		sc.close();
		
		Long tmp[] = new Long[X*Y];

		int cnt = 0;
		for(int i=0;i<X;i++) {
			for(int j=0;j<Y;j++) {
					tmp[cnt]=A[i]+B[j];
					cnt++;
			}
		}
		Arrays.sort(tmp,(a1,a2)->Long.compare(a2, a1));
		
		Long tmpK[] = Arrays.copyOfRange(tmp, 0, Math.min(K,X*Y));
		
		Long ans[] = new Long[tmpK.length*Z]; 
		int cnt2 = 0;
		for(int i=0;i<tmpK.length;i++) {
			for(int j=0;j<Z;j++) {
					ans[cnt2]=tmpK[i]+C[j];
					cnt2++;
			}
		}
		
		
		Arrays.sort(ans, (a1,a2)->Long.compare(a2,a1));
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<K;i++) {
			sb.append(ans[i]+"\n");
		}
		System.out.println(sb.toString());
	}
}
