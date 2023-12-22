import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int cnt = 0;
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		LinkedList<Character> r = new LinkedList<>();
		LinkedList<Character> l = new LinkedList<>();
		for(int i = 0; i < q; i++) {
			char t = sc.next().charAt(0);
			if(sc.next().equals("L")){
				l.addFirst(t);
			}
			else r.addFirst(t);
		}
		int lcnt = 0;
		for(char i : l) {
			if(i == s.charAt(lcnt)) {
				lcnt++;
			}
		}
		int rcnt = 0;
		for(char i : r) {
			if(i == s.charAt(n - rcnt - 1)) {
				rcnt++;
			}
		}
		System.out.println(n - rcnt - lcnt);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
