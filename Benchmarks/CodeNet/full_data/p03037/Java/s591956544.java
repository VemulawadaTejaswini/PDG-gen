import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int lmax = 0;
		int rmin = n;
		for(i = 0; i < m; i++) {
			lmax = Math.max(lmax, Integer.parseInt(sc.next()));
			rmin = Math.min(rmin, Integer.parseInt(sc.next()));
		}
		sc.close();
		sc = null;
		System.out.println(rmin-lmax+1);
	}
}