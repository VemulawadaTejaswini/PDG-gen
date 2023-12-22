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
		
		long tmp[] = new long[X*Y];
 
		int cnt = 0;
		for(int i=0;i<X;i++) {
			for(int j=0;j<Y;j++) {
					tmp[cnt]=A[i]+B[j];
					cnt++;
			}
		}
		rsort(tmp);
		
		long ans[] = new long[Math.min(K,X*Y)*Z]; 
		int cnt2 = 0;
		for(int i=0;i<Math.min(K,X*Y);i++) {
			for(int j=0;j<Z;j++) {
					ans[cnt2]=tmp[i]+C[j];
					cnt2++;
			}
		}
		
		
		rsort(ans);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<K;i++) {
			sb.append(ans[i]+"\n");
		}
		System.out.println(sb.toString());
	}

	//long型を逆順にソートするメソッド
	static void rsort(long[] a) {
		Arrays.sort(a);
		int len = a.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = a[i];
			a[i] = a[len - 1 - i];
			a[len - 1 - i] = tmp;
		}
	}
}
