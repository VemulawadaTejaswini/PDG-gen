import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();

		Field field = new Field(W, H);

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			field.draw(x, y, a);
		}

		System.out.println(field.calcWhiteArea());
	}

	static class Field {
		final int W, H;
		final boolean[] fieldArray;

		public Field(int W, int H) {
			this.fieldArray = new boolean[W * H];
			this.W = W;
			this.H = H;
			for (int i = 0; i < W * H; i++) {
				fieldArray[i] = true;
			}
		}

		public void draw(int x, int y, int a) {
			switch (a) {
			case 1:
				drawRect(0, x, 0, H);
				break;
			case 2:
				drawRect(x, W, 0, H);
				break;
			case 3:
				drawRect(0, W, 0, y);
				break;
			case 4:
				drawRect(0, W, y, H);
				break;
			}
		}

		private void drawRect(int x1, int x2, int y1, int y2) {
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					drawPoint(x, y);
				}
			}
		}

		private void drawPoint(int x, int y) {
			this.fieldArray[x * H + y] = false;
		}

		public int calcWhiteArea() {
			int ans = 0;
			for (int i = 0; i < W * H; i++) {
				if (this.fieldArray[i]) {
					ans++;
				}
			}
			return ans;
		}
	}
}
