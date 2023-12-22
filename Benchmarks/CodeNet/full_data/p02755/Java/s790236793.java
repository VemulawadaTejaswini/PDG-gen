import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		boolean found = false;
		int i;
		for (i = 1; i <= 1000; i++) {
			if ((int) Math.floor(i * 0.08) == a && (int) Math.floor(i * 0.1) == b) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(i);
		} else {
			System.out.println(-1);
		}
	}
}