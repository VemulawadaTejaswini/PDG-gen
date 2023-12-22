import java.util.Scanner;

public class Main {
	int max = 0;
	int count = 0;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if(c == 'I') count++;
			else count--;
			if(count > max) {
				max = count;
			}
		}
		System.out.println(max);
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}