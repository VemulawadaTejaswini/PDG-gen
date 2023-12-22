import java.util.Scanner;


public class Main {
	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] dices = new int[n];
		quick_sort(dices, 0, dices.length-1);

		int curMax = 0;
		int tmpMax = 0;
		int[] tmpdices = new int[k];
		int[] curdices = new int[k];
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				tmpMax += dices[j];
				tmpdices[j] = dices[j];
			}
			if (curMax < tmpMax) {
				curMax = tmpMax;
				curdices = tmpdices;
			}

		}

		double result = 0;
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < curdices[j]; j++) {
				result += curdices[j] / j+1;
			}
		}

		System.out.println(result);
	}

	static void quick_sort(int[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
}
