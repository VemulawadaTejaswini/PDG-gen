import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int t = sc.nextInt();
		int g = x - t;
		if (g < 0) {
			g = 0;
		}
		System.out.println(g);
	}
}
