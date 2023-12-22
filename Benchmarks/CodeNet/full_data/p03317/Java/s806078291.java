import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		
		ans = (int)Math.ceil(n / k + 1);
		
		System.out.println(ans);
		
	}
}