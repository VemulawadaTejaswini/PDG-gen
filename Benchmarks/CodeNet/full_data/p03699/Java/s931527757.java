import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> minQueue = new PriorityQueue<Integer>();
		int n = sc.nextInt(), s = 0;
		while (n-->0) {
			int a = sc.nextInt();
			minQueue.add(a);
			s+=a;
		}
		if (s%10==0) {
			while (!minQueue.isEmpty()) {
				int k = minQueue.poll();
				if ((s-k)%10!=0) {
					System.out.println(s-k); System.exit(0);
				}
				s-=k;
			}
		}
		System.out.println(s);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}