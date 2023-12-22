import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		
		int answer = 0;
		for(int i=0; i<n; i++) {
			int ai = Integer.parseInt(sc.next());
			while(ai % 2 == 0) {
				ai /= 2;
				answer++;
			}
		}
		System.out.println(answer);
	}
}
