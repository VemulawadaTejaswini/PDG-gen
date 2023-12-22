import java.lang.reflect.Array;
import java.util.*;
public class Main {
	static Queue<Integer> queue_x = new ArrayDeque<>();
	static Queue<Integer> queue_y = new ArrayDeque<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int cnt[][] = new int[H][W];
		for(int i = 0; i < H; i++) {
			Arrays.fill(cnt[i], -1);
			String temp = sc.next();
			for(int j = 0; j < W; j++) {
				if(temp.substring(j, j + 1).equals("#")) {
					queue_x.add(j);
					queue_y.add(i);
					cnt[i][j] = 0;
				}
			}
		}
		
		int ans = 0;
		while(queue_x.size() != 0 && queue_y.size() != 0) {
			int y = queue_y.poll();
			int x = queue_x.poll();
			
			int dx[] = {0, 1, 0, -1};
			int dy[] = {1, 0, -1, 0};
			
			in : for(int i = 0; i < 4; i++) {
				if(x + dx[i] < 0) continue in;
				if(x + dx[i] >= W) continue in;
				if(y + dy[i] < 0) continue in;
				if(y + dy[i] >= H) continue in;
				
				if(cnt[y + dy[i]][x + dx[i]] == -1) {
					queue_x.add(x + dx[i]);
					queue_y.add(y + dy[i]);
					cnt[y + dy[i]][x + dx[i]] = cnt[y][x] + 1;
					ans = Math.max(ans, cnt[y + dy[i]][x + dx[i]]);
				}
			}
		}
		System.out.println(ans);
	}
}
