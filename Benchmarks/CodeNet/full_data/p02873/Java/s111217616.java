import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Pair{
		char c;
		long len;
		Pair(char c , int l){
			this.c = c;
			this.len = l;
		}
		@Override
		public String toString() {
			return c +" " + len;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char c = S.charAt(0);
		int seq = 1;
		List<Pair> ps = new ArrayList<Pair>();
		for(int i = 1 ; i < S.length() ; ++i) {
			if(S.charAt(i) == c) {
				++seq;
			}else {
				ps.add(new Pair(c, seq));
				c = S.charAt(i);
				seq = 1;
			}			
		}
		ps.add(new Pair(c, seq));
//		System.out.println(ps);
		long sum = 0;
		for(int i = 0 ; i < ps.size() ; ++i) {
			Pair p = ps.get(i);
			long s = p.len;
			if(p.c == '>') {
				sum += s * (s + 1) / 2;
				if(i > 0) {
					Pair prev = ps.get(i - 1);
					if(prev.len > p.len) {
						sum += prev.len - p.len;
					}
				}
			}else {
				sum += s * (s - 1) / 2;				
			}
		}
		if(ps.get(ps.size() - 1).c == '<') {
			long s = ps.get(ps.size() - 1).len;
//			sum += s * (s + 1) / 2;
			sum += s;
		}
		System.out.println(sum);
	}
}
