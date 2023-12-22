import java.util.*;

public class Main {
	public static void main(String[] args){
		int MAX = 5637;
		int p[] = new int[MAX];
		int cnt = 0;
		for (int i = 0; i <= 55555; i++) {
			if (isPrime(i)) {
				p[cnt++] = i;
			}
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		a[0] = 2;

		for (int i = 1; i < MAX - 3; i++) {
			for (int j = 1; j < n; j++) {
				a[j] = p[i + j - 1];
			}
			boolean flag = true;
			for (int q = 1; q < n - 4; q++) {
				for (int r = q + 1; r < n - 3; r++) {
					for (int s = r + 1; s < n - 2; s++) {
						for (int t = s + 1; t < n - 1; t++) {
							for (int u = t + 1; u < n; u++) {
								if (isPrime(a[q] + a[r] + a[s] + a[t] + a[u])) {
									flag = false;
									break;
								}
							}
							if (!flag) {
								break;
							}
						}
						if (!flag) {
							break;
						}
					}
					if (!flag) {
						break;
					}
				}
				if (!flag) {
					break;
				}
			}
			if (flag) {
				String[] sa = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
				String result = String.join(" ", sa);
				System.out.println(result);
				return;
			} else {
				continue;
			}
		}
  }

	private static boolean isPrime(int x) {
		if (x == 0 || x == 1) {
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
