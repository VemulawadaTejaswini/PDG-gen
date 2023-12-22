import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flg = true;
		int t, x, y;
		for(int i = 0; i < n; i++) {
			t = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			flg = flg && isGoal(t, x+y);
			if(!flg) break;
		}
		System.out.println(flg? "Yes": "No");
	}
	public static boolean isGoal(int t, int goal) {
		if(t == 0) return goal == 0;

		return isGoal(t-1, goal+1) || isGoal(t-1, goal-1);
	}
}