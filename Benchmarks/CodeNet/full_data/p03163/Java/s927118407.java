import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		final int N = sc.nextInt();
		final int LIM = sc.nextInt();
		int[] W = new int[N];
		int[] V = new int[N];
		Map<Integer, Map<Integer, Integer>> treeMap = new TreeMap<>(Collections.reverseOrder());
		for(int i =0; i<N;i++) {
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
			treeMap.putIfAbsent(V[i], new TreeMap<Integer, Integer>());
			int count = treeMap.get(V[i]).getOrDefault(W[i], 0)+1;
			treeMap.get(V[i]).put(W[i], count);
		}
		long value_sum = 0;
		long weight_sum = 0;
		
		for(Map.Entry<Integer, Map<Integer, Integer>> entry: treeMap.entrySet()) {
			int value = entry.getKey();
			for(Map.Entry<Integer, Integer> innerEntry: entry.getValue().entrySet()) {
				int count = innerEntry.getValue();
				int weight = innerEntry.getKey();
				while(weight_sum<LIM&&count>0) {
					if(weight+weight_sum<=LIM) {
						count--;
						value_sum+=value;
						weight_sum+=weight;
					}
					else {
						break;
					}
				}
		}
		}
		pw.println(value_sum);
		
		// end

		sc.close();
		pw.close();
	}
}
