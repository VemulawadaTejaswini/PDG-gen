import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		if(a % 2 == b % 2) {
			long d = Math.abs(b-a);
			System.out.println(d/2);
		}
		else {
			long ans = a-1;
			long bb = b-ans;
			if(bb % 2 != 1) {
				ans++;
				bb--;
			}
			ans += (bb-1)/2;
			
			long ans2 = n-b;
			long aa = a+ans2;
			if(aa % 2 != n % 2) {
				ans2++;
				aa++;
			}
			ans2 += (n-aa)/2;
			System.out.println(Math.min(ans, ans2));
		}
	}

}
