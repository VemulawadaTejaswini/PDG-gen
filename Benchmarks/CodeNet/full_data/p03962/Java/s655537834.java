import java.util.Scanner;

public class Main {
	private static Main instance = new Main();
	
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		instance.solve();
	}
	
	private void solve() {
		int answer = 1;
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		if(a != b) answer++;
		
		int c = scanner.nextInt();
		if(c != a && c != b) answer++;
		
		System.out.printf("%d", answer);
	}
}
