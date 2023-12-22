import java.util.*;
public class Main {
	public static long mod;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ab[][] = new int[N][2];
		for(int i=0;i<N;i++) {
			ab[i][0] = sc.nextInt();//A
			ab[i][1] = sc.nextInt();//B
		}
		sc.close();
		int v[] = new int[M];
		Arrays.sort(ab,(t1,t2)->t2[1]-t1[1]);//Bについて降順にソート
		
		for(int i=0;i<N;i++) {
			int ta = ab[i][0];
			int tb = ab[i][1];
			int cnt = 0;
			for(int j=ta-1;j<M;j++) {
				if(v[j]==0) {
					v[j]=tb;
					cnt++;
					break;
				}
				if(cnt==M)break;
			}
		}
		long ans = 0;
		for(int tv :v) {
			ans += tv;
		}
		System.out.println(ans);
	}
}