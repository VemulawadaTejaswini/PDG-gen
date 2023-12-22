import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[][] bridge = new int[M][2];
		for (int i = 0; i < M; i++) {
			bridge[i][0] = scn.nextInt();
			bridge[i][1] = scn.nextInt();
		}

		ArrayList<HashSet<Integer>> G = new ArrayList<HashSet<Integer>>();

		long[] ans = new long[M];
		ans[M - 1] = (long) N * (long) (N - 1) / 2;
		for (int i = M - 1; i > 0; i--) {
			long buf = ans[i];
			if (buf == 0) {
				ans[i - 1] = 0;
				continue;
			}

			int a = bridge[i][0];
			int b = bridge[i][1];

			int ga = -1, gb = -1;
			for (int j = 0; j < G.size(); j++) {
				HashSet<Integer> g = G.get(j);
				if (ga == -1) {
					if (g.contains(a))
						ga = j;
				}
				if (gb == -1) {
					if (g.contains(b))
						gb = j;
				}
				if (ga != -1 && gb != -1)
					break;
			}

			if (ga == -1 && gb == -1) {
				buf -= 1;
				HashSet<Integer> nyan = new HashSet<Integer>();
				nyan.add(a);
				nyan.add(b);
				G.add(nyan);
			} else {
				if (ga == -1) {
					HashSet<Integer> gbuf = G.get(gb);
					buf -= gbuf.size();
					gbuf.add(a);
				} else if (gb == -1) {
					HashSet<Integer> gbuf = G.get(ga);
					buf -= gbuf.size();
					gbuf.add(b);
				} else {
					if (ga == gb) {

					} else {
						HashSet<Integer> gbufa = G.get(ga);
						HashSet<Integer> gbufb = G.get(gb);
						buf -= gbufa.size() * gbufb.size();
						gbufa.addAll(gbufb);
						G.remove(gb);
					}
				}
			}
			if (buf < 0)
				buf = 0;
			ans[i - 1] = buf;
		}
		for (int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}

	}

}