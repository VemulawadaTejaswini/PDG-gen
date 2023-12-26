public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] numbers = new Integer[n];
		for(int i=0;i<n;i++) {
			numbers[i] = scanner .nextInt();
		}
		scanner.close();
		Arrays.sort(numbers,Collections.reverseOrder());
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sum1 = sum1 + numbers[i];
			} else {
				sum2 = sum2 + numbers[i];
			}
		}
		System.out.println(sum1-sum2);
	}
}
