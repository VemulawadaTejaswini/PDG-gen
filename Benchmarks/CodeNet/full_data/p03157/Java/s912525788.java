import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Main {

	private static final char BLACK = '#';
	private static final char WHITE = '.';

	private int H;
	private int W;

	public static void main(String[] args) throws IOException {
		new Main().execute();
	}

	public void execute() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		String[] hw = in.readLine().split(" ");

		H = Integer.parseInt(hw[0]);
		W = Integer.parseInt(hw[1]);
//		sc.nextLine();
		Cell[][] board = new Cell[H][W];
		ArrayList<Cell> blacks = new ArrayList<>();
		ArrayList<Cell> whites = new ArrayList<>();
		UFCell uf = new UFCell();

		for (int i = 0; i < H; i++) {
//			String line = sc.nextLine();
			String line = in.readLine();
			for (int j = 0; j < W; j++) {
				char c = line.charAt(j);
				Cell cell = new Cell(i, j, c);
				board[i][j] = cell;
				uf.add(cell);
				if (i > 0 && cell.Color != board[i - 1][j].Color) {
					uf.union(cell, board[i - 1][j]);
				}
				if (j > 0 && cell.Color != board[i][j - 1].Color) {
					uf.union(cell, board[i][j - 1]);
				}
				if (c == BLACK) {
					blacks.add(cell);
				} else if (c == WHITE) {
					whites.add(cell);
				} else {
					throw new IllegalArgumentException();
				}
			}
		}

		/*
		 * int cnt = 0; for (Cell b : blacks) { for (Cell w : whites) { if (uf.same(b,
		 * w)) { cnt++; } } }
		 */
		System.out.println(uf.count());
//		sc.close();
	}

	class Cell {
		public final int id;
		public final char Color;

		public Cell(int x, int y, char color) {
			this.Color = color;
			this.id = H * y + x;
		}

	}

	class UFCell {
		private HashMap<Integer, Cell> cells = new HashMap<>();
		private int parents[] = new int[H * W];

		public void add(Cell c) {
			parents[c.id] = c.id;
			cells.put(c.id, c);
		}

		private int rootID(int cid) {
			if (parents[cid] == cid) {
				return cid;
			} else {
				int pid = parents[cid];
				int root = rootID(pid);
				parents[cid] = root;
				return root;
			}
		}

		public void union(Cell c1, Cell c2) {
			int r1 = rootID(c1.id);
			int r2 = rootID(c2.id);
			if (r1 == r2) {
				return;
			} else {
				parents[r1] = r2;
			}
		}

		public boolean same(Cell c1, Cell c2) {
			return rootID(c1.id) == rootID(c2.id);
		}

		public long count() {
			long cnt = 0;
			HashMap<Integer, Integer> wht = new HashMap<>();
			HashMap<Integer, Integer> blk = new HashMap<>();
			for (int i = 0; i < parents.length; i++) {
				int r = rootID(parents[i]);
				if (!blk.containsKey(r)) {
					blk.put(r, 0);
				}
				if (!wht.containsKey(r)) {
					wht.put(r, 0);
				}
				switch (cells.get(i).Color) {
				case BLACK:
					blk.put(r, blk.get(r) + 1);
					break;
				case WHITE:
					wht.put(r, wht.get(r) + 1);
					break;
				}
			}
			for (Integer key : blk.keySet()) {
				cnt += blk.get(key) * wht.get(key);
			}
			return cnt;
		}

	}

}
