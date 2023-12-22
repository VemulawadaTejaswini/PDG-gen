import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		int ans=dfs("",n);
		System.out.println(ans);
		sc.close();
	}

	private int dfs(String num, long max) {
		long n=0;
		if(! num.equals("")) {
			n=Long.parseLong(num);
		}
		if(n>max) {
			return 0;
		}
		int cnt = 0;
		if(num.contains("7") && num.contains("5") && num.contains("3")) {
			cnt=1;
		}
		cnt += dfs(num+"7", max);
		cnt += dfs(num+"5", max);
		cnt += dfs(num+"3", max);
		return cnt;
	}
}
