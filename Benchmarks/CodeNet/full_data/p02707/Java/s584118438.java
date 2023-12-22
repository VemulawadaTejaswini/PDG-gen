import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String input = sc.nextLine();
		int len = input.length() - 1;
		int[] a = new int[len];
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < len; j++) {
			int count = 0;
			for (int k = 0; k < len; k++) {
				if (a[j] < a[k]) {
					count++;
				}
			}
			System.out.println(count);
		}
		for (int l = 0; l < n - len; l++) {
			System.out.println(0);
		}
	}
}