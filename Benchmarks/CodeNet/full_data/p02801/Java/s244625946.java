private static Scanner scan = new Scanner(System.in);
	private static final int SUBJECT = scan.nextInt(); // 教科数
	private static final int MAX_SCORE = scan.nextInt(); // 満点
	private static final int AVERAGE_SCORE = scan.nextInt(); // 平均点

	public static void main(String[] args) {
		int nowScore = 0;// (n-1)教科終了時の合計点
		// 教科数分のfor
		for(int i = 0; i < SUBJECT - 1; i++) {
			// nowScoreに点数を加算
			nowScore += scan.nextInt();
		}
		if(isUnachievable(nowScore)) {
			System.out.println(-1);
		} else if(isCheckRequired(nowScore)) {
			System.out.println(0);
		} else {
			System.out.println(getRequiredScore(nowScore));
		}
		
	}
	
	public static boolean isUnachievable(int nowScore) {
		// 現得点 + 最高点 < 平均点 * 教科数
		return nowScore + MAX_SCORE < SUBJECT * AVERAGE_SCORE;
	}
	
	public static boolean isCheckRequired(int nowScore) {
		// 現得点 + 最低点 > 平均点 * 教科数
		return nowScore + 0 < SUBJECT * AVERAGE_SCORE;
	}
	
	public static int getRequiredScore(int nowScore) {
		return AVERAGE_SCORE * SUBJECT - nowScore;
	}