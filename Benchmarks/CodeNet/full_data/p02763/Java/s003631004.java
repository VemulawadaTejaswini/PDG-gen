import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static class InvertedIndex{		
		String v;
		TreeSet<Integer> ts;
		public InvertedIndex(String v) {
			this.v = v;
			ts = new TreeSet<Integer>();
		}
		void add(int idx){
			ts.add(idx);
		}
		boolean contain(int idx){
			return ts.contains(idx);
		}
		void remove(int idx){
			ts.remove(idx);
		}
		boolean contain(int l , int r){
			return !ts.subSet(l, true, r, true).isEmpty();
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int Q = sc.nextInt();
		InvertedIndex iss[] = new InvertedIndex[26];
		for(int i = 0 ; i < iss.length ; ++i){
			iss[i] = new InvertedIndex(String.valueOf(((char)(i + 'a'))));
		}
		for(int i = 0 ; i < S.length() ; ++i){
			char c = S.charAt(i);
			iss[c - 'a'].add(i);
		}
		for(int q = 0 ; q < Q ; ++q){
			int type = sc.nextInt();
			if(type == 1){
				int i = sc.nextInt() - 1;
				for(InvertedIndex is : iss){
					if(is.contain(i)){
						is.remove(i);
					}
				}
				char c = sc.next().charAt(0);
				iss[c - 'a'].add(i);
			}else{
				int l = sc.nextInt() - 1;
				int r = sc.nextInt() - 1;
				int cnt = 0;
				for(InvertedIndex is : iss){
					if(is.contain(l , r)){
						++cnt;
					}
				}
				System.out.println(cnt);
			}
		}
	}
}
