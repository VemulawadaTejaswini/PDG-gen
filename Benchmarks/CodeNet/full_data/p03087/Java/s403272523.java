import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Main main = new Main ();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();

		int[] list = new int[n];
		int count = 0;

		for (int index=0; index+1<n; index++) {
			if (s.charAt(index)=='A'&&s.charAt(index+1)=='C') {
				count++;
			}
			list[index+1] = count;
		}

		for (int index=0; index<q; index++) {
			int first = sc.nextInt();
			int last = sc.nextInt();

				System.out.println(list[last-1]-list[first-1]);
		}
	}
}