

import java.util.*;

public class Main {
	
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		System.out.println(getMax(list));
		
	}
	
	public static long getMax(List<Integer> li) {
		long c = 0;
		
		for(int i=0; i<li.size()-1; i++) {
			long max = 0;
			for(int j = i+1; j<li.size(); j++) {
				long v = li.get(i) + li.get(j);
				if((v & (v-1)) == 0) {
					long m = 1 + getMax(sublist(i,j,li));
					max = Math.max(max, m);
				}
			}
			c = max;
		}
		return c;
		
	}
	
	public static List<Integer> sublist(int i, int j, List<Integer> l){
		ArrayList<Integer> tmp = new ArrayList<>();
		for (int a : l) {
			tmp.add(a);
		}
		tmp.remove(i);
		tmp.remove(j-1);
		return tmp;
	}

}
