import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> odMap = new HashMap<>();
		HashMap<Integer, Integer> evMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (i % 2 == 0) {
		        if (evMap.containsKey(x)) {
		            evMap.put(x, evMap.get(x) + 1);
		        } else {
		            evMap.put(x, 1);
		        }
		    } else {
		        if (odMap.containsKey(x)) {
		            odMap.put(x, odMap.get(x) + 1);
		        } else {
		            odMap.put(x, 1);
		        }
		    }
		}
		int oddMax = 0;
		int oddMaxNum = 0;
		int oddNext = 0;
		int oddNextNum = 0;
		for (Map.Entry<Integer, Integer> entry : odMap.entrySet()) {
		    if (oddMax < entry.getValue()) {
		        oddNext = oddMax;
		        oddNextNum = oddMaxNum;
		        oddMax = entry.getValue();
		        oddMaxNum = entry.getKey();
		    } else if (oddNext < entry.getValue()) {
		        oddNext = entry.getValue();
		        oddNextNum = entry.getKey();
		    }
		}
		int evMax = 0;
		int evMaxNum = 0;
		int evNext = 0;
		int evNextNum = 0;
		for (Map.Entry<Integer, Integer> entry : evMap.entrySet()) {
		    if (evMax < entry.getValue()) {
		        evNext = evMax;
		        evNextNum = evMaxNum;
		        evMax = entry.getValue();
		        evMaxNum = entry.getKey();
		    } else if (evNext < entry.getValue()) {
		        evNext = entry.getValue();
		        evNextNum = entry.getKey();
		    }
		}
		int fixed;
		if (oddMaxNum == evMaxNum) {
		    fixed = Math.max(evMax + oddNext, evNext + oddMax);
		} else {
		    fixed = evMax + oddMax;
		}
		System.out.println(n - fixed);
	}
}
