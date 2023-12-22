import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, NN;
	Integer[] S;
	TreeSet<Slime> slimes;
	Slime[] indexed;
	Comparator<Slime> hier;
	
	static class Slime {
		int id, val;
		Slime(int id) {
			this.id = id;
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
		hier = Comparator.comparingInt( (Slime s) -> (0x7fffffff & (-lsb(s.id))) ).
				thenComparingInt( s -> countOnes(s.id) ).
				thenComparingInt( s -> s.id );
	}
	
	private void calc() {
		N = sc.nextInt();
		NN = 1<<N;
		S = new Integer[NN];
		for (int i = 0; i < NN; i++) S[i] = sc.nextInt();
		Arrays.sort(S, Comparator.reverseOrder());
		slimes = new TreeSet<Slime>(hier);
		indexed = new Slime[NN];
		for (int i = 0; i < NN; i++) {
			indexed[i] = new Slime(i);
			slimes.add(indexed[i]);
		}
		
		Iterator<Slime> it = slimes.iterator();
		it.next().val = S[0];
		it.remove();
		int j = 1;
		while (!slimes.isEmpty()) {
			Slime s = it.next();
			Slime parent = indexed[s.id ^ lsb(s.id)];
			if (parent.val > S[j]) {
				s.val = S[j++];
				it.remove();
				it = slimes.iterator();
				continue;
			}
			if ((s.id & 1) == 1) {
				System.out.println("No");
				return;
			}
			//it = slimes.tailSet(indexed[lsb(s.id)>>>1], true).iterator();
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
