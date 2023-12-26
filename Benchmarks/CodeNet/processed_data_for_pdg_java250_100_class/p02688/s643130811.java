public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] snackMenbers = new int[K];
		List<int[]> snackMenberList = new ArrayList<int[]>();
		for (int i = 0; i < K; i++) {
			snackMenbers[i] = sc.nextInt();
			int[] menberArray = new int[snackMenbers[i]];
			for (int j = 0; j < snackMenbers[i]; j++) {
				menberArray[j] = sc.nextInt();
			}
			snackMenberList.add(menberArray);
		}
		int[] all = new int[N];
		for (int k = 0; k < K; k++) {
			for (int l = 0; l < snackMenberList.get(k).length; l++) {
				all[snackMenberList.get(k)[l] - 1] = all[snackMenberList.get(k)[l] - 1] + 1;
			}
		}
		int ans = 0;
		for (int n = 0; n < all.length; n++) {
			if (all[n] == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
