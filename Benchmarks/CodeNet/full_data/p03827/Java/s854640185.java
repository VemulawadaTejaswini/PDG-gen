import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE, t=0;
		sc.nextInt();
		for (char ch : sc.next().toCharArray()) {
			t+=ch=='I' ? 1 : -1;
			max=(t>max) ? t : max;
		}
		System.out.println(Math.max(max, 0));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}