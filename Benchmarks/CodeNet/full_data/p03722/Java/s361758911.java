import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[M];
		int[] b = new int[M];
		int[] c = new int[M];

		int[][] to = new int[N+1][M];
		int[] cnt = new int[N+1];
		for(int i=1; i<=N; i++){
			cnt[i] = 0;
		}

		for(int i=0; i<M; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			to[a[i]][cnt[a[i]]++] = i;
		}

		long[] score = new long[N+1];
		score[1] = 0;
		for(int i=2; i<=N; i++){
			score[i] = Long.MIN_VALUE;
		}

		boolean[] visited = new boolean[N+1];
		visited[1]=true;
		for(int i=2; i<=N; i++){
			visited[i] = false;
		}

		int[] stock = new int[M];
		int stock_cnt = 0;

		int now = 1;
		int next;
		boolean inf = false;
		while(true){
			for(int j=0; j<cnt[now]; j++){
				next = to[now][j];
				if(visited[b[next]]==true){
					inf = true;
					break;
				}
				Long x = score[b[next]];
				Long y = score[now] + c[next];
				if(x.compareTo(y)==-1){
					score[b[next]] = score[now] + c[next];
				}
				if(cnt[b[next]]>0 && visited[b[next]]==false){
					stock[stock_cnt++] = b[next];
				}

			}
			if(inf==true){
				break;
			}
			if(stock_cnt!=0){
				now = stock[stock_cnt-1];
				stock_cnt--;
				visited[now]=true;
			}else{
				break;
			}
		}

		if(inf==true){
			System.out.print("inf");
		}else{
			System.out.print(score[N]);
		}


	}

}
