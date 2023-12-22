import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	static int count(int i , int j , TreeSet<Integer> otherPos){
		int k = 2 * j - i;
		int o = otherPos.contains(k) ? 1 : 0;		
		return otherPos.tailSet(j + 1).size() - o;
	}
	static int count2(int i , TreeSet<Integer> pos1 , TreeSet<Integer> pos2){
		int ret = 0;
		for(int j : pos1.tailSet(i)){
			int k = 2 * j - i;
			int o = pos2.contains(k) ? 1 : 0;		
			ret += pos2.tailSet(j).size() - o;
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		TreeSet<Integer> bpos = new TreeSet<Integer>();
		TreeSet<Integer> rpos = new TreeSet<Integer>();
		TreeSet<Integer> gpos = new TreeSet<Integer>();
		for(int i = 0 ; i < N ; ++i){
			if(s.charAt(i) == 'B'){
				bpos.add(i);
			}else if(s.charAt(i) == 'R'){
				rpos.add(i);
			}else{
				gpos.add(i);
			}
		}
//		System.out.println(bpos.size()+" "+rpos.size()+" "+gpos.size());
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			char ci = s.charAt(i);
			if(ci == 'R'){
				ret += count2(i , gpos, bpos);
				ret += count2(i , bpos, gpos);				
			}
			if(ci == 'G'){
				ret += count2(i , rpos, bpos);
				ret += count2(i , bpos, rpos);								
			}
			if(ci == 'B'){
				ret += count2(i , gpos, rpos);
				ret += count2(i , rpos, gpos);												
			}
		}
		System.out.println(ret);
	}
}
