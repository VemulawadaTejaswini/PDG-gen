import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int q = in.nextInt();
		STX[] stx = new STX[n];
		for (int i = 0; i < n; i++) {
			stx[i] = new STX(in.nextInt(), in.nextInt(), in.nextInt());
		}
		DX[] dx = new DX[q];
		for (int i = 0; i < q; i++) {
			dx[i] = new DX(i, in.nextInt(), -1);
		}
		solve(stx, dx);
		in.close();
	}

	private static void solve(STX[] stx, DX[] dx) {
		Arrays.sort(stx, (a, b) -> a.s - b.s);
		for (int i = 0; i < dx.length; i++)
			for (int j = 0; j < stx.length; j++)
				if (stx[j].s > dx[i].d)
					break;
				else if (stx[j].t > dx[i].d)
					if (dx[i].x == -1)
						dx[i].x = stx[j].x;
					else
						dx[i].x = Math.min(dx[i].x, stx[j].x);
		for (int i = 0; i < dx.length; i++)
			System.out.println(dx[i].x);
	}

	static class STX {
		public STX(int s, int t, int x) {
			this.s = s - x;
			this.t = t - x;
			this.x = x;
		}

		int s;
		int t;
		int x;
	}

	static class DX {
		public DX(int id, int d, int x) {
			this.id = id;
			this.d = d;
			this.x = x;
		}

		int id;
		int d;
		int x;
	}

}