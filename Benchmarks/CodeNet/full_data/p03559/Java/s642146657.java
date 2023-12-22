import java.util.*;

// ARC 84-A
// https://beta.atcoder.jp/contests/arc084/tasks/arc084_a

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

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
		Integer prec = -1;
		for (int i = 0; i < N; i++) {
			Integer c = null;
//			Integer c = cSet.higher(B.get(i));
			if (prec > B.get(i)) {
				c = prec;
			} else {
				c = cSet.higher(B.get(i));
			}
			
			if (c != null) {
				int index = C.indexOf(c);
				temp[i] = N - index;
				prec = c;
			} else {
				temp[i] = 0;
			}
		}
		
		for (int i = N - 2; i >= 0; i--) {
			temp[i] += temp[i + 1];
		}
		
		long answer = 0;
		Integer preb = -1;
		for (int i = 0; i < N; i++) {
			Integer b = null;
//			Integer b = bSet.higher(A.get(i));
			if (preb > A.get(i)) {
				b = preb;
			} else {
				b = bSet.higher(A.get(i));
			}
			
			if (b != null) {
				int index = B.indexOf(b);
				answer += temp[index];
				preb = b;
			}
		}
		System.out.println(answer);
	}
}