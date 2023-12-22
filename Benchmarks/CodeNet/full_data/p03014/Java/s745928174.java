import java.util.*;

public class Main {
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		}
		int[][] horCount = new int[h][w];
		for (int i = 0; i < h; i++) {
		    int count = 0;
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '#') {
		            count = 0;
		        } else {
		            count++;
		        }
		        horCount[i][j] = count;
		    }
		    for (int j = w- 2; j >= 0; j--) {
		        if (horCount[i][j] != 0 && horCount[i][j + 1] != 0) {
		            horCount[i][j] = horCount[i][j + 1];
		        }
		    }
		}
		int[][] verCount = new int[h][w];
		for (int i = 0; i < w; i++) {
		    int count = 0;
		    for (int j = 0; j < h; j++) {
		        if (field[j][i] == '#') {
		            count = 0;
		        } else {
		            count++;
		        }
		        verCount[j][i] = count;
		    }
		    for (int j = h- 2; j >= 0; j--) {
		        if (verCount[j][i] != 0 && verCount[j + 1][i] != 0) {
		            verCount[j][i] = verCount[j + 1][i];
		        }
		    }
		}
		int max = 0;
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        max = Math.max(horCount[i][j] + verCount[i][j], max);
		    }
		}
		System.out.println(max - 1);
	}
}
