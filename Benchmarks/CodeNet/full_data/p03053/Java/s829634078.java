import java.lang.reflect.Array;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String s[][] = new String[H][W];
		ArrayList<Integer> ary_x = new ArrayList<Integer>();
		ArrayList<Integer> ary_y = new ArrayList<Integer>();
		for(int i = 0; i < H; i++) {
			String temp = sc.next();
			for(int j = 0; j < W; j++) {
				s[i][j] = temp.substring(j, j + 1);
				if(s[i][j].equals(".")) {
					ary_x.add(j);
					ary_y.add(i);
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < ary_x.size(); i++) {
			ans = Math.max(ans, BFS(s, ary_x.get(i), ary_y.get(i)));
		}
		System.out.println(ans);
	}
	
	public static int BFS(String temp[][], int x, int y) {
		Queue<Integer> queue_x = new ArrayDeque<>();
		Queue<Integer> queue_y = new ArrayDeque<>();
		String s[][] = new String[temp.length][temp[0].length];
		int cnt[][] = new int[s.length][s[0].length];
		for(int i = 0; i < s[0].length; i++) {
			s[i] = temp[i].clone();
		}
		queue_x.add(x);
		queue_y.add(y);
		s[y][x] = "!";
		cnt[y][x] = 0;
		
		while(queue_x.size() != 0 && queue_y.size() != 0) {
			x = queue_x.poll();
			y = queue_y.poll();
			int dx[] = {0, 1, 0, -1};
			int dy[] = {1, 0, -1, 0};
			
			in : for(int i = 0; i < 4; i++) {
				if(x + dx[i] < 0) continue in;
				if(x + dx[i] >= s[0].length) continue in;
				if(y + dy[i] < 0) continue in;
				if(y + dy[i] >= s.length) continue in;
				
				if(s[y + dy[i]][x + dx[i]].equals(".")) {
					queue_x.add(x + dx[i]);
					queue_y.add(y + dy[i]);
					s[y + dy[i]][x + dx[i]] = "!";
					cnt[y + dy[i]][x + dx[i]] = cnt[y][x] + 1;
				} else if(s[y + dy[i]][x + dx[i]].equals("#")) {
					cnt[y + dy[i]][x + dx[i]] = cnt[y][x] + 1;
					return cnt[y + dy[i]][x + dx[i]];
				}
			}
			
		}
		
		return 0;
	}
}
