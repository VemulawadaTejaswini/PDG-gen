import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.valueOf(sc.next());

		int v[] = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.valueOf(sc.next());
		}
		int a = 0;
		for (int i = 0; i < v.length; i++) {
			int c = Integer.valueOf(sc.next());
			if (c < v[i]) {
				a = a + v[i] - c;
			}
		}
		System.out.println(a);
	}

}
