import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int cnt = 1;
		int n = sc.nextInt();
		int max = sc.nextInt();
		for(int i = 1; i < n; i++) {
			int h = sc.nextInt();
			if(max <= h) {
				max = h;
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
