import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (chk(x)==chk(y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static int chk(int i) {
		Set<Integer> seta = new HashSet<>();
		Set<Integer> setb = new HashSet<>();
		seta.add(1);
		seta.add(3);
		seta.add(5);
		seta.add(7);
		seta.add(8);
		seta.add(10);
		seta.add(12);
		setb.add(4);
		setb.add(6);
		setb.add(9);
		setb.add(11);
		if (seta.contains(i)) {
			return 0;
		} else if (setb.contains(i)) {
			return 1;
		}
		return 2;
	}
}
