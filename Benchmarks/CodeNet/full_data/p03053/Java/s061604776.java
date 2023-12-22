import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H+2][W+2];
		for(int i = 1; i <= H; i++) {
			String S = sc.next();
			for(int j = 1; j <= W; j++)
				A[i][j] = S.charAt(j-1);
		}
		int ans = 0;
		Queue<Integer> q = new ArrayDeque<>();
		int[][] used = new int[H+2][W+2];
		for(int j = 0; j <= W+1; j++) {
			used[0][j] = 1;
			used[H+1][j] = 1;
		}for(int i = 0; i <= H+1; i++) {
			used[i][0] = 1;
			used[i][W+1] = 1;
		}
		for(int i = 1; i <= H; i++)
			for(int j = 1; j <= W; j++)
				if(A[i][j] == '#') {
					q.offer(i*(W+2)+j);
					used[i][j] = 1;
				}
		while(q.size() > 0) {
			int x = q.poll();
			int i = x / (W+2), j = x % (W+2);
			if(used[i-1][j] == 0) {
				used[i-1][j] = used[i][j]+1;
				q.offer((i-1)*(W+2)+j);
			}
			if(used[i+1][j] == 0) {
				used[i+1][j] = used[i][j]+1;
				q.offer((i+1)*(W+2)+j);
			}
			if(used[i][j-1] == 0) {
				used[i][j-1] = used[i][j]+1;
				q.offer(i*(W+2)+j-1);
			}
			if(used[i][j+1] == 0) {
				used[i][j+1] = used[i][j]+1;
				q.offer(i*(W+2)+j+1);
			}	
			ans = used[i][j] - 1;
		}
		System.out.println(ans);
	}

}
