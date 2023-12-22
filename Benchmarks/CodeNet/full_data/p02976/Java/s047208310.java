import java.util.*;
public class Main {

	static boolean e(int a) {
		return a % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[M+1][2];
		int[] num = new int[N+1];
		int[] out = new int[N+1];
		for(int i = 1; i <= M; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			num[a[i][0]]++;
			num[a[i][1]]++;
			if(a[i][1] < a[i][0]) {
				int t = a[i][0];
				a[i][0] = a[i][1];
				a[i][1] = t;
			}
		}
		Arrays.sort(a, (x,y) -> x[0] == y[0] ? x[1]-y[1] : x[0]-y[0]);
		boolean[] aout = new boolean[M+1];
		for(int i = 1; i <= M; i++) {
			if(!e(out[a[i][0]]) && e(out[a[i][1]]))
				aout[i] = true;
			else if(e(out[a[i][0]]) && !e(out[a[i][1]]));
			else {
				if(e(num[a[i][0]]) && !e(num[a[i][1]]))
					aout[i] = true;
				else if(!e(num[a[i][0]]) && e(num[a[i][1]]));
				else if(num[a[i][0]] <= num[a[i][1]])
					aout[i] = true;
			}
			num[a[i][0]]--;
			num[a[i][1]]--;
			if(aout[i])
				out[a[i][0]]++;
			else
				out[a[i][1]]++;
		}
		for(int i = 1; i <= N; i++) {
			if(!e(out[i])) {
				System.out.println(-1);
				return;
			}
		}
		for(int i = 1; i <= M; i++) {
			if(aout[i])
				System.out.println(a[i][0] + " " + a[i][1]);
			else
				System.out.println(a[i][1] + " " + a[i][0]);
		}

	}

}
