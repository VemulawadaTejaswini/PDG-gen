import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		ArrayList<Cell> list = new ArrayList<>();
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
			for (int j = 0; j < w; j++) {
				if (field[i][j] == '#') {
					list.add(new Cell(i, j));
				}
			}
		}
		int count = 0;
		int start = 0;
		int end = list.size();
		while (list.size() < h * w) {
			for (int i = start; i < end; i++) {
				Cell c = list.get(i);
				if (c.x > 0) {
					if (field[c.y][c.x - 1] == '.') {
						list.add(new Cell(c.y, c.x - 1));
						field[c.y][c.x - 1] = '#';
					}
				}
				if (c.y > 0) {
					if (field[c.y - 1][c.x] == '.') {
						list.add(new Cell(c.y - 1, c.x));
						field[c.y - 1][c.x] = '#';
					}
				}
				if (c.x < w - 1) {
					if (field[c.y][c.x + 1] == '.') {
						list.add(new Cell(c.y, c.x + 1));
						field[c.y][c.x + 1] = '#';
					}
				}
				if (c.y < h - 1) {
					if (field[c.y + 1][c.x] == '.') {
						list.add(new Cell(c.y + 1, c.x));
						field[c.y + 1][c.x] = '#';
					}
				}
			}
			start = end;
			end = list.size();
			count++;
		}
		System.out.println(count);
	}
	
	static class Cell {
		int y;
		int x;
		public Cell(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
}
