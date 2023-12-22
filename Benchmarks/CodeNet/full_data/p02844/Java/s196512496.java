import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static class Index{
		TreeSet<Integer> lst;
		public Index() {
			lst = new TreeSet<Integer>();
		}
		void add(int ind){
			lst.add(ind);
		}
		int next(int ind){
			if(lst.higher(ind) == null){
				return -1;
			}
			return lst.higher(ind);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		Index inds[] = new Index[10];
		for(int i = 0 ; i < inds.length ; ++i){
			inds[i] = new Index();
		}
		for(int i = 0 ; i < S.length() ; ++i){
			char c = S.charAt(i);
			int v = c - '0';
			inds[v].add(i);
		}
		int cnt = 0;
		for(int i = 0 ; i <= 999 ; ++i){
			int i0 = (i / 100);
			int i1 = (i /10) % 10;
			int i2 = i % 10;
			int n0 = inds[i0].next(-1);
			if(n0 < 0){
				continue;
			}
			int n1 = inds[i1].next(n0);
			if(n1 < 0){
				continue;
			}		
			int n2 = inds[i2].next(n1);
			if(n2 < 0){
				continue;
			}	
			++cnt;
//			System.out.println(i);
		}
		System.out.println(cnt);
	}
}
