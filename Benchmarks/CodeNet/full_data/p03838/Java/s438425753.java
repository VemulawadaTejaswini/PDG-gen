import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		if(x <= y) ans = (x >= 0) ? y - x : (y >= -x) ? 1 + x + y : y - x;
		else if(y > 0) ans = 2 + x - y;
		else if(y == 0) ans = 1 + x;
		else if(x >= 0) ans = (y <= -x) ? 1 - x - y : 1 + x + y;
		else ans = 2 + x - y;
		System.out.println(ans);
	}
}