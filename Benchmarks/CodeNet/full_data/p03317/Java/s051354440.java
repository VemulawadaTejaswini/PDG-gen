import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int ans = (n-1) / (k-1) + ((n-1) % (k-1) != 0 ? 1 : 0);
		
		for (int i = 0; i < n; i++)
			sc.next();
		
		System.out.println(ans);
	}
}