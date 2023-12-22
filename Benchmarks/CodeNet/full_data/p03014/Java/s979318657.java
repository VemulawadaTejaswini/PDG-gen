import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String S_temp[] = new String[H];
		String S[][] = new String[H][W];
		int n[][] = new int[H][W];
		for(int i = 0; i < H; i++) {
			S_temp[i] = sc.next();
			int cnt = 0;
			for(int j = 0; j < W; j++) {
				S[i][j] = S_temp[i].substring(j, j + 1);
				if(S[i][j].equals(".")) {
					cnt++;
				} else {
					for(int k = 0; k < cnt; k++) {
						n[i][j - k] = cnt;
					}
					cnt = 0;
				}
			}
		}
		/*for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i][j].equals(".")) {
					int cnt = BFS1(S, j, i);
					for(int k = 0; k < cnt; k++) {
						n[i][j + k] += cnt;
					}
					j += cnt;
				}
			}
		}*/
		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
				if(S[j][i].equals("$")) {
					int cnt = BFS2(S, i, j);
					for(int k = 0; k < cnt; k++) {
						n[j + k][i] += cnt;
					}
					j += cnt;
				}
			}
		}
		int ans = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				//System.out.println(n[i][j]);
				ans = Math.max(ans, n[i][j]);
			}
		}
		System.out.println(ans);
	}
	
	public static int BFS1(String maze[][], int now_x, int now_y) {
		
		Queue<Integer> queue_x = new ArrayDeque<Integer>();
		//Queue<Integer> queue_y = new ArrayDeque<Integer>();
		queue_x.add(now_x);
		maze[now_y][now_x] = "$";
		//queue_y.add(now_y);
		
		int cnt = 1;
		while(queue_x.size() != 0) {
			now_x = queue_x.poll();
				if(now_x == maze[0].length - 1) break;
				
				if(maze[now_y][now_x + 1].equals(".")) {
					maze[now_y][now_x + 1] = "$";
					queue_x.add(now_x + 1);
					cnt++;
				}
		}
		
		return cnt;
	}
	
	public static int BFS2(String maze[][], int now_x, int now_y) {
		//int dx[] = {-1, 0, 1, 0};
		//Queue<Integer> queue_x = new ArrayDeque<Integer>();
		Queue<Integer> queue_y = new ArrayDeque<Integer>();
		//queue_x.add(now_x);
		queue_y.add(now_y);
		maze[now_y][now_x] = "#";
		
		int cnt = 0;
		
		while(queue_y.size() != 0) {
			now_y = queue_y.poll();
				if(now_y == maze.length - 1) break;
				
				if(maze[now_y + 1][now_x].equals("$")) {
					maze[now_y + 1][now_x] = "#";
					queue_y.add(now_y + 1);
					cnt++;
				}
		}
		
		return cnt;
	}
}