import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		
		Map<Integer, Integer> odds = new HashMap<>();
		
		Map<Integer, Integer> evens = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			Integer vi = Integer.parseInt(sc.next());
			if(i % 2 == 1) {
				Integer val = odds.get(vi);
				if(val == null) {
					odds.put(vi, 1);
				} else {
					odds.put(vi, val + 1);
				}
			} else {
				Integer val = evens.get(vi);
				if(val == null) {
					evens.put(vi, 1);
				} else {
					evens.put(vi, val + 1);
				}
			}
		}
		
		List<Integer> sortedOddKeys = new ArrayList<>();
		odds.entrySet().stream()
			.sorted(java.util.Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.limit(2)
			.forEach(x -> sortedOddKeys.add(x.getKey()));
		
		List<Integer> sortedEvenKeys = new ArrayList<>();
		evens.entrySet().stream()
			.sorted(java.util.Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.limit(2)
			.forEach(x -> sortedEvenKeys.add(x.getKey()));
		
		Integer maxOddKey = sortedOddKeys.get(0);
		Integer maxEvenKey = sortedEvenKeys.get(0);
		
		int maxOddVal = odds.get(maxOddKey);
		int maxEvenVal = evens.get(maxEvenKey);
		
		int minusSum = maxOddVal + maxEvenVal;
		if(maxOddKey == maxEvenKey) {
			int secondMaxOddVal = 0;
			if(sortedOddKeys.size() >= 2) {
				secondMaxOddVal = odds.get(sortedOddKeys.get(1));
			}
			
			int secondMaxEvenVal = 0;
			if(sortedEvenKeys.size() >= 2) {
				secondMaxEvenVal = evens.get(sortedEvenKeys.get(1));
			}
			
			int o1PlusE2 = maxOddVal + secondMaxEvenVal;
			int o2PlusE1 = secondMaxOddVal + maxEvenVal;
			
			if(o1PlusE2 > o2PlusE1) {
				minusSum = o1PlusE2;
			} else {
				minusSum = o2PlusE1;
			}
		}
		
		int answer = odds.entrySet().stream()
				.mapToInt(x -> x.getValue())
				.sum();
		answer += evens.entrySet().stream()
				.mapToInt(x -> x.getValue())
				.sum();
		answer -= minusSum;
		
		System.out.println(answer);
	}
}
