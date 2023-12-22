import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			int t = b; b = a; a = t;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < b; i++) sb.append(a);

		System.out.println(sb);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
