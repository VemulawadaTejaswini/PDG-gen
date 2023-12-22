import java.util.Scanner;

public class Main {
	static int N;
	static int[] A;
	static int[][] x;
	static int[][] y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		x = new int[N][];
		y = new int[N][];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			x[i] = new int[A[i]];
			y[i] = new int[A[i]];
			for(int j=0;j<A[i];j++) {
				x[i][j]=sc.nextInt();
				y[i][j]=sc.nextInt();
			}
		}
		
		int[] honestOrUnkind = new int[N];
		int max = 0;
		for(int bit=0;bit < (1<<N);bit++) {
			int count=0;
			for(int i=0;i<N;i++) {
				if((bit & 1<<i)>0) {
					honestOrUnkind[i]=1;
				}else {
					honestOrUnkind[i]=0;
				}
			}
			if(check(honestOrUnkind)) {
				for(int k=0;k<N;k++) {
					if(honestOrUnkind[k]>0) {
						count++;
					}
				}
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
	
	static boolean check(int[] honestOrUnkind) {
		for(int i=0;i<N;i++) {
			if(honestOrUnkind[i]==1) {
				for(int j=0;j<A[i];j++) {
					if(honestOrUnkind[x[i][j]-1]!=y[i][j]) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
