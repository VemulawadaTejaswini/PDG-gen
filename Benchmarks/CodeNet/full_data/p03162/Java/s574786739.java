public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int days = scan.nextInt();
		int activites[][] = new int[days+1][4];
		for(int i=1;i<=days;i++) {
			activites[i][1] = scan.nextInt();
			activites[i][2] = scan.nextInt();
			activites[i][3] = scan.nextInt();
		}
		
		int points = Integer.MIN_VALUE;
		
		int[][] dp = new int[days+1][4];
		for(int i=1;i<=3;i++) {
			points = Math.max(points, happiness(activites,1,i,dp));
		}
				
		System.out.println(points);
	}
	
	public static int happiness(int[][] act,int day,int currentActvity, int[][] dp) {
		
		if(day >= act.length) {
			return 0;
		}
		
		if(dp[day][currentActvity] != 0) {
			return dp[day][currentActvity];
		}
		
		int points = Integer.MIN_VALUE;
				
		for(int i=1;i<=3;i++) {
			if(i != currentActvity) {
				points = Math.max(points, happiness(act, day+1, i,dp));
			}
		}
		
		dp[day][currentActvity] = points + act[day][currentActvity];
		return dp[day][currentActvity];
	}
}