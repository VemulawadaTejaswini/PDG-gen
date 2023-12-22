import java.util.*;

// CODEFES_B 2017-C
// http://code-festival-2017-qualb.contest.atcoder.jp/tasks/code_festival_2017_qualb_c	

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int K = in.nextInt();
		
		long Min = -1000000000L;
		long Max = 1000000000L;
		long answer = Long.MAX_VALUE;
		
		ArrayList<SortX> x = new ArrayList<SortX>();
		ArrayList<SortY> y = new ArrayList<SortY>();
		
		for (int i = 0; i < N; i++) {
			long xx = in.nextLong();
			long yy = in.nextLong();
			
			x.add(new SortX(xx, yy));
			y.add(new SortY(xx, yy));
		}
		
		x.sort(null);
		y.sort(null);
		
		for (int i = 0; i <= N - K; i++) {
			long smallerY = Max; // Apply min
			long biggerY = Min; // Apply max
			long smallerX = x.get(i).x;
			long biggerX = Min; // 
			
			for (int j = i; j < N; j++) {
				smallerY = Math.min(smallerY, x.get(j).y);
				biggerY = Math.max(biggerY, x.get(j).y);
				biggerX = Math.max(biggerX, x.get(j).x);
			}
			
			long area = (biggerX - smallerX) * (biggerY - smallerY);
			if (area == 0) {
				area = 1 * Math.max(biggerX - smallerX, biggerY - smallerY);
			}
			answer = Math.min(answer, area);
		}

		for (int i = 0; i <= N - K; i++) {
			long smallerY = y.get(i).y;
			long biggerY = Min; // Apply max
			long smallerX = Max; // Apply min
			long biggerX = Min; // Apply max
			
			for (int j = i; j < N; j++) {
				biggerY = Math.max(biggerY, y.get(j).y);
				smallerX = Math.min(smallerX, y.get(j).x);
				biggerX = Math.max(biggerX, y.get(j).x);
			}
			
			long area = (biggerX - smallerX) * (biggerY - smallerY);
			if (area == 0) {
				area = 1 * Math.max(biggerX - smallerX, biggerY - smallerY);
			}
			answer = Math.min(answer, area);
		}
		
		System.out.println(answer);
	}
}

class SortX implements Comparable<SortX> {
	long x;
	long y;

	public SortX(long x, long y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(SortX o) {
		if (this.x < o.x) {
			return -1;
		} else if (this.x > o.x) {
			return 1;
		} else {
			return 0;
		}
	}
}

class SortY implements Comparable<SortY> {
	long x;
	long y;
	
	public SortY(long x, long y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(SortY o) {
		if (this.y < o.y) {
			return -1;
		} else if (this.y > o.y) {
			return 1;
		} else {
			return 0;
		}
	}
}