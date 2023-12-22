import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int X = sc.nextInt()-1;
		int Y = sc.nextInt()-1;
		
		int[] ans = new int[N];
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				int d = Math.min(j-i, Math.abs(j-Y) + 1 + Math.abs(i-X));
				ans[d]++;
			}
		}
		
		
		for(int i=1; i<N; i++)
			pw.println(ans[i]);
		pw.close();
		sc.close();
	}
}
