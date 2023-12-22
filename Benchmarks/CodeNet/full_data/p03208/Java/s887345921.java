import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		int list[] = new int[n];
		for(int i = 0; i < n; i++ ) {
			list[i] = Integer.parseInt(scanner.nextLine());
		}
		//execute

		sort(list, 0, n - 1);

		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n -( k -1)  ;i ++) {
			ans = Math.abs(Math.min(ans, list[i] - list[i + k - 1]));

		}

		System.out.println("-");
		System.out.println(ans);

	}

	public static void sort(int[] list, int left, int right) {
		if(left <= right) {
			int l = left;
			int r = right;
			int pivot = list[(left + right) >>> 1];

			while(l <= r) {

				while(list[l] < pivot) {
					l++;
				}
				while(list[r] > pivot) {
					r--;
				}

				if(l <= r) {
					int temp = list[l];
					list[l] = list[r];
					list[r] = temp;
					l++;
					r--;
				}
			}
			sort(list, l, right);
			sort(list, left, r);
			}
		}
}
