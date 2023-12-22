import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int[] c = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		Arrays.sort(c);
		System.out.println(c[0]+c[1]);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}