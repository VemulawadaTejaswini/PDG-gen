import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		if(S.substring(0,1)!=S.substring(1,2)&&S.substring(0,1)!=S.substring(2,3)
				&&S.substring(1,2)!=S.substring(2,3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}