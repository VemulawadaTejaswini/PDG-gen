import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1 };
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (search(ary, a) == search(ary, b)) {
			System.out.println("Draw");
		} else if (search(ary, a) > search(ary, b)) {
			System.out.println("Alice");
		} else {
			System.out.println("Bob");
		}

	}

	public static int search(int[] ary, int s) {
		int ret = -1;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == s) {
				ret = i;
				break;
			}
		}
		return ret;
	}
}