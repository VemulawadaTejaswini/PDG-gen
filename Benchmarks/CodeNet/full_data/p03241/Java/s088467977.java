import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= Math.sqrt(M); i++) {
			if(M % i == 0 && i <= M / N) ans = i;
		}
		if(N == 1) ans = M;
		System.out.println(ans);
	}
}
