import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

		int[] cost = new int[n+1];
		for(int i=0;i<cost.length;i++) {
			cost[i] = 0;
		}

		for (int i=0;i<m;i++) {
			int am = sc.nextInt();
			cost[am] = 1;
		}
		System.out.println(calcCost(x,cost));

	}

	private static int calcCost(int x, int[] costtable) {
		int left=0;
		for(int i=0;i<x;i++) {
			left+=costtable[i];
		}
		int right=0;
		for(int i=x;i<costtable.length;i++) {
			right+=costtable[i];
		}
		return left<right?left:right;
	}

}