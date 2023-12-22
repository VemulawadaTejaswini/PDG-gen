import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	int count = 0;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		for(int x = 0; x <= N; x++) {
			for(int y = 0; y <= N-x; y++) {
				int z = N - x - y;
				count = x*10000 + 5000*y + 1000*z;
				if(count == Y) {
					System.out.println(x + " " + y + " " + z);
					sc.close();
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}