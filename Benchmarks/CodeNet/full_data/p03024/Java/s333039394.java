import java.util.Scanner;
 
public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count = 15;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'x') {
				count--;
			}
		}
		in.close();
		if (count >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
