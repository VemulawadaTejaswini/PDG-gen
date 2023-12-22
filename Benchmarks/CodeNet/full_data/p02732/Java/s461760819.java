import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] aArray = new int[n];
			Map<Integer, Integer> countMap = new HashMap<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				int current = aArray[i];
				if ( countMap.containsKey(current)) {
					countMap.put(current, countMap.get(current) + 1);
				}
				else {
					countMap.put(current, 1);
				}
			}
			
			Set<Integer> keys = countMap.keySet();
			
			//calc total first
			long total = 0;
			for(int key : keys) {
				int count = countMap.get(key);
				total += count * (count -1) / 2;
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				int current = aArray[i];

				int count = countMap.get(current);
				
				long ans = total - (count * (count-1) / 2) + ((count-1) * (count-2)/2);
				
				System.out.println(ans);
			}
			
			
		}
	}

}