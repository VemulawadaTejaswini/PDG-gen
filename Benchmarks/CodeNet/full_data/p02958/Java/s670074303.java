import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		boolean through = true;
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			if (i + 1 != p) {
				count++;
			}
		}
		if (count == 0 || count == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
