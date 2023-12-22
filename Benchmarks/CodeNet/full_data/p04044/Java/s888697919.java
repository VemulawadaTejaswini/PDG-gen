import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		ArrayList<String> s = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			s.add(sc.next());
		}
		s.sort(null);
		System.out.println(s.get(0) + s.get(1));
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}