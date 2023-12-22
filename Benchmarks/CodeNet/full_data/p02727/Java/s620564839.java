import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt(), Y = scn.nextInt();
		int A = scn.nextInt(), B = scn.nextInt(), C = scn.nextInt();
		heap_max hpA = new heap_max();
		heap_max hpB = new heap_max();
		heap_max hpC = new heap_max();
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

	public static long apples(int X, int Y, heap_max hpA, heap_max hpB, heap_max hpC) {
		long ans = 0;
		while (X != 0 || Y != 0) {
			if (X != 0) {
				if (hpA.get() > hpC.get())
					ans += hpA.remove();
				else
					ans += hpC.remove();
				X--;
			}
			if (Y != 0) {
				if (hpB.get() > hpC.get())
					ans += hpB.remove();
				else
					ans += hpC.remove();
				Y--;
			}
		}
		return ans;
	}

}
public class Main {
	ArrayList<Integer> data = new ArrayList<>();

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return data.size() == 0;
	}

	public void add(int item) {

		data.add(item);
		UpHeapify(data.size() - 1);

	}

	private void UpHeapify(int ci) {

		if (ci < 0)
			return;
		int pi = (ci - 1) / 2;
		if (data.get(ci) > data.get(pi)) {
			swap(ci, pi);
			UpHeapify(pi);
		}

	}

	public int remove() {

		int ith = data.get(0);
		int jth = data.get(data.size() - 1);
		data.set(0, jth);
		data.set(data.size() - 1, ith);
		int temp = data.remove(data.size() - 1);
		DownHeapify(0);
		return temp;
	}

	private void DownHeapify(int pi) {
		int ilc = 2 * pi + 1;
		int rlc = 2 * pi + 2;
		int mini = pi;
		if (ilc < data.size() && data.get(ilc) > data.get(mini)) {
			mini = ilc;
		}
		if (rlc < data.size() && data.get(rlc) > data.get(mini)) {
			mini = rlc;
		}
		if (mini != pi) {
			swap(pi, mini);
			DownHeapify(mini);
		}
	}

	public int get() {
		return data.get(0);
	}

	private void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
	}

	public void display() {
		System.out.println(data);
	}
}