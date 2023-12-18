class Main {
	private static final String SPLIT_STR = " ";
	private static final String SPACE = " ";
	private static final String OPERATOR_SMALL = "<";
	private static final String OPERATOR_BIG = ">";
	private static final String OPERATOR_EQUAL = "==";
	private static final String OUTPUT_RIGHT = "a";
	private static final String OUTPUT_LEFT = "b";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		sc.close();
		String[] split = x.split(SPLIT_STR);
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		String comparisonOperator = OPERATOR_EQUAL;
		if (a < b) {
			comparisonOperator = OPERATOR_SMALL;
		} else if (a > b) {
			comparisonOperator = OPERATOR_BIG;
		}
		System.out.println(OUTPUT_RIGHT + SPACE + comparisonOperator + SPACE + OUTPUT_LEFT);
	}
}
