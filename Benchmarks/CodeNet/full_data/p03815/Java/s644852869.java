
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong();
		long ans = 0;
		ans = (x/11)*2;
		if(x%11 <= 6) {
			ans += 1;
		}else {
			ans += 2;
		}
		System.out.println(ans);
		sc.close();
	}

}
