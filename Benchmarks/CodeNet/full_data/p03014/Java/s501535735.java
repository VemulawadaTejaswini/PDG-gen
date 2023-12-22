
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt();
		int W = scn.nextInt();
		scn.nextLine();
		int[][] block = new int[H][W];
		ArrayList<ArrayList<Integer>> Y = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> T = new ArrayList<ArrayList<Integer>>();

		int[][] yoko = new int[H][W];
		int[][] tate = new int[H][W];

		for (int i = 0; i < H; i++) {
			char[] ch = scn.nextLine().toCharArray();
			for (int j = 0; j < W; j++) {
				block[i][j] = (ch[j] == '#')?0:1;
			}
		}

		for(int h = 0;h < H;h++) {
			ArrayList<Integer> buf = new ArrayList<Integer>();
			for(int w = 0;w < W;w++) {
				if(block[h][w] == 0) {
					buf.add(w);
				}
			}
			Y.add(buf);
		}
		for(int w = 0;w < W;w++) {
			ArrayList<Integer> buf = new ArrayList<Integer>();
			for(int h = 0;h < H;h++) {
				if(block[h][w] == 0) {
					buf.add(h);
				}
			}
			T.add(buf);
		}


		for(int h = 0;h < H;h++) {
			ArrayList<Integer> now = Y.get(h);
			int start = 0;
			for(int i = 0;i < now.size();i++) {
				int last = now.get(i);
				for(int j = start;j < last;j++) {
					yoko[h][j] = last-start;
				}
				start = last + 1;
			}
			for(int j = start;j < W;j++) {
				yoko[h][j] = W-start;
			}
		}
		for(int w = 0;w < W;w++) {
			ArrayList<Integer> now = T.get(w);
			int start = 0;
			for(int i = 0;i < now.size();i++) {
				int last = now.get(i);
				for(int j = start;j < last;j++) {
					tate[j][w] = last-start;
				}
				start = last + 1;
			}
			for(int j = start;j < H;j++) {
				tate[j][w] = H-start;
			}
		}

		long ans = 0;
		for(int h = 0;h < H;h++) {
			for(int w = 0;w < W;w++) {
				ans = Math.max(ans, yoko[h][w] + tate[h][w] - 1);
			}
		}

		System.out.println(ans);
	}

}
