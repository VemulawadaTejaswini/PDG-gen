public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int amount = scan.nextInt();
		long[] num = new long[amount];
		for (int i = 0; i < amount; i++) {
			num[i] = scan.nextLong();
		}
		long max = num[0];
		for (int i = 0; i < amount; i++) {
			if (num[i] >= max)
				max = num[i];
		}
		long min = num[0];
		for (int i = 0; i < amount; i++) {
			if (num[i] <= min)
				min = num[i];
		}
		long sum = 0;
		for (int i = 0; i < amount; i++) {
			sum += num[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
