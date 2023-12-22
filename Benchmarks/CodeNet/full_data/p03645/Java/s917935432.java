import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String[] nico = sc.nextLine().split(" ");
		int n = Integer.parseInt(nico[0]);
		int m = Integer.parseInt(nico[1]);

		String ans = "IMPOSSIBLE";
		
		ArrayList<Integer> middle = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			String[] tmp = sc.nextLine().split(" ");
			int t0 = Integer.parseInt(tmp[0]);
			int t1 = Integer.parseInt(tmp[1]);
			
			if ((t0 != 1) && (t0 != n) && (t1 != 1) && (t1 != n)) continue;

			if ((t0 == 1) || (t0 == n)) {
				if (middle.contains(t1)) {
					ans = "POSSIBLE";
					break;
				}
				middle.add(t1);
			}
			
			if ((t1 == 1) || (t1 == n)) {
				if (middle.contains(t0)) {
					ans = "POSSIBLE";
					break;
				}
				middle.add(t0);
			}
		}
		System.out.println(ans);
	}
}
