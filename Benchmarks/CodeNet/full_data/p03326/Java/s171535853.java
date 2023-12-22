import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Cake[] cakes = new Cake[n];
		for (int i = 0; i < n; i++) {
			cakes[i] = new Cake(sc.nextLong(), sc.nextLong(), sc.nextLong());
		}
		long max = Long.MIN_VALUE;
		Arrays.sort(cakes, new Comparator<Cake>() {
		public int compare(Cake c1, Cake c2) {
			return compareLong(c1.x + c1.y + c1.z, c2.x + c2.y + c2.z);
		}
		});
		long totalA = 0;
		long totalB = 0;
		for (int i = 0; i < m; i++) {
			totalA += cakes[i].x + cakes[i].y + cakes[i].z;
			totalB += cakes[n - i - 1].x + cakes[n - i - 1].y + cakes[n - i - 1].z;
		}
		totalA = Math.abs(totalA);
		totalB = Math.abs(totalB);
		max = Math.max(max, totalA);
		max = Math.max(max, totalB);
		
		Arrays.sort(cakes, new Comparator<Cake>() {
		public int compare(Cake c1, Cake c2) {
			return compareLong(- c1.x + c1.y + c1.z, - c2.x + c2.y + c2.z);
		}
		});
		totalA = 0;
		totalB = 0;
		for (int i = 0; i < m; i++) {
			totalA += - cakes[i].x + cakes[i].y + cakes[i].z;
			totalB += - cakes[n - i - 1].x + cakes[n - i - 1].y + cakes[n - i - 1].z;
		}
		totalA = Math.abs(totalA);
		totalB = Math.abs(totalB);
		max = Math.max(max, totalA);
		max = Math.max(max, totalB);
		
		Arrays.sort(cakes, new Comparator<Cake>() {
		public int compare(Cake c1, Cake c2) {
			return compareLong(c1.x - c1.y + c1.z, c2.x - c2.y + c2.z);
		}
		});
		totalA = 0;
		totalB = 0;
		for (int i = 0; i < m; i++) {
			totalA += cakes[i].x - cakes[i].y + cakes[i].z;
			totalB += cakes[n - i - 1].x - cakes[n - i - 1].y + cakes[n - i - 1].z;
		}
		totalA = Math.abs(totalA);
		totalB = Math.abs(totalB);
		max = Math.max(max, totalA);
		max = Math.max(max, totalB);
		
		Arrays.sort(cakes, new Comparator<Cake>() {
		public int compare(Cake c1, Cake c2) {
			return compareLong(c1.x + c1.y - c1.z, c2.x + c2.y - c2.z);
		}
		});
		totalA = 0;
		totalB = 0;
		for (int i = 0; i < m; i++) {
			totalA += cakes[i].x + cakes[i].y - cakes[i].z;
			totalB += cakes[n - i - 1].x + cakes[n - i - 1].y - cakes[n - i - 1].z;
		}
		totalA = Math.abs(totalA);
		totalB = Math.abs(totalB);
		max = Math.max(max, totalA);
		max = Math.max(max, totalB);
		
		System.out.println(max);
	}
	
	static int compareLong(long x, long y) {
		if (x == y) {
			return 0;
		} else if (x < y) {
			return -1;
		} else {
			return 1;
		}
	}
	
	static class Cake {
		long x;
		long y;
		long z;
		public Cake(long x, long y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
	}
}
