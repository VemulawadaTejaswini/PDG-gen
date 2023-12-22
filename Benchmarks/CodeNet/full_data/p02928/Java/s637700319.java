public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] nums = new int[N];
			for (int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			}
			long[] childCount = new long[N];
			for (int i = N - 1; i > 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (nums[j] > nums[i]) {
						childCount[j] = (childCount[j] + childCount[i]) + 1;
					}
				}
			}
			long div = 1000000007;
			long k;
			if( K %2 == 1) {
				long amari1 = K % div;
				long amari2 = (K+1)/2 % div;
				k = amari1 * amari2 % div;
			}else {
				long amari1 = K/2 % div;
				long amari2 = (K+1) % div;
				k = amari1 * amari2 % div;
			}
			System.out.println(childCount[0] * k % div);
		}
	}
}