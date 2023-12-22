import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int answer = 1;
		int deltaN = n;
		int deletableNum = k-1;
		
		while(deltaN > k) {
			deltaN -= deletableNum;
			answer++;
		}
		
		System.out.println(answer);
	}
}
