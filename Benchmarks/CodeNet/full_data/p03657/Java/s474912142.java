import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ret = 0;
		int cnt = 0;

		Integer array[] = new Integer[n];

		for (int i = 0; i < n; i++) {
			array[i] = (sc.nextInt());
		}

		Arrays.sort(array, Comparator.reverseOrder());

		while(cnt < k){
			ret = ret + array[cnt];

			cnt++;
		}

		sc.close();
	}
}