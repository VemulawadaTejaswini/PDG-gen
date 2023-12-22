import java.util.Scanner;

/**
 * https://abc058.contest.atcoder.jp/tasks/arc071_b
 */
public class Main {

	static final int MOD = 1000000007;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] x = new long[N];
		long[] y = new long[M];
		for(int i=0; i<N; i++) x[i] = Long.parseLong(sc.next());
		for(int i=0; i<M; i++) y[i] = Long.parseLong(sc.next());
		sc.close();
		
		
		long ans = ((((x[N-1]-x[0])*(y[M-1]-y[0])%MOD)*(N-1))%MOD*(M-1))%MOD;
		int xs = 1;
		int ys = 1;
		while(true){
			int xe = N-xs-1;
			int ye = M-ys-1;
			if(ys>=ye && xs>=xe) break;
			//System.out.println("======================");
			//System.out.println(xs+":"+xe);
			//System.out.println(ys+":"+ye);
			//System.out.println("---------");
			if(xs<xe){
				long v = ((N-xs*2-1)*(M-(ys-1)*2-1))%MOD;
				long area = ((x[xe]-x[xs])*(y[ye+1]-y[ys-1]))%MOD;
				// System.out.println(v);
				// System.out.println(area);
				ans = (ans+area*v%MOD)%MOD;
			}
			//System.out.println("---------");
			if(ys<ye){
				long v = ((N-(xs-1)*2-1)*(M-ys*2-1))%MOD;
				long area = ((x[xe+1]-x[xs-1])*(y[ye]-y[ys]))%MOD;
				// System.out.println(v);
				// System.out.println(area);
				ans = (ans+area*v%MOD)%MOD;
			}
			//System.out.println("---------");
			if(xs<xe && ys<ye){
				long v = ((N-xs*2-1)*(M-ys*2-1))%MOD;
				long area = ((x[xe]-x[xs])*(y[ye]-y[ys]))%MOD;
				// System.out.println(v);
				// System.out.println(area);
				ans = (ans+area*v%MOD)%MOD;
			}
			if(xs<xe) xs++;
			if(ys<ye) ys++;
		}
	
		System.out.println(ans);

	}

}