import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long sum = 0;
		int[] members = new int[n];
		for (int i = 0; i < n; i++) {
		    members[i] = sc.nextInt();
		    sum += members[i];
		}
		if (sum <= k) {
		    System.out.println(0);
		    return;
		}
		Arrays.sort(members);
		int[] foods = new int[n];
		for (int i = 0; i < n; i++) {
		    foods[i] = sc.nextInt();
		}
		Arrays.sort(foods);
		long left = 0;
		long right = Long.MAX_VALUE / 10;
		while(right - left > 1) {
		    long m = (left + right) / 2;
		    long total = 0;
		    for (int i = 0; i < n; i++) {
		        total += Math.max(members[n - i - 1] - m / foods[i], 0);
		    }
		    if (total <= k) {
		        right = m;
		    } else {
		        left = m;
		    }
		}
		System.out.println(right);
    }
}
