import java.util.*;

// ARC 84-A
// https://beta.atcoder.jp/contests/arc084/tasks/arc084_a

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		ArrayList<Integer> D = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 5));
//		System.out.println(indexOf(D, 5));
//		if (true) {
//			return;
//		}
		
		int N = in.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		TreeSet<Integer> bSet = new TreeSet<Integer>();
		TreeSet<Integer> cSet = new TreeSet<Integer>();
		
		for (int i = 0; i < N; i++) {
			A.add(in.nextInt());
		}
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			B.add(n);
			bSet.add(n);
		}
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			C.add(n);
			cSet.add(n);
		}

		A.sort(null);
		B.sort(null);
		C.sort(null);
		
		long[] temp = new long[N];
		HashMap<Integer, Integer> chash = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			Integer c = cSet.higher(B.get(i));
			
			if (c != null) {
				int index = -1;
				if (chash.containsKey(c)) {
					index = chash.get(c);
				} else {
					index = indexOf(C, c);
					chash.put(c, index);
				}
				temp[i] = N - index;
			} else {
				temp[i] = 0;
			}
		}
		
		for (int i = N - 2; i >= 0; i--) {
			temp[i] += temp[i + 1];
		}
		
		long answer = 0;
		HashMap<Integer, Integer> bhash = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			Integer b = bSet.higher(A.get(i));
			
			if (b != null) {
				int index = -1;
				if (bhash.containsKey(b)) {
					index = bhash.get(b);
				} else {
					index = indexOf(B, b);
					bhash.put(b, index);
				}
				answer += temp[index];
			}
		}
		System.out.println(answer);
	}
	
	public static int indexOf(ArrayList<Integer> arr, int n) {
		int low = 0;
		int high = arr.size() - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr.get(mid) == n) {
				while (mid - 1 >= 0 && arr.get(mid - 1) == arr.get(mid)) {
					mid--;
				}
				return mid;
			} else if (arr.get(mid) < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}