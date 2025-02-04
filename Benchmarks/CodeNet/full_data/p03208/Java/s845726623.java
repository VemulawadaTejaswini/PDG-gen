public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] heights = new int[n];

		for(int i = 0; i < n; i++) {
			heights[i] = scan.nextInt();
		}

		scan.close();

		Arrays.sort(heights);

		for(int i = 0; i < n; i++) {
			System.out.println(heights[i]);
		}

		int minDiff = Integer.MAX_VALUE;
		for(int i = 0; i < k; i++) {
			int max = heights[i+k -1];
			int min = heights[i];
			int diff = max - min;
			if(minDiff > diff) minDiff = diff;
		}
		System.out.println(minDiff);
	}

}