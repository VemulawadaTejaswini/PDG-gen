import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			long l0 = 2;
			long l1 = 1;
			for (int i = 2; i <= n; i++) {
				long tmp = l1;
				l1 += l0;
				l0 = tmp;
			}
			System.out.println(l1);
		}
	}
}