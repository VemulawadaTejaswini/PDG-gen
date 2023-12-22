import java.util.Scanner;

/**
 * https://abc076.contest.atcoder.jp/tasks/abc076_c
 */
public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] t = new double[N];
		double[] v = new double[N];
		for(int i=0; i<N; i++) t[i] = sc.nextDouble();
		for(int i=0; i<N; i++) v[i] = sc.nextDouble();
		sc.close();
	
		v[N-1] = Math.min(v[N-1],t[N-1]);
		for(int i=N-2; i>=0; i--){
			v[i] = Math.min(v[i], v[i+1]+t[i]);
		}
		
		double ans = 0;
		double current = 0;
		for(int i=0; i<N; i++){
			double next = i==N-1 ? 0 : Math.min(v[i+1], v[i]);
			double maxT = (t[i]+next-current)/2.0;
			double ut = Math.max(0, Math.min(maxT, v[i]-current));
			double maxV = current+ut;
			double et = Math.max(0, maxV-next);
			double mt = Math.max(0, t[i]-ut-et);
			ans += (current*ut)+((maxV-current)*ut/2.0);
			ans += maxV*mt;
			ans += (next*et)+((maxV-next)*et/2.0);
			current = Math.min(maxV, next);
		}
		System.out.println(ans);
	}

}