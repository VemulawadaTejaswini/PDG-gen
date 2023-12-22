import java.util.*;

// ARC 82-D
// https://beta.atcoder.jp/contests/arc082/tasks/arc082_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			
			if (count.containsKey(n)) {
				int c = count.get(n);
				count.put(n, c + 1);
			} else {
				count.put(n, 1);
				nums.add(n);
			}
		}
		
		nums.sort(null);
		
		int largest = -1;
		int secondLargest = -1;
		
		int index = nums.size() - 1;
		
		while (index >= 0 && (largest == -1 || secondLargest == -1)) {
			int len = nums.get(index);
			int lenCount = count.get(len);
			
			if (lenCount >= 4) {
				if (largest == -1) {
					largest = len;
					secondLargest = len;
				} else {
					secondLargest = len;
				}
			} else if (lenCount >= 2) {
				if (largest == -1) {
					largest = len;
				} else {
					secondLargest = len;
				}
			}
			
			index--;
		}
		
		if (largest != -1 && secondLargest != -1) {
			System.out.println(largest * secondLargest);
		} else {
			System.out.println(-1);
		}
	}
}
