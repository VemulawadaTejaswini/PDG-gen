import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int h = sc.nextInt();
			int w = sc.nextInt();

			boolean[][] maze = new boolean[h+2][w+2];

			for(int i = 0 ; i < h ; i++ ) {
				String cols = sc.next();

				for(int j = 0 ; j < w ; j++ ) {
					maze[i+1][j+1] = (cols.charAt(j) == '.');
				}
			}

			// guards
			for(int i = 0 ; i < h ; i++ ) {
				maze[i][0] = false;
				maze[i][w+1] = false;
			}

			for(int j = 0 ; j < w ; j++ ) {
				maze[0][j] = false;
				maze[h+1][j] = false;
			}

			int maxResult = 0;

			for(int i = 0 ; i < h ; i++ ) {				
				for(int j = 0 ; j < w ; j++ ) {
					int result = walkCount(i+1, j+1, h, w, maze);
//					System.out.println(String.format("%d, %d, %d", i+1, j+1, result));
					if ( maxResult < result) {
						maxResult = result;
					}
				}
			}

			System.out.println(maxResult);
		}
	}

	private static int walkCount(int initY,int initX, int h, int w, boolean[][] maze) {

		// 0 --> -1,0
		// 1 --> 0,1
		// 2 --> 1,0
		// 3 --> 0,-1
		if ( !maze[initY][initX] ) {
			return 0;
		}
		
		
		int[][] steps = new int[h+2][w+2];
		for(int i = 0 ; i < h ; i++ ) {
			for(int j = 0 ; j < w ; j++ ) {
				steps[i+1][j+1] = Integer.MAX_VALUE;				
			}
		}

		PriorityQueue<SearchStep> pq = new PriorityQueue<>(new Comparator<SearchStep>() {
			@Override
			public int compare(SearchStep o1, SearchStep o2) {			
				return Integer.compare(o1.step, o2.step);
			}			
		});

		steps[initY][initX] = 0;
		SearchStep initialSearch = new SearchStep(initY, initX, 0);
		pq.add(initialSearch);
		while(true) {			

			SearchStep ss = pq.poll();
			if ( ss == null) {
				break;
			}
			
//			System.out.println(String.format(" ## %d,%d,%d", ss.y,ss.x,ss.step));

			for(int i = 0 ; i < 4 ; i++ ) {
				int dy = i % 2 == 0 ? i - 1 : 0;
				int dx = i % 2 == 1 ? 2 - i : 0;

				int x = ss.x;
				int y = ss.y;
				int step = ss.step;
				
//				System.out.println(String.format(" --> %d,%d,step value:%d, %b", y+dy,x+dx,steps[y+dy][x+dx], maze[y+dy][x+dx]));

				if ( steps[y+dy][x+dx] > step + 1 && maze[y+dy][x+dx]) {
					steps[y+dy][x+dx] = step + 1;
					pq.add(new SearchStep(y+dy, x+dx, step+1));
				}
			}
		}

		int max = 0;
		for(int i = 0 ; i < h ; i++ ) {
			for(int j = 0 ; j < w ; j++ ) {
				if ( steps[i+1][j+1] > max && maze[i+1][j+1]) {
					max = steps[i+1][j+1];
				}
			}
		}
		
		return max;
	}

	private static class SearchStep {

		SearchStep(int y,int x, int step) {
			this.y = y;
			this.x = x;
			this.step = step;
		}
		public int y;
		public int x;
		public int step;


	}
}