import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		long[] x = new long[N];
		for(int i=0; i<N; i++)
			x[i] = (sc.nextLong()-1)<<10 | (i+1);

		int[] ans = solve(N, x);
		
		if(ans==null) {
			pw.println("No");
		} else {
			pw.println("Yes");
			for(int i=0; i<N*N; i++)
				pw.print(ans[i] + (i==N*N-1 ? "\n" : " "));
		}
		sc.close();
		pw.close();
	}
	
	static int[] solve(int N, long[] x) {
		Arrays.sort(x);
		
		int[] ans = new int[N*N];
		int p = 0;
		for(int i=0; i<N; i++) {
			int idx = (int)(x[i]&((1<<10)-1));
			int pos = (int)(x[i]>>10);
			if(ans[pos]!=0)
				return null;
			ans[pos] = idx;
			for(int j=0; j<idx-1; j++) {
				while(ans[p]!=0)
					p++;
				if(p>pos)
					return null;
				ans[p] = idx;
			}
		}
		
		p = N*N-1;
		for(int i=N-1; i>=0; i--) {
			int idx = (int)(x[i]&((1<<10)-1));
			int pos = (int)(x[i]>>10);
			for(int j=0; j<N-idx; j++) {
				while(ans[p]!=0)
					p--;
				if(p<pos)
					return null;
				ans[p] = idx;
			}
		}
		
		return ans;
	}
}
