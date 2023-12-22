import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		int[] D = new int[N];
		for(int k=0;k<N;k++) {
			A[k] = sc.nextInt();
			B[k] = sc.nextInt();
		}
		for(int k=0;k<N;k++) {
			C[k] = sc.nextInt();
			D[k] = sc.nextInt();
		}
		// 出力
		System.out.println(solve(A,B,C,D));
		sc.close();
	}
	
	public static String solve(int[] A, int[] B, int[] C, int[] D) {
		int N = A.length;
		List<List<Integer>> ok_blues = new ArrayList<>();
		PriorityQueue<List<Integer>> q = new PriorityQueue<>((a,b)-> a.size()-b.size());
		for(int k=0;k<N;k++) {
			List<Integer> okps = new ArrayList<>();
			for(int l=0;l<N;l++) {
				if(A[k] < C[l] && B[k] < D[l]) {
					okps.add(l);
				}
			}
			ok_blues.add(okps);
			q.add(okps);
		}
		//System.out.println(ok_blues);
		int ret = use_blue(q);
		return String.format("%d", ret);
	}
	private static int use_blue(PriorityQueue<List<Integer>> q) {
//		System.out.println("queue:" + q);
		List<Integer> p = q.poll();
		if(p == null) {
			return 0;
		}
		while(p.isEmpty() && !q.isEmpty()) {
			p = q.poll();
		}
		int max=0;
		int cnt = use_blue(new PriorityQueue<>(q));
		if(cnt > max) {
			max = cnt;
		}
//		System.out.println("---");
		for(Integer k : p) {
			PriorityQueue<List<Integer>> next = new PriorityQueue<>((a,b)-> a.size()-b.size());
			q.forEach((list) -> {
				List<Integer> newL = new ArrayList<Integer>(list);
				newL.remove(new Integer(k));
				next.add(newL);
			});
//			System.out.println("next:" + next);
			int tgt = use_blue(next)+1;
			if(tgt > max) {
				max = tgt;
			}
		}
		return max;
	}

}
