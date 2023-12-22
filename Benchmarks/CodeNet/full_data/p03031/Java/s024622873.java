import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean check(boolean[] sw, int m) { //スイッチの状態がswのとき、m番目の電球がつくか
		int c = 0;
		
		for(int i=0;i<k[m];i++) {
			if(sw[s[m][i]-1])c++;
		}
		
		return c%2 == p[m];
	}
	
	boolean checkAll(boolean[] sw) {
		
		for(int i=0;i<M;i++) {
			if(!check(sw,i)) {
				return false;
			}
		}
		return true;
	}
	
	int[] p;
	int N,M;
	int[][] s;
	int[] k;
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();
		
		
		k = new int[M];
		s = new int[M][N];
		
		for(int i=0;i<M;i++) {
			k[i] = sc.nextInt();
			for(int j=0;j<k[i];j++) {
				s[i][j] = sc.nextInt();
			}
		}
		
		p = new int[M];
		for(int i=0;i<M;i++) {
			p[i] = sc.nextInt();
		}
		
		int ans = 0;
		System.err.println("--");
		for(int i=0;i<Math.pow(2, N);i++) {
			boolean[] sw = new boolean[N];
			for(int j=0;j<N;j++) {
				sw[j] = ((i>>j) & 0x01) == 1;
			}
			System.err.println(Arrays.toString(sw));
			
			if(checkAll(sw)) {
				ans++;
			}
		}
		
		out.println(ans);
		
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
