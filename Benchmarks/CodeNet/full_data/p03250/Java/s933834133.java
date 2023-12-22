public class MaxFormula {

	public static final int NUM_INPUT = 3;

	public static void main(String[] args) {

		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];

		int max = 0;
		for (int i = 0; i < NUM_INPUT; i++) {
			for (int j = 0; j < NUM_INPUT; j++) {
				if (i == j) {
					continue;
				}
				int index = 0;
				for (int k = 0; k < NUM_INPUT; k++) {
					if (i == k || j == k) {
						continue;
					}
					index = k;
				}
				int num = Integer.parseInt(args[i] + args[j]) + Integer.parseInt(args[index]);
				if (num > max) {
					max = num;
				}
			}
		}

		System.out.println(max);

    }
}