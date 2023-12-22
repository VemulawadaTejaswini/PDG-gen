import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
	void doIt() {
		solveB();
	}
	void solveA() {
		int N = sc.nextInt();
		String ans = "Christmas";
		for(int i = N; i < 25; i++) {
			ans += " Eve";
		}
		System.out.println(ans);
	}
	void solveB() {
		int N = sc.nextInt();
		int [] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		int ans = 0;
		for(int i = 0; i < N-1; i++) {
			ans +=p[i];
		}
		ans += p[N-1]/2;
		System.out.println(ans);
		
	}
}
