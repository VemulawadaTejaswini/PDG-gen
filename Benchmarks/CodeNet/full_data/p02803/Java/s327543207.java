import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		int[][] costs = new int[h * w][h * w];
		for (int i = 0; i < h * w; i++) {
		    Arrays.fill(costs[i], Integer.MAX_VALUE / 10);
		    costs[i][i] = 0;
		}
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		    for (int j = 0; j < w; j++) {
		        if (i > 0 && field[i - 1][j] == '.' && field[i][j] == '.') {
		            costs[i * w + j][(i - 1) * w + j] = 1;
		            costs[(i - 1) * w + j][i * w + j] = 1;
		        }
		        if (j > 0 && field[i][j - 1] == '.' && field[i][j] == '.') {
		            costs[i * w + j][i * w + j - 1] = 1;
		            costs[i * w + j - 1][i * w + j] = 1;
		        }
		    }
		}
		for (int i = 0; i < h * w; i++) {
		    for (int j = 0; j < h * w; j++) {
		        for (int k = 0; k < h * w; k++) {
		            costs[j][k] = Math.min(costs[j][k], costs[j][i] + costs[i][k]);
		        }
		    }
		}
		int max = -1;
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        for (int k = 0; k < h; k++) {
		            for (int l = 0; l < w; l++) {
        		        if (field[i][j] == '.' && field[k][l] == '.') {
        		            max = Math.max(max, costs[i * w + j][k * w + l]);
        		        }
		            }
		        }
		    }
		}
		System.out.println(max);
	}
	
}
