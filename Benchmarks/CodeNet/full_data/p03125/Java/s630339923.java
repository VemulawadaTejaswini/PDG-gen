import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		if(b%a == 0) {
			System.out.println(a+b);
		} else {
			System.out.println(b-a);
		}
		
	}
}
