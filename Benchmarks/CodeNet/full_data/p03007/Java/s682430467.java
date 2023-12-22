import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		int sum=0;
		int all_plus=0;
		int all_minus=0;
		for (int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			sum+=Math.abs(A[i]);
		}
		Arrays.sort(A);

		Queue<Integer> plus = new ArrayDeque<Integer>();
		Queue<Integer> minus = new ArrayDeque<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		for (int i=0;i<N;i++) {
			if (A[i]>0) {
				plus.add(A[i]);
				all_plus=1;
			} else {
				list.add(A[i]);
				all_minus=1;
			}
		}
		Collections.reverse(list);
		for (int i=0;i<list.size();i++) {
			minus.add(list.get(i));
		}
		if (all_plus==0) {
			sum+=2*minus.peek();
		} else if (all_minus==0) {
			sum-=2*plus.peek();
		}
		System.out.println(sum);

		if (plus.isEmpty()) {
			int tmp=minus.remove();
			int tmp_2=minus.remove();
			System.out.print(tmp);
			System.out.print(" ");
			System.out.println(tmp_2);
			plus.add(tmp-tmp_2);
		}
		if (minus.isEmpty()) {
			int tmp=plus.remove();
			int tmp_2=plus.remove();
			System.out.print(tmp);
			System.out.print(" ");
			System.out.println(tmp_2);
			minus.add(tmp-tmp_2);
		}

		while (plus.size()>1) {
			int tmp=plus.remove();
			int tmp_2=minus.remove();
			System.out.print(tmp_2);
			System.out.print(" ");
			System.out.println(tmp);
			minus.add(tmp_2-tmp);
		}

		while (!minus.isEmpty()) {
			int tmp=plus.remove();
			int tmp_2=minus.remove();
			System.out.print(tmp);
			System.out.print(" ");
			System.out.println(tmp_2);
			plus.add(tmp-tmp_2);
		}
	}
}