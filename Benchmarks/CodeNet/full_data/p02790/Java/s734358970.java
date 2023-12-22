import java.util.Scanner;
public class Main {
	
	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a>=b) {
			for(int i = 0; i<a;i++) {
				System.out.print(b);
			}
		}
		else {
			for(int i = 0; i<b;i++) {
				System.out.print(a);
		}		
	}
}
	public static void main(String[] args) {
		solve();
	}
}
