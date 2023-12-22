import java.util.*;

class Main {
	static int cnt;
	static int[] flag;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		flag = new int[N];
		cnt = 0;
		for (int i=0;i<M;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int[][] next = new int[N][N];
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				for (int k=0;k<M;k++) {
					if (a[k]-1==i && b[k]-1==j) {
						next[i][j]=1;
					}
					if (a[k]-1==j && b[k]-1==i) {
						next[i][j]=1;
					}
				}
			}
		}
		flag[0]=1;
		DFS(0,flag,N,M,next);
		System.out.println(cnt);
	}

	static void DFS(int v,int[] flag,int N,int M,int[][] next) {
		boolean bool=false;
		for (int i=0;i<N;i++) {
			if (flag[i]==0) {
				bool = false;
				break;
			}
			if (i==N-1) {
				bool = true;
			}
		}
		if (bool) {
			cnt++;
			return;
		}
		for (int i=0;i<N;i++) {
			if (next[v][i]==1 && flag[i]==0) {
				flag[i]=1;
				DFS(i,flag,N,M,next);
				flag[i]=0;
			} else {
				continue;
			}
		}
		return;
	}
}