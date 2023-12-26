public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int[] test = new int[5];
		test[0] = sc1.nextInt();
		test[1] = sc1.nextInt();
		test[2] = sc1.nextInt();
		test[3] = sc1.nextInt();
		test[4] = sc1.nextInt();
		int k = sc1.nextInt();
		Arrays.sort(test);
		if (test[4]-test[0] <= k) {
			System.out.println("Yay!");
		}
		else {
			System.out.println(":(");
		}
		sc1.close();
	}
}
