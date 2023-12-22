import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		String n = sc.next();
		String answer = "";
		for(int i=0; i<n.length(); i++) {
			char a = n.charAt(i);
			if(a=='1') {
				answer += '9';
			} else {
				answer += '1';
			}
		}
		System.out.println(answer);
	}
}
