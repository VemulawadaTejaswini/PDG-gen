
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class P implements Comparable<P>{
		int id;
		int order;
		@Override
		public int compareTo(P o) {
			return this.order - o.order;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<P> lst = new ArrayList<P>();
		for(int i = 0 ; i< N ; ++i){
			int ai = sc.nextInt();
			P p = new P();
			p.id = i + 1;
			p.order = ai;
			lst.add(p);			
		}
		Collections.sort(lst);
		StringBuilder ret = new StringBuilder();
		for(P p : lst){
			if(ret.length() > 0){
				ret.append(' ');
			}
			ret.append(p.id);
		}
		System.out.println(ret);	
	}
}
