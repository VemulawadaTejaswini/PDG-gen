import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class ABC113C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[M];
		int[] Y = new int[M];
		HashMap<Integer,TreeMap<Integer,Integer>> localGovernment = new  HashMap<>();
		String[] ans = new String[M];
		
		for (int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			localGovernment.computeIfAbsent(P[i], key -> new TreeMap<>()).put(Y[i], i);
		}
		
		localGovernment.forEach((k,v) -> {
			int i = 1; 
			for(Entry<Integer,Integer> tree : v.entrySet()) {
				ans[tree.getValue()] = String.format("%06d", k) + String.format("%06d", i++);
			}
		});
		
		Arrays.stream(ans).forEach(System.out::println);

		sc.close();
	}


}
