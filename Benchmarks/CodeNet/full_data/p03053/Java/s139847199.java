import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		Queue<Sell> sellQueue = new ArrayDeque<>();
		boolean[][] fldFlg = new boolean[H][W];
		for (int x = 0; x < H; x++) {
			String[] temp = sc.next().split("");
			for (int y = 0; y < temp.length; y++) {
				if (temp[y].equals("#")) {
					sellQueue.add(new Sell(x, y, 0));
					fldFlg[x][y] = true;
				}
			}
		}
		sc.close();
		
		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };
		
		int count = 0;
		while (sellQueue.size() != 0) {
			Sell sell = sellQueue.poll();
			for (int dxy_index = 0; dxy_index < dx.length; dxy_index++) {
				int x = sell.x + dx[dxy_index];
				int y = sell.y + dy[dxy_index];
				if(x<0|| x >=H || y < 0 || y >= W)continue;
				
				if (fldFlg[x][y])continue;
				
				int countPlus = sell.count + 1;
				sellQueue.add(new Sell(x, y, countPlus));
				fldFlg[x][y] = true;
			}
			
			if(sellQueue.size() == 0)
				count = sell.count;
		}
		System.out.println(count);
	}
	
	static class Sell {
		int x;
		int y;
		int count;

		Sell(int x_, int y_,int count_) {
			x = x_;
			y = y_;
			count = count_;
		}
	}
}