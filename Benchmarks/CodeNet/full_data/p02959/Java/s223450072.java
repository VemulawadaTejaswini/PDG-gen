import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] monsters = new int[n + 1];
		for (int i = 0; i <= n; i++) {
		    monsters[i] = sc.nextInt();
		}
		int remain = 0;
		long total = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    total += Math.min(remain, monsters[i]);
		    monsters[i] = Math.max(monsters[i] - remain, 0);
		    total += Math.min(x, monsters[i]);
		    remain = Math.max(x - monsters[i], 0);
		}
		total += Math.min(remain, monsters[n]);
		System.out.println(total);
   }
}
