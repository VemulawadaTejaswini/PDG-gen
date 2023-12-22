import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int[] keyX = new int[N];
		int[] keyY = new int[N];
		int[] keyH = new int[N];
		Key[] keys = new Key[N];
		for (int i = 0; i < N; i++) {
			keys[i] = new Key(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(keys, new Comparator<Key>() {
			@Override
			public int compare(Key o1, Key o2) {
				// TODO Auto-generated method stub
				return o2.h - o1.h;
			}
		});

		for (int cx = 0; cx <= 100; cx++) {
			for (int cy = 0; cy <= 100; cy++) {
				int H = estimateH(cx, cy, keys[0].x, keys[0].y, keys[0].h);
				boolean allKeyOk = true;
				for (int i = 1; i < N; i++) {
					Key k = keys[i];
					if(heightAt(cx, cy, H, k.x, k.y) != k.h) {
						allKeyOk = false;
						break;
					}
				}
				if (allKeyOk) {
					System.out.printf("%d %d %d\n", cx, cy, H);
					return;
				}
			}
		}

	}

	private int heightAt(int cx, int cy, int h, int x, int y) {
		return Math.max(0, h - Math.abs(cx - x) - Math.abs(cy - y));
	}

	private int estimateH(int cx, int cy, int x, int y, int h) {
		return h + Math.abs(cx - x) + Math.abs(cy - y);
	}

	class Key {
		int x;
		int y;
		int h;

		public Key(int x, int y, int h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}
	}

}
