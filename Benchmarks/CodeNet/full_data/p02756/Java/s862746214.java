import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	String S;
	Deque<Byte> que;
	int Q;
	boolean inverse;
	
	void calc() {
		sc = new Scanner(System.in);
		S = sc.next();
		que = new ArrayDeque<>();
		for (int i = 0; i < S.length(); i++)
			que.addLast( (byte)(S.charAt(i)) );
		Q = sc.nextInt();
		inverse = false;
		
		for (int i = 0; i < Q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				inverse = !inverse;
			} else {
				boolean addFirst = (sc.nextInt() == 1);
				byte c = (byte)sc.next().charAt(0);
				if (inverse^addFirst) que.addLast(c);
				else que.addFirst(c);
			}
		}
		char[] ans = new char[que.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = (char)((inverse)?que.removeFirst():que.removeLast()).byteValue();
		}
		
		System.out.println(new String(ans));
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}

