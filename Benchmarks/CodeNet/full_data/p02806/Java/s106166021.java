import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		int[] t = new int[N];
		for (int i=0;i<N;i++) {
			s[i] = sc.next();
			t[i] = sc.nextInt();
		}
		String X = sc.next();
		int index = -1;
		for (int i=0;i<N;i++) {
			if (X.equals(s[i])) index=i;
		}
		int ans = 0;
		for (int i=index+1;i<N;i++) {
			ans += t[i];
		}
		System.out.println(ans);
	}
}