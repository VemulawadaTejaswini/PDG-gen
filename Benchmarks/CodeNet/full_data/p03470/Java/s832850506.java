import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=0;i<N;i++) {
			int tmp=Integer.parseInt(sc.next());
			set.add(tmp);
		}
		System.out.println(set.size());
	}
}