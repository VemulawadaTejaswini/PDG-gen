import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int[] I_753 = { 3, 5, 7 };
		final int N = sc.nextInt();
		int cnt = 0;
		if (N < 100) {
			System.out.println(cnt);
			return;
		}

		ArrayList<Integer> list = new ArrayList<>();
		int keta = Integer.toString(N).length();
		list.add(3);
		list.add(5);
		list.add(7);
		int time = 10;
		for (int i = 1; i < keta; i++) {
			ArrayList<Integer> l = new ArrayList<>();
			for (int n : list) {
				for (int e : I_753) {
					l.add(n + e * time);
				}
			}
			list.addAll(l);
			time *= 10;
		}
		for (int n:list) {
			if (n<=N && is753Number(n)) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}

	private boolean is753Number(int x) {
		boolean three = false;
		boolean five = false;
		boolean seven = false;
		while (x > 0) {
			int mod = x % 10;
			switch (mod) {
			case 3:
				three = true;
				break;
			case 5:
				five = true;
				break;
			case 7:
				seven = true;
				break;
			default:
				return false;
			}
			x /= 10;
		}
		return three && five && seven;
	}
}
