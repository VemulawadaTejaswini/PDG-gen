import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int pN;
	static int pM;
	static long pL;

	static class ROAD {
		ArrayList<Long> r = new ArrayList<>();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		pN = in.nextInt();
		pM = in.nextInt();
		pL = in.nextInt();
		ROAD[] road = new ROAD[pN];
		for (int i = 0; i < pN; i++)
			road[i] = new ROAD();
		for (int i = 0; i < pM; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			long c = in.nextInt();
			if (c <= pL) {
				road[a].r.add(c * (pN + 1) + b);
				road[b].r.add(c * (pN + 1) + a);
			}
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++)
			System.out.println(solve(in.nextInt() - 1, in.nextInt() - 1, road));
		in.close();
	}

	private static int solve(int s, int t, ROAD[] road) {
		PriorityQueue<Long> pq = new PriorityQueue<>();
		boolean[] ed = new boolean[pN];
		pq.add(pL * (pN + 1) + s);
		return search(t, road, pq, ed);
	}

	private static int search(int t, ROAD[] road, PriorityQueue<Long> pq, boolean[] ed) {
		while (!pq.isEmpty()) {
			long x = pq.poll();
			int xc = (int) (x / ((pL + 1) * (pN + 1)));
			x = x % ((pL + 1) * (pN + 1));
			long xl = x / (pN + 1);
			int xn = (int) (x % (pN + 1));
			if (xn == t)
				return xc;
			if (ed[xn])
				continue;
			ed[xn] = true;
			for (long r : road[xn].r) {
				int rn = (int) (r % (pN + 1));
				if (ed[rn])
					continue;
				long l = r / (pN + 1);
				if (l > xl)
					pq.add(((xc + 1) * (pL + 1) + pL - l) * (pN + 1) + rn);
				else
					pq.add((xc * (pL + 1) + xl - l) * (pN + 1) + rn);
			}
		}
		return -1;
	}
}