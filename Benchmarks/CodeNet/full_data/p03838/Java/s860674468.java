import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		if(x <= y) ans = (x < 0 && y >= -x) ? 1 + y - (-x) : y - x;
		else if(x >= 0) ans = (y >= -x) ? 1 + y - (-x) : (-y) - x + 1;
		else ans = 1 + ((-y) - (-x)) + 1;
		System.out.println(ans);
	}
}