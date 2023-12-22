import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		if(n%2==1) n++;
		
		if(n/2 >= k) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
