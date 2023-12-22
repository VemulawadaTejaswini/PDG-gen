import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean ok = false;
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			if(!ok && sc.nextInt() == i) {
				ans++;
				ok = true;
			}
			else
				ok = false;
		}
		System.out.println(ans);
	}

}