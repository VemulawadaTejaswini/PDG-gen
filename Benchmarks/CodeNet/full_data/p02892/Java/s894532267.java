import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int[] b = new int[size];
			char[][] map = new char[size][size];
			boolean isCloseFromZero = false;
			Set<Integer> c = new HashSet<>();
			for (int i = 0; i < size; i++) {
				b[i] = -1;
				String line = sc.next();
				boolean bl = c.contains(i);
				boolean bl2 = true;
				for (int j = 0; j < size; j++) {
					map[i][j] = line.charAt(j);
					if (i == 0 && line.charAt(j) == '1') {
						c.add(j);
					}
					if (bl && j != 0 && line.charAt(j) == '1') {
						bl2 = false;
					}
				}
				if (bl2) {
					isCloseFromZero = true;
				}
			}
			Queue<Integer> q = new ArrayDeque<>();
			q.add(0);
			int color = 1;
			int now = 0;
			b[now] = color;
			while (!q.isEmpty()) {
				boolean bl = false;
				int tempSize = q.size();
				for (int p = 0; p < tempSize; p++) {
					int top = q.remove();
					for (int i = top; i < size; i++) {
						if (map[top][i] == '1') {
							if (b[i] == -1) {
								if (!bl) {
									bl = true;
									color++;
								}
								b[i] = color;
								q.add(i);
							} else {
								if (b[i] - b[top] != -1 && b[i] - b[top] != 1) {
									System.out.println(-1);
									return;
								}
							}

						}
					}
				}
			}
			if (isCloseFromZero && color != 2) {
				color++;
			}
			System.out.println(color);
		}
	}
}