import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt(), Y = scn.nextInt();
		int A = scn.nextInt(), B = scn.nextInt(), C = scn.nextInt();
		PriorityQueue<Integer> hpA = new PriorityQueue<>((Integer o1, Integer o2) -> (-Integer.compare(o1, o2)));
		PriorityQueue<Integer> hpB = new PriorityQueue<>((Integer o1, Integer o2) -> (-Integer.compare(o1, o2)));
		PriorityQueue<Integer> hpC = new PriorityQueue<>((Integer o1, Integer o2) -> (-Integer.compare(o1, o2)));
		for (int i = 0; i < A; i++) {
			hpA.add(scn.nextInt());
		}
		for (int i = 0; i < B; i++) {
			hpB.add(scn.nextInt());
		}
		for (int i = 0; i < C; i++) {
			hpC.add(scn.nextInt());
		}
		System.out.println(apples(X, Y, hpA, hpB, hpC));

	}

	public int compare(Integer o1, Integer o2) {
		return -Integer.compare(o1, o2);
	}

	public static long apples(int X, int Y, PriorityQueue<Integer> hpA, PriorityQueue<Integer> hpB,
			PriorityQueue<Integer> hpC) {
		long ans = 0;
		while (X != 0 || Y != 0) {
			if (X != 0) {
				if (hpA.peek() > hpC.peek())
					ans += hpA.remove();
				else
					ans += hpC.remove();
				X--;
			}
			if (Y != 0) {
				if (hpB.peek() > hpC.peek())
					ans += hpB.remove();
				else
					ans += hpC.remove();
				Y--;
			}
		}
		return ans;
	}

}
