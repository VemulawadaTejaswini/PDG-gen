import java.util.Scanner;

public class Main {

	static int n;
	static long counter;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		count(0, 0);
		System.out.println(counter);
		in.close();
	}

	static void count(long cur, int use) {
		System.out.println(Integer.toBinaryString(use));
		System.out.println(Integer.toBinaryString(1 & 1));
		if (cur > n)
			return;
		if (use == 0b111)
			++counter;

		count(cur * 10 + 7, use | 0b001);

		count(cur * 10 + 5, use | 0b010);

		count(cur * 10 + 3, use | 0b100);
	}
}