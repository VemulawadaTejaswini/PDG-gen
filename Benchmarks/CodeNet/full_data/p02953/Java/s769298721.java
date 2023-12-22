import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; ++i)
			h[i] = sc.nextInt();
		sc.close();
		String ans[] = {"Yes", "No"};
		int an = 0;
		for(int i = n - 1; i > 0; --i) {
			int tmp = h[i - 1] - h[i];
			if(tmp > 0) {
				if(tmp > 1) {
					an = 1;
					break;
				}
				h[i - 1]--;
			}
		}
		System.out.println(ans[an]);
	}
}
