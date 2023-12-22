import java.util.*;

class Node {
	int x;
	int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	public static int floodFill(char[][] maze, int[][] visited, int i, int j) {
		int[] dx = new int[]{0,0,1,-1};
		int[] dy = new int[]{1,-1,0,0};
		int tempMax = 0;
		visited[i][j] = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(i,j));
		while(q.peek() != null) {
			Node now = q.remove();
			for(int a = 0; a < 4; a++) {
				int newI = now.x + dx[a];
				int newJ = now.y + dy[a];
				if(newI >= 0 && newI < maze.length && newJ >= 0 && newJ < maze[0].length && maze[now.x][now.y] == '.') {
					if(visited[newI][newJ] == -1 && maze[newI][newJ] == '.') {
						visited[newI][newJ] = 1 + visited[now.x][now.y];
						tempMax = Math.max(visited[newI][newJ], tempMax);
						q.add(new Node(newI, newJ));
					}
				}
			}
		}
		return tempMax;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int ans = 0;
		char[][] maze = new char[h][w];
		int[][] visited = new int[h][w];
		for(int i = 0; i < h; i++) {
			String input = in.next();
			for(int j = 0; j < w; j++) {
				maze[i][j] = input.charAt(j);
				visited[i][j] = -1;
			}	
		}
		for(int i = 0; i < h; i++) {
			boolean floodFilled = false;
			for(int j = 0; j < w; j++) {
				if(maze[i][j] == '.') {
					ans = floodFill(maze, visited, i, j);
					floodFilled = true;
					break;
				}
			}
			if(floodFilled) {
				break;
			}
		}
		int maxI = 0;
		int maxJ = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(visited[i][j] == ans) {
					maxI = i;
					maxJ = j;
				}
				visited[i][j] = -1;
			}
		}
		ans = floodFill(maze, visited, maxI, maxJ);
		System.out.println(ans);	
	}
}
