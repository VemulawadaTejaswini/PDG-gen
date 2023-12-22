
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int ans = 0;
		if(x<a) {
			ans = 0;
		}else {
			ans = 10;
		}
		System.out.println(ans);
		sc.close();
	}
}
