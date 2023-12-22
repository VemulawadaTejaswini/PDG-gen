import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	private static Map<Integer,Integer> intMap = new HashMap<>();

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = solve(n);

		System.out.println(ans);
	}

	public static int solve(int n)
	{

		if(intMap.containsKey(n)){
			return intMap.get(n);
		}
		int ans = n;
		int n6 = getNext(n, 6);
		int n9 = getNext(n, 9);
		if (n < 6) {
			return n;
		} else if (n == 6 || n == 9) {
			return 1;
		} else if (n <9) {
			ans = Math.min(ans, solve(n6) + 1);
			ans = Math.min(ans, n + 1);
		} else {
			ans = Math.min(ans, solve(n6) + 1);
			ans = Math.min(ans, solve(n9) + 1);
		}
		intMap.put(n, ans);
		return ans;
	}

	private static int getNext(int n, int i)
	{
		int ans = n;
		int jp = 0;
		int j = i;
		while(true) {
			if (j > n) break;
			jp = j;
			j *=i;
		}
		return n - jp;
	}
}
