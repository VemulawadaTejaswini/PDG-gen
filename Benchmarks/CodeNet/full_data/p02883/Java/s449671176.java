
import java.util.*;

public class Main {
		public static int N;
		public static long K;
		public static int A[];
		public static Integer F[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextLong();// 修行回数
		A = new int[N];// 消化コスト
		F = new Integer[N];// 食べにくさ
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			F[i] = sc.nextInt();
		}
		// 消化コストが高い人と、食べにくさが低い食べ物をマッチングする。
		Arrays.sort(A);
		Arrays.sort(F, Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			F[i]=F[i].intValue();
		}	//降順に並び替えるための手順
		
		//N個の組み合わせについて、それらの最大値がXを下回るようにする。
		//二分探索します。
		//調べたい範囲の一番左以下と、一番右以上の何かをleftとrightで定義する。
		long l = -1; long r = (long)Math.pow(10,12);
		while(l+1<r) {
			long c = l+(r-l)/2;//これがオーバーフローしないための書き方
			if(func(c)==true) r=c; else l=c;//if文を１行で書く	
		}
		System.out.println(r);
	}
	static boolean func(long c) {
		long sum=0;
		for(int i=0;i<N;i++) {
			sum += Math.max(A[i]-c/F[i],0);
		}
		return sum<=K;
	}
}