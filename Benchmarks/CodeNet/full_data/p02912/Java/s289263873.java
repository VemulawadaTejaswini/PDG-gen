import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		Long a[] = new Long[n];
		//List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		} 
		Arrays.sort(a, Collections.reverseOrder());
		Long half0 = a[0];
		int count = 0;
		for (int i = 0; i < m; i++) {
			if (count > n) {
				count = 0;
			}
			if (a[count] < half0) {
				Arrays.sort(a, Collections.reverseOrder());
				half0 = a[0];
				count = 0;
			}
			a[count] /= 2;
			count += 1;
		}
		Long answer = 0L;
		for (int i = 0; i < n; i++) {
			answer += (long)a[i];
		}
		System.out.println(answer);
		return;
	}
}