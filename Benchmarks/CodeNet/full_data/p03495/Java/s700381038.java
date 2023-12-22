import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int K = sc.nextInt();  
		Integer[] A = new Integer[N+1]; 
        Arrays.fill(A, 0);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<N; i++){
			Integer key = sc.nextInt();
			Integer value = map.get(key);
			if (value == null) value=1;
			else value++;
			map.put(key, value);
		}
		List<Integer> values = new ArrayList<Integer>(map.values());
		Collections.sort(values);
		
		int res = 0;
		for (int i=0; i<values.size()-K; i++) {
			res += values.get(i);
		}		
		System.out.println(res);
	}
		
}
