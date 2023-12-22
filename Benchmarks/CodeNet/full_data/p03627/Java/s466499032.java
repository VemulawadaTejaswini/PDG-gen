import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(map.containsKey(A)) {
				map.put(A, map.get(A) + 1);
			}else {
				map.put(A, 1);
			}
		}
		ArrayList<Integer> cand = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> f : map.entrySet()) {
			if(f.getValue() >= 2) {
				cand.add(f.getKey());
				if(f.getValue() >= 4) cand.add(f.getKey());
			}
		}
		Collections.sort(cand);
		Collections.reverse(cand);
		if(cand.size() < 2) System.out.println(0);
		else System.out.println(cand.get(0) * cand.get(1));
	}
}