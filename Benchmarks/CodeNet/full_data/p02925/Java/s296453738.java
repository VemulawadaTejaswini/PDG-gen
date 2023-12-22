//ナイーブで間に合わなかったので、qを使って、変化があった選手についてだけ翌日見ることにした。
//コードは特に汚い
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[N][N-1];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				A[i][j]=sc.nextInt()-1;
			}
		}
		sc.close();
		int INF = Integer.MAX_VALUE/2;
		int cnt[] = new int[N]; //各選手の次の対戦相手を表すポインタがどこにあるか
		int p[] = new int[N]; //各選手の次の対戦相手
		for(int i=0;i<N;i++) {
			p[i] = A[i][0];
		}
		
		Queue<Integer> q = new ArrayDeque<>();
		Queue<Integer> q_check = new ArrayDeque<>();
		
		//日にち
		int day = 0;
		boolean isStop = false;
		for(;day<1000000;day++) {
			if(day==0) {
				for(int j=0;j<N;j++) {
					if(p[j]==-1||p[j]==INF)continue;
					if(p[p[j]]!=j) continue;
					//マッチング成功
					p[p[j]]=INF;
					p[j]=INF;
				}
			
				isStop = true;
				for(int j=0;j<N;j++) {
					if(p[j]==INF) {
						cnt[j]++;
						if(cnt[j]!=N-1) p[j]=A[j][cnt[j]];
						else p[j]=-1;
						isStop = false;
						q.add(j);
					}
				}
			}
			else {
				while(!q.isEmpty()) {
					int now = q.poll();
					if(p[now]==-1||p[now]==INF)continue;
					if(p[p[now]]!=now) continue;
					//マッチング成功
					p[p[now]]=INF;
					q_check.offer(p[now]);
					p[now]=INF;
					q_check.offer(now);


				}
				isStop = true;
				while(!q_check.isEmpty()) {
					int now = q_check.poll();
					if(p[now]==INF) {
						cnt[now]++;
						if(cnt[now]!=N-1) p[now]=A[now][cnt[now]];
						else p[now]=-1;
						isStop = false;
						q.add(now);
					}
				}

			}
			if(isStop)break;
		}
		
		for(int i=0;i<N;i++) {
			if(cnt[i]!=N-1) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(day);
	}
}
