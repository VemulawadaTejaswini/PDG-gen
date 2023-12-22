import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Obj[] array = new Obj[m];
		for (int i = 0; i < m; i++) {
			Obj o = new Obj();
			o.a = sc.nextInt();
			o.b = sc.nextInt();
			array[i] = o;
		}
		sc.close();

		Arrays.sort(array, new Comparator<Obj>() {
			public int compare(Obj o1, Obj o2) {
				return o1.b - o2.b;
			}
		});

		int ans = 1;
		int br = array[0].b;
		for (int i = 1; i < m; i++) {
			if (array[i].a >= br) {
				ans++;
				br = array[i].b;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int a, b;
	}
}
