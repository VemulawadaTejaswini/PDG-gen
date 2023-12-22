import java.util.Scanner;
 
public class Main {
	private class Point {
		int size = 0;
		int[] as = null;
		
		public Point(int dim) {
			this.size = dim;
			this.as = new int[dim];
		}
		
		public void read(Scanner in) {
			for (int i=0; i<this.size; i++) {
				as[i] = in.nextInt();
			}
		}
		
		public boolean isIntegerDiff(Point oth) {
			long diff = 0;
			for (int i=0; i<size; i++) {
				long d = this.as[i] - oth.as[i];
				diff += d * d;
			}
			
			long num = Math.round(Math.sqrt((double)diff));
			if (num * num == diff) {
				return true;
			} else {
				return false;
			}
			
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int D = in.nextInt();
		Point[] ps = new Point[N];
		for (int i=0; i<N; i++) {
			ps[i] = new Point(D);
			ps[i].read(in);
		}
		in.close();
		
		long count = 0;
		for (int i=0; i<N; i++) {
			for (int j=i+1; j<N; j++) {
				if (ps[i].isIntegerDiff(ps[j])) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
