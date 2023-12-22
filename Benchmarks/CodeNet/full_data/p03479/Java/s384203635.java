
import java.util.*;
import java.util.Map.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();

		int cnt = 0;
		long z = x;
		while(z<=y) {
			z = z*2;
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
