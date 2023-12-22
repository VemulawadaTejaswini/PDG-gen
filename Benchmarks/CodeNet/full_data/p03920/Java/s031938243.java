import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 2;
		int ans = 0;
		for(int i = 1; i <= 10000000; i++) {
			if(N - i >= i + 1) {
				N -= i;
				ans++;
			}
		}
		for(int i = 1; i <= ans; i++) {
			System.out.println(i);
		}
		System.out.println(N);
	}
}
