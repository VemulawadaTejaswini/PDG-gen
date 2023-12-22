import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sB();
	}
	
	void sB() {
		int cnt[] = new int[5];
		Arrays.fill(cnt, 0);
		for(int i = 0; i < 3; i++) {
			cnt[sc.nextInt()]++;
			cnt[sc.nextInt()]++;
		}
		int one = 0, two = 0;
		for(int i = 1; i <= 4; i++) {
			if(cnt[i] == 1) one++;
			else if(cnt[i] == 2) two++;
		}
		if(one == 2 && two == 2) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
