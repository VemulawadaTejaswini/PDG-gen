import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		sc.close();
		long ans = (long)Math.pow((long)(n / k), (long)3);
		if(k % 2 == 0) {
			ans += (long)Math.pow((long)((n - (k / 2)) / k + 1), (long)3);
		}
		System.out.println(ans);
	}

}
