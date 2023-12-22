
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int sum = 0;
		ArrayList<Integer> w = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			w.add(sc.nextInt());
			sum += w.get(i);
		}

		int l = w.get(0);
		int r = sum - w.get(0);
		int ans = Math.abs(l-r);
		for(int i=1; i<N-1; i++) {
			l += w.get(i);
			r -= w.get(i);
			ans = Math.min(ans, Math.abs(l-r));
		}
		System.out.println(ans);
		sc.close();
	}
}
