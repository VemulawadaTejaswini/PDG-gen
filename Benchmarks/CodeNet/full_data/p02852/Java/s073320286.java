import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	int N, M;
	String S;
	Deque<Integer> d;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		S = sc.next();
		d = new ArrayDeque<>();
		
		int p = N;
		while (p > 0) {
			int dice = Math.min(M, p);
			for (; dice > 0; dice--) if (S.charAt(p-dice) == '0') break;
			if (dice == 0) break;
			p -= dice;
			d.addFirst(dice);
		}
		if (p > 0) System.out.println(-1);
		else {
			System.out.println(d.stream().map(String::valueOf).collect(Collectors.joining(" ")));
		}
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
