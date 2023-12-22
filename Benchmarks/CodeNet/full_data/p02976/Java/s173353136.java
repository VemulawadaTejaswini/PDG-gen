import java.util.*;
public class Main {

	static boolean e(int a) {
		return a % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M+1];
		int[] b = new int[M+1];
		int[] num = new int[N+1];
		int[] out = new int[N+1];
		for(int i = 1; i <= M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			num[a[i]]++;
			num[b[i]]++;
		}
		boolean[] aout = new boolean[M+1];
		for(int i = 1; i <= M; i++) {
			if(!e(out[a[i]]) && e(out[b[i]]))
				aout[i] = true;
			else if(e(out[a[i]]) && !e(out[b[i]]));
			else {
				if(e(num[a[i]]) && !e(num[b[i]]))
					aout[i] = true;
				else if(!e(num[a[i]]) && e(num[b[i]]));
				else if(num[a[i]] <= num[b[i]])
					aout[i] = true;
			}
			num[a[i]]--;
			num[b[i]]--;
			if(aout[i])
				out[a[i]]++;
			else
				out[b[i]]++;
		}
		for(int i = 1; i <= N; i++) {
			if(!e(out[i])) {
				System.out.println(-1);
				return;
			}
		}
		for(int i = 1; i <= M; i++) {
			if(aout[i])
				System.out.println(a[i]  + " "  + b[i]);
			else
				System.out.println(b[i]  + " "  + a[i]);
		}

	}

}
