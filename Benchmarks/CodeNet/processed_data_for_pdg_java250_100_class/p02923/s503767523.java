public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int[] heights = new int[number];
		for (int i = 0; i < number; i++) {
			heights[i] = s.nextInt();
		}
		s.close();
		int max = 0;
		int count = 0;
		for (int i = 0; i < number; i++) {
			count = 0;
			int j = 0;
			for (j = 0; (i + j + 1) < number; j++) {
				if (heights[i + j] >= heights[i + j + 1]) {
					count++;
				} else {
					break;
				}
				if (max < count) {
					max = count;
				}
			}
			i = i + j;
		}
		System.out.println(max);
	}
}
