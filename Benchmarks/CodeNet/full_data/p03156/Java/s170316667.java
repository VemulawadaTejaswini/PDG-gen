import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt[] = new int[3];
		Arrays.fill(cnt, 0);
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num <= a) cnt[0]++;
			else if(num <= b) cnt[1]++;
			else cnt[2]++;
		}
		int min = cnt[0];
		for(int i = 1; i < 3; i++) {
			if(min > cnt[i])min = cnt[i];
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
