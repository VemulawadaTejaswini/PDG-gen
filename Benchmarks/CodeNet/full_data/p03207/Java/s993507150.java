public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		int max = 0;
		int price = 0;
		int count = 0;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input > ");
		int x = scanner.nextInt();

		for (int i = 0; i < x; i++) {
			price = scanner.nextInt();
			input.add(price);
			if (max < price) {
				max = price;
				count = i;
			}
		}

		for (int i = 0; i < x; i++) {
			if (i == count) {
				sum = sum + input.get(i) / 2;
			} else {
				sum = sum + input.get(i);
			}
		}

		System.out.println(sum);
	}

}
