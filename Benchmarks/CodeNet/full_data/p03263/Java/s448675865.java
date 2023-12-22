import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt(), w = in.nextInt();
		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				a[i][j] = in.nextInt();
			}
		}
		List<Grids> list = new ArrayList<>();
		for(int y = 0; y < h; y++) {
			for(int x = 0; x < w - 1; x++) {
				if(a[y][x] % 2 == 1) {
					list.add(new Grids(y, x, y, x + 1));
					a[y][x]--;
					a[y][x + 1]++;
				}
			}
		}
		for(int y = 0; y < h - 1; y++) {
			if(a[y][w - 1] % 2 == 1) {
				list.add(new Grids(y, w - 1, y + 1, w - 1));
				a[y][w - 1]--;
				a[y + 1][w - 1]++;
			}
		}
		System.out.println(list.size());
		list.forEach(System.out::println);
	}

}

class Grids {
	int fy, fx, ty, tx;
	public Grids(int fy, int fx, int ty, int tx) {
		this.fy = fy + 1; this.fx = fx + 1; this.ty = ty + 1; this.tx = tx + 1;
	}
	public String toString() {
		return fy + " " + fx + " " + ty + " " + tx;
	}
}
