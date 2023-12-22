import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		long[] sums = new long[n + 1];
		long[] checks = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    sums[i] = sums[i - 1] + sc.nextInt();
		    checks[i] = sums[i] - k * i;
		}
		ArrayList<Long> list = new ArrayList<>();
		list.add(Long.MIN_VALUE);
		list.add(Long.MAX_VALUE);
		long total = 0;
		for (int i = n; i >= 0; i--) {
		    int left = 0;
		    int right = list.size();
		    while (right - left > 1) {
		        int m = (left + right) / 2;
		        if (list.get(m) >= checks[i]) {
		            right = m;
		        } else {
		            left = m;
		        }
		    }
		    total += list.size() - right - 1;
		    list.add(right, checks[i]);
		}
	    System.out.println(total);
    }
}

