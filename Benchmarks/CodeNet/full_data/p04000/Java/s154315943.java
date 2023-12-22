import java.util.*;
import java.io.*;

public class Main {
	static HashMap<Point, Integer> map = new HashMap<>();
	static int h;
	static int w;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sarr = br.readLine().split(" ", 3);
		h = Integer.parseInt(sarr[0]);
		w = Integer.parseInt(sarr[1]);
		int n = Integer.parseInt(sarr[2]);
		for (int i = 0; i < n; i++) {
			String[] line = br.readLine().split(" ", 2);
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			for (int j = a - 1; j <= a + 1; j++) {
				for (int k = b - 1; k <= b + 1; k++) {
					set(j - 1, k - 1);
				}
			}
		}
		int[] arr = new int[10];
		int total = 0;
		for (int x : map.values()) {
			if (x <= 9) {
				arr[x]++;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append((long)(h - 2) * (long)(w - 2) - map.size()).append("\n");
		for (int i = 1; i < 10; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	static void set(int y, int x) {
		if (y < 1 || x < 1 || y >= h - 1 || x >= w - 1) {
			return;
		}
		Point p = new Point(x, y);
		if (map.containsKey(p)) {
			int v = map.get(p);
			map.put(p, v + 1);
		} else {
			map.put(p, 1);
		}
	}
	
	static class Point {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int hashCode() {
			return x + y;
		}
		
		public boolean equals(Object o) {
			Point p = (Point)o;
			return p.x == x && p.y == y;
		}
	}
}
