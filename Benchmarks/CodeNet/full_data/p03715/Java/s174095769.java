import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		long ans = Integer.MAX_VALUE;
		if(H % 3 == 0 || W % 3 == 0)
			ans = 0;
		long a, b;
		for(int i = 0; i <= 1; i++) {
			a = (W/3+i)*H;
			b = (W-i-W/3)*(H/2);
			ans = Math.min(ans, Math.abs(a-b));
			if(H % 2 != 0)
				ans = Math.min(ans, W-i-W/3);
			a = (H/3+i)*W;
			b = (H-i-H/3)*(W/2);
			ans = Math.min(ans, Math.abs(a-b));
			if(W % 2 != 0)
				ans = Math.min(ans, H-i-H/3);
		}
		ans = Math.min(ans, Math.min((3-H%3)*W, (3-W%3)*H));
		System.out.println(ans);
	}

}
