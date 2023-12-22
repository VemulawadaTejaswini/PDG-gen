import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		long n = Long.valueOf(s);
		
		System.out.println(dfs(n,1,0));
	}
	
	
	static long dfs(long n, int m, long sum) {//mは何桁目まで調べたか
		if(NumberOfDigit(n) == m) {
			return sum + n;
		}
		
		sum = dfs(n,m+1,sum);
		
		sum = (int)Math.pow(2, NumberOfDigit(n)-m-1) * (n%(int)Math.pow(10,m)) + dfs(n/(int)Math.pow(10,m),1,sum);
		
		return sum;
	}
	
	static int NumberOfDigit(long num) {
		int i = 0;
		while(num != 0) {
			num /= 10;
			i++;
		}
		return i;
	}
}
