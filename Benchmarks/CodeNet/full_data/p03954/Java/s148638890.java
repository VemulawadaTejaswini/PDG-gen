import java.util.*;

public class Main {
	final static long MOD = 924844033;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = 2*N-1;
		int[][] a = new int[2][L];
		for(int i=0; i<L; i++)
			a[0][i] = sc.nextInt();
		
		int cur = 0;
		for(int i=0; i<N-1; i++) {
			
			boolean stable = true;
			boolean toggle = true;
			for(int j=0; j<L; j++) {
				a[cur^1][j] = mid(a[cur][j==0 ? L-1 : j-1], a[cur][j], a[cur][j==L-1 ? 0 : j+1]);
			}
			for(int j=0; j<L; j++) {
				if(a[cur^1][j]!=a[cur][j])
					stable = false;
				if(a[cur^1][j]!=a[cur][(j+1)%L])
					toggle = false;
			}
			if(stable) {
				System.out.println(a[cur^1][N-1]);
				sc.close();
				return;
			}
			if(toggle) {
				System.out.println(a[cur^1][N-1 + (N-2-i)%2]);
				sc.close();
				return;
			}
			
			cur^=1;
		}
		
		System.out.println(a[cur][N-1]);
		sc.close();
	}
	
	static int mid(int a, int b, int c) {
		if(a==b || a==c)
			return a;
		if(b==c)
			return b;
		if(a<b ^ a<c)
			return a;
		if(b<a ^ b<c)
			return b;
		return c;
	}
}
