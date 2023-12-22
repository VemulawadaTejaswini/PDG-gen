import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int x = sc.nextInt();
		int ans = 0;
		for (int i = 2;i < x/2;i++) {
			int tmp = i;
			while (tmp * tmp < x) {
				tmp *= tmp;
				}
			if (tmp > ans) ans = tmp;
		}
		System.out.println(ans);
	}
}