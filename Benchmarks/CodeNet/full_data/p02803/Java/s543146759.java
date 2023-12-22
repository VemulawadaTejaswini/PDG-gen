import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	private static final int[] D_Y = { 0, 1, 0,-1};
	private static final int[] D_X = { 1, 0,-1, 0};

	private static final char WALL = '#';
	private static final char ROAD = '.';

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		String [] map  = new String [h];
		for(int i = 0; i < h; i++) {
			map[i] = sc.next();
		}

		Queue<Integer> q = new LinkedList<>();
		int ans = 0;

		for(int startY = 0; startY < h; startY++) {
			for(int startX = 0; startX < w; startX++) {
				boolean [][] isSearched = new boolean[h][w];

				q.add(startY);
				q.add(startX);
				q.add(0);
				isSearched[startY][startX] = true;

				while(!q.isEmpty()) {
					int nowY = q.poll();
					int nowX = q.poll();
					int dist = q.poll();

					for(int direction = 0; direction < D_Y.length; direction++) {
						int newY = nowY + D_Y[direction];
						if(newY < 0 || h <= newY) continue;

						int newX = nowX + D_X[direction];
						if(newX < 0 || w <= newX) continue;

						int newDist = dist+1;

						char c = map[newY].charAt(newX);

						if(isSearched[newY][newX] == false && c == ROAD) {
							q.add(newY);
							q.add(newX);
							q.add(newDist);
							isSearched[newY][newX] = true;

							ans = Math.max(ans, newDist);
						}
					}

				}


			}
		}

		System.out.println(ans);
	}

}