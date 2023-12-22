import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				if(map.containsKey(A[i])) {
					map.put(A[i], map.get(A[i])+1);
				}else {
					map.put(A[i], 1);
				}
			}
			
			ArrayList<Integer>are = new ArrayList<Integer>();
			
			for(Integer key:map.keySet()) {
				if(map.get(key)>=2) {
					if(map.get(key)>=4) {
						are.add(key);
						are.add(key);
					}else {
					are.add(key);
					}
				}
			}
			
			Collections.sort(are, Collections.reverseOrder());
			
			if(are.size()==0||are.size()==1) {
				System.out.println(0);
			}else {
				System.out.println((long)are.get(0)*(long)are.get(1));
			}
			
			
		}
		
		
	}
		

}
