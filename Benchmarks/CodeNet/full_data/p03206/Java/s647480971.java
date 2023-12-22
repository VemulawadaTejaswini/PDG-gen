import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
	void doIt() {
		solveA();
	}
	void solveA() {
		int N = sc.nextInt();
		String ans = "Christmas";
		for(int i = N; i < 25; i++) {
			ans += " Eve";
		}
		System.out.println(ans);
	}
}
