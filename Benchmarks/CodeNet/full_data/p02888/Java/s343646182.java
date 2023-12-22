import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// Liの入力
		Integer[] L = new Integer[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		
		// Liを降順にソートして、長い2辺の差より長い1辺を探す
		Arrays.sort(L, Collections.reverseOrder());
		int count = 0;
		for (int i = 0; i < N - 2; i++) {
			int a = L[i];
			for (int j = i + 1; j < N -1; j++) {
				int b = L[j];
				if (b < a - b) {
					break;
				}
				for (int k = j + 1; k < N; k++) {
					int c = L[k];
					if (c > a - b) {
						count++;
					}
					else {
						break;
					}
				}
			}
		}
		
		// 結果の出力
		System.out.println(count);
		
		sc.close();
	}
}
