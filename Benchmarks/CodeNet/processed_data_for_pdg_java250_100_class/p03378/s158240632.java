public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int start = scan.nextInt();
		int[] cost = new int[m];
		for (int i = 0; i < cost.length; i++) {
			cost[i] = scan.nextInt();
		}
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < cost.length; i++) {
			if (cost[i] < start) {
				countA++;
			} else {
				countB++;
			}
		}
		System.out.println(Math.min(countA, countB));
	}
}
