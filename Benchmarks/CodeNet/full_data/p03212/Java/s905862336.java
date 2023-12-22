import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		int ans = dfs(N, 0);
		
		System.out.println(ans);
	}
	
	static int dfs(long N, long num) {
		int count = 0;
		
		if (num > N) {
			return count;
		}
		String s = Long.toString(num);
		if (s.contains("3") && s.contains("5") && s.contains("7")) {
			count++;
		}
		
		count += dfs(N, num*10+3);
		count += dfs(N, num*10+5);
		count += dfs(N, num*10+7);
		
		return count;
	}
	
}