import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		char[][] s = new char[H][W];
		String inputStr;
		for(int i = 0; i < H; i++) {
			inputStr = scan.next();
			s[i] = inputStr.toCharArray();
		}
		int[][] dist = new int[H][W];
		int firstBlackNum = 0;	// マスの色を変える前の時点での黒いマスの数
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(s[i][j] == '#') {
					firstBlackNum++;
				}
				dist[i][j] = -1;
			}
		}
		scan.close();
		ArrayDeque<Point_088_C> que = new ArrayDeque<Point_088_C>();
		// スタート地点の登録
		que.add(new Point_088_C(0,0));
		dist[0][0] = 0;
		Point_088_C v;
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		int nextX, nextY;
		int result;
		while(!que.isEmpty() && dist[H - 1][W - 1] == -1) {
			v = que.poll();
			for(int i  =0; i < 4; i++) {
				nextX = v.x + dx[i];
				nextY = v.y + dy[i];
				// 領域外であればスルー
				if(nextX < 0 || nextY < 0 || nextX >= W || nextY >= H) {
					continue;
				}
				// 黒である場合スルー
				if(s[nextY][nextX] == '#') {
					continue;
				}
				// 探索済みである場合スルー
				if(dist[nextY][nextX] != -1) {
					continue;
				}
				dist[nextY][nextX] = dist[v.y][v.x] + 1;
				que.add(new Point_088_C(nextX, nextY));
			}
		}
		if(dist[H - 1][W - 1] == -1) {
			result = -1;
		}else {
			result = H * W - firstBlackNum - (dist[H - 1][W - 1] + 1);
		}
		System.out.println(result);
	}
}

class Point_088_C{
	int x;
	int y;
	Point_088_C(int x, int y){
		this.x = x;
		this.y = y;
	}
}
