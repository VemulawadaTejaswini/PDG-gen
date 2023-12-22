import java.io.PrintWriter;
import java.util.*;

public class Main {
	static long[] L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int Q = sc.nextInt();
		L = new long[31];
		L[0] = 1;
		for(int i=0; i<30; i++)
			L[i+1] = L[i]*3;
		
		for(int i=0; i<Q; i++) {
			pw.println(solve(sc.nextLong()-1, sc.nextLong()-1, sc.nextLong()-1, sc.nextLong()-1));
		}
		
		sc.close();
		pw.close();
	}
	
	static long solve(long x0, long y0, long x1, long y1) {
		for(int i=30; i>=1; i--) {
			if(x0/L[i-1]==x1/L[i-1] && y0/L[i-1]==y1/L[i-1]) {
				continue;
			}
			if(x0/L[i-1]!=x1/L[i-1] && y0/L[i-1]!=y1/L[i-1]) {
				return Math.abs(x0-x1) + Math.abs(y0-y1);
			}
			if(x0/L[i-1] == x1/L[i-1]) {
				long temp = x0;
				x0 = y0;
				y0 = temp;
				temp = x1;
				x1 = y1;
				y1 = temp;
			}
			for(int j=i-1; j>=0; j--) {
				if(y0/L[j] != y1/L[j]) {
					return Math.abs(x0-x1) + Math.abs(y0-y1);
				}
				if(y0/L[j]==1 && y1/L[j]==1) {
					if(Math.abs(x0/L[j]-x1/L[j])>=2) {
						return (Math.min((y0-L[j]+1)+(y1-L[j]+1), (L[j]*2-y0)+(L[j]*2-y1))+Math.abs(x0-x1));
					}
				}
				y0 %= L[j];
				y1 %= L[j];
			}
			return Math.abs(x0-x1) + Math.abs(y0-y1);
		}
		return Math.abs(x0-x1) + Math.abs(y0-y1);
	}
	
}
