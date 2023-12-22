import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, NN;
	Integer[] S;
	TreeSet<Slime> slimes;
	Slime[] indices;
	Comparator<Slime> comp =
		Comparator.comparingInt( (Slime s) -> (0x7fffffff & (-lsb(s.id))) ).
			thenComparingInt( s -> countOnes(s.id) ).
			thenComparingInt( s -> s.id );
	
	static class Slime {
		int id, val;
		Slime(int id) {
			this.id = id;
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		NN = 1<<N;
		S = new Integer[NN];
		for (int i = 0; i < NN; i++) S[i] = sc.nextInt();
		Arrays.sort(S, Comparator.reverseOrder());
		slimes = new TreeSet<Slime>(comp);
		indices = new Slime[NN];
		for (int i = 0; i < NN; i++) indices[i] = new Slime(i);
		List<Slime> next = new ArrayList<>();
		for (int l = (NN >>> 1); l > 0; l = l >>> 1) slimes.add(indices[l]);
		Iterator<Slime> it = slimes.iterator();
		indices[0].val = S[0];
	lp:
		for (int j = 1; j < NN; j++) {
			if (S[j-1] != S[j]) {
				slimes.addAll(next);
				next.clear();
				it = slimes.iterator();
			}
			while (it.hasNext()) {
				Slime s = it.next();
				if (indices[s.id ^ lsb(s.id)].val > S[j]) {
					s.val = S[j];
					it.remove();
					for (int l = (lsb(s.id) >>> 1); l > 0; l = l >>> 1)
						next.add(indices[s.id | l]);
					continue lp;
				}
			}
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
	
	static int countOnes(int t) {
		t = (t & 0x55555555) + (t >> 1 & 0x55555555);
		t = (t & 0x33333333) + (t >> 2 & 0x33333333);
		t = (t & 0x0f0f0f0f) + (t >> 4 & 0x0f0f0f0f);
		t = (t & 0x00ff00ff) + (t >> 8 & 0x00ff00ff);
		return (t & 0x0000ffff) + (t >>16 & 0x0000ffff);
	}
	
	static int lsb(int t) {
		return t&(-t);
	}
	public static void main(String[] args) {
		new Main().calc();
	}
}
