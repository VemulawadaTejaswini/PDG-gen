import java.util.Scanner;

public class Main {

	static int[] unit = {10000, 5000, 1000};
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int Y = cin.nextInt();
		cin.close();
		
		int[] init = {0, 0, 0};
		
		int[] ans = dist(0, N, Y, init);
		
		
		System.out.println(ans[0] + " " + ans[1] + " "+ ans[2]);

	}

	static int[] dist(int level, int bills, int amount, int[] ans) {
//System.out.println("dist in: " + level + " " + bills + " " +amount);
		int max_num = amount / unit[level];
		
		for (int i=max_num; i>=0; i--) {
//System.out.println("level i " +level + " " +max_num);			
			if (i > bills) continue;
			
			if (i*unit[level] > amount) continue;
			
			if (i*unit[level] == amount && i == bills) {
				ans[level] = i;
				System.out.println(ans[0] + " " + ans[1] + " "+ ans[2]);
				System.exit(0);
			};
			
			if (level == 2) continue;
			
			if (amount-i*unit[level] <= 0) continue;
			
			int[] newAns = new int[3];
			System.arraycopy(ans, 0, newAns, 0, 3);
			newAns[level] = i;
			dist(level+1, bills-i, amount-i*unit[level], newAns);
		}
		
		int[] na = {-1, -1, -1};
		return na;
	}
	
	
}
