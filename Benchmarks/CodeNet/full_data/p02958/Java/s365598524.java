import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = 0;
		int count = 0;
		boolean through = true;
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			if (through && prev + 1 != p) {
				count++;
				through = false;
			} else {
				through = true;
			}
			prev = p;
		}
		if (count <= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
