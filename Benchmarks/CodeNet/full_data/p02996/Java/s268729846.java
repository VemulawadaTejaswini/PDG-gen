import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<AB> ab = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ab.add(new AB(s.nextInt(), s.nextInt()));
		}

		ab.sort((obja, objb) -> obja.b - objb.b);
		for (AB e : ab) {
			System.out.println(e.b);
		}

		System.out.println((calc(ab) ? "Yes" : "No"));
	}

	public static boolean calc(List<AB> rests) {
		int time = 0;
		for (AB e : rests) {
			time += e.a;
			if (time > e.b) {
				return false;
			}
		}
		return true;
	}

	static class AB {
		final private int a;
		final private int b;

		public AB(int ina, int inb) {
			this.a = ina;
			this.b = inb;
		}
	}
}
