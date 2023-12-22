import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int N = 201;
	public static int[][] gcdarr = new int[N][N];
	public static void main(String[] args) {
		int i,j,l;
		Scanner sc = new Scanner(in);
		int k = parseInt(sc.next());
		sc.close();
		long sum=0;
		for (i = 1; i <= k; i++) {
			for (j = 1; j <= k; j++) {
				for (l = 1; l <= k; l++) {
					sum+=gcm(gcm(i, j), l);
				}
			}
		}
		out.println(sum);
	}
	public static int gcm(int a, int b) {
//		out.printf("a,b=%d,%d%n", a, b);
		if(gcdarr[a][b]!=0) return gcdarr[a][b];
		int c=a;
		int d=b;
		int tmp;
		while((tmp=a%b)!=0) {
			a=b;
			b=tmp;
		}
		gcdarr[c][d] = gcdarr[d][c] = b; 
		return b;
	}
}
