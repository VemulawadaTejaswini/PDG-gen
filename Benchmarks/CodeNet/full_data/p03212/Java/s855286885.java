import java.util.*;

public class Main {
	
	static int n;
	
	public static boolean seven(long ans) {
		int count[];
		count = new int[3];
		
		long tmp = ans, tmp2 = tmp;
		
		while(tmp > 0) {
			tmp /= 10;
			tmp2 = tmp2 - tmp * 10;
			if(tmp2 == 3 || tmp2 == 5 || tmp2 == 7) {
				int n = (int)((tmp2 - 3) / 2);
				count[n]++;
			}
			tmp2 = tmp;
		}
		
		for(int i : count) {
			if(i <= 0)return false;
		}
		
		return true;
	}
	
	public static int solve(long ans) {
		int count = 0;
		
		if(ans > n)return 0;
		
		if(seven(ans))count = 1;
		
		for(int i = 1; i <= 3; ++i) {
			long tmp = ans * 10 + (2 * i + 1);
			count += solve(tmp);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		sc.close();
		int ans = 0;
		
		ans = solve(0);
		
		System.out.println(ans);
	}

}
