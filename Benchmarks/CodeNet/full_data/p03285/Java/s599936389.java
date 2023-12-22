import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = dfs(0, n) ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}
	
	static boolean dfs(int sum, int n) {
		if (sum == n) return true;
		if (sum > n) return false;
		
		return dfs(sum + 4, n) || dfs(sum + 7, n);
	}
}


