import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] ans = new int[N];
		for (int i=0;i<N;i++) {
			int tmp = Integer.parseInt(sc.next());
			ans[tmp-1] = i+1;
		}
		for (int i=0;i<N;i++) {
			System.out.print(ans[i] + " ");
		}
	}
}