import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] l = new int[N];
		int[] r = new int[N];
		for(int i=0; i<N; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int[] delta = new int[M+2];
		int[] ans = new int[M+1];
		
		for(int i=0; i<N; i++) {
			int lastMin = Integer.MAX_VALUE;
			for(int j=1; j<=M; j++) {
				int min = (l[i]+j-1)/j;
				int max = r[i]/j;
				if(min<=max) {
					if(max+1<lastMin) {
						if(lastMin<Integer.MAX_VALUE)
							delta[lastMin]++;
						delta[max+1]--;
					}
					lastMin = min;
					if(min<=r[i]-l[i]+1)
						break;
				}
			}
			delta[1]++;
		}
		
		
		int cur = 0;
		for(int i=1; i<=M; i++) {
			cur += delta[i];
			ans[i] += cur;
		}
		
		for(int i=1; i<=M; i++)
			pw.println(ans[i]);
		
		sc.close();
		pw.close();
	}
}
