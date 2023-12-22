import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		TreeSet<Long> shrines = new TreeSet<>();
		shrines.add(Long.MAX_VALUE / 10);
		shrines.add(Long.MIN_VALUE / 10);
		for (int i = 0; i < a; i++) {
		    shrines.add(sc.nextLong());
		}
		TreeSet<Long> temples = new TreeSet<>();
		temples.add(Long.MAX_VALUE / 10);
		temples.add(Long.MIN_VALUE / 10);
		for (int i = 0; i < b; i++) {
		    temples.add(sc.nextLong());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    long min = Long.MAX_VALUE;
		    long x = sc.nextLong();
		    long befS = shrines.floor(x);
		    min = Math.min(min, Math.abs(befS - temples.floor(befS)) + Math.abs(x - befS));
		    min = Math.min(min, Math.abs(befS - temples.ceiling(befS)) + Math.abs(x - befS));
		    long afS = shrines.ceiling(x);
		    min = Math.min(min, Math.abs(afS - temples.floor(afS)) + Math.abs(x - afS));
		    min = Math.min(min, Math.abs(afS - temples.ceiling(afS)) + Math.abs(x - afS));
		    long befT = temples.floor(x);
		    min = Math.min(min, Math.abs(befT - shrines.floor(befT)) + Math.abs(x - befT));
		    min = Math.min(min, Math.abs(befT - shrines.ceiling(befT)) + Math.abs(x - befT));
		    long afT = temples.ceiling(x);
		    min = Math.min(min, Math.abs(afT - shrines.floor(afT)) + Math.abs(x - afT));
		    min = Math.min(min, Math.abs(afT - shrines.ceiling(afT)) + Math.abs(x - afT));
		    sb.append(min).append("\n");
		}
	    System.out.print(sb);
   }
}


