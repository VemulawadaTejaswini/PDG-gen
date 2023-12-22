import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] field = new int[h][w];
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        field[i][j] = sc.nextInt();
		    }
		}
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        field[i][j] -= sc.nextInt();
		        field[i][j] = Math.abs(field[i][j]);
		    }
		}
		ArrayList<HashSet<Integer>> list = new ArrayList<>();
		for (int i = 0; i < h * w; i++) {
		    list.add(new HashSet<>());
		}
		list.get(0).add(field[0][0]);
		list.get(0).add(-field[0][0]);
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (j != 0) {
		            for (int x : list.get(i * w + j - 1)) {
		                list.get(i * w + j).add(x + field[i][j]);
		                list.get(i * w + j).add(Math.abs(x - field[i][j]));
		            }
		        }
		        if (i != 0) {
		            for (int x : list.get((i - 1) * w + j)) {
		                list.get(i * w + j).add(x + field[i][j]);
		                list.get(i * w + j).add(Math.abs(x - field[i][j]));
		            }
		        }
		    }
		}
		int min = Integer.MAX_VALUE;
		for (int x : list.get(h * w - 1)) {
		    min = Math.min(min, x);
		}
		System.out.println(min);
	}
}
