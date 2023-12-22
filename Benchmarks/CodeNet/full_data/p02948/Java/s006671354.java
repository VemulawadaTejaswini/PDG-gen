import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, M;
	int[][] d;
	int[] st;
	int B;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		d = new int[N][2];
		for (int i = 0; i < N; i++) {
			d[i][0] = sc.nextInt();
			d[i][1] = sc.nextInt();
		}
		
		B = 1 << (Integer.toBinaryString(N-1).length());
		st = new int[2*B-1];
		Arrays.fill(st, -1);
		
		Comparator<int[]> c = (a,b) -> Integer.compare(a[0],b[0]);
		Arrays.sort(d, c);
		
		int result = 0;
		int day = 1;
		int i = 0;
		while (true) {
			while (i < N && d[i][0] < day) i++;
			while (i < N && d[i][0] == day) {
				insert(i, i);
				i++;
			}
			int mi = st[0];
			insert(st[0], -1);
			if (mi > -1) result += d[mi][1];
			day++;
			if (day > M) break;
		}
		System.out.println(result);
		System.out.flush();
	}
	
	private void insert(int index, int val) {
		int i = B-1+index;
		st[i] = val;
		while (i > 0) {
			i = (i-1) >>> 1;
			int l = 2*i+1;
			int r = 2*i+2;
			if (st[l] == -1) st[i] = st[r];
			else if (st[r] == -1) st[i] = st[l];
			else if (d[st[l]][1] > d[st[r]][1]) st[i] = st[l];
			else st[i] = st[r];
		}
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}