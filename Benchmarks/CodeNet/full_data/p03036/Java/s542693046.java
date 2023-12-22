import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		sc.close();
		sc = null;
		int ans = x;
		for(i = 1; i <= 10; i++) {
			ans = r*ans - d;
			System.out.println(ans);
		}
	}
}