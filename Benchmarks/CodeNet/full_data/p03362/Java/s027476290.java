import java.util.*;

public class Main {
	public static void main(String[] args){
		int MAX = 5637;
		int p[] = new int[MAX];
		int cnt = 0;
		for (int i = 0; i <= 55555; i++) {
			if (isPrimeFive(i)) {
				p[cnt++] = i;
			}
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = p[i];
		}

		String[] sa = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
		String result = String.join(" ", sa);
		System.out.println(result);
  }

	private static boolean isPrimeFive(int x) {
		if (x == 0 || x == 1) {
			return false;
		}
		if (x % 5 != 1) {
			return false;
		}
		for (int i = 2; i*i <= x; i++) {
				if (x % i == 0) {
					return false;
				}
		}
		return true;
	}
}
