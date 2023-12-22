import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N,P;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//DPっぽい
		N=sc.nextInt();
		P=sc.nextInt();
		String s=sc.next();
		long[][] renDP = new long[N][P];		//剰余のテーブル
		long[][] cutDP = new long[N][P];		//剰余のテーブル
		for(int i=0; i<N; i++) {
			Arrays.fill(renDP[i],0);
			Arrays.fill(cutDP[i],0);
		}
		renDP[0][(s.charAt(0)-'0')% P] ++;
		if(N == 1) {
			//
		}
		else {
			for(int i=1; i<N; i++) {
				int num = s.charAt(i)-'0';
				for(int j=0; j<P; j++) {
					renDP[i][(j*10 + num)% P] += renDP[i-1][j];
					cutDP[i][j] += renDP[i-1][j];
				}
				for(int j=0; j<P; j++) {
					cutDP[i][j] += cutDP[i-1][j];
				}
				renDP[i][num % P]++;
			}
		}
		pl(renDP[N-1][0] + cutDP[N-1][0]);
		//output(renDP);
		//output(cutDP);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}public static void p(Object o) {
		System.out.print(o);
	}
	public static void output(long[][] a) {
		for(int j=0; j<P; j++) {
			for(int i = 0 ; i < N ; i++) {
				p(a[i][j]+" ");
			}
			pl(a[N][j]);
		}
	}
}