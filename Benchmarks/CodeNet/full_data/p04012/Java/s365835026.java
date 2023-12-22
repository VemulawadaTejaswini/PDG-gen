import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] c = new int[30];
		for(int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < 30; i++) {
			if(c[i] % 2 == 1) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		System.out.println("Yes");
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}