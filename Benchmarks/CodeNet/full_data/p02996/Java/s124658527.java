import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.a = sc.nextInt();
			o.b = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Arrays.sort(arr, (o1, o2) -> o1.b - o2.b);
		long now = 0;
		for (Obj o : arr) {
			now += o.a;
			if (now > o.b) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	static class Obj {
		int a, b;
	}
}
