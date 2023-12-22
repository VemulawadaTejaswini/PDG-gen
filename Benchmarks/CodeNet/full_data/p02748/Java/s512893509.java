
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a  = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] a_array = new int[a];
		int[] b_array = new int[b];
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < a; i++) {
			a_array[i] = sc.nextInt();
		}
		for(int i = 0; i < b; i++) {
			b_array[i] = sc.nextInt();
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				int temp = a_array[i] + b_array[j];
				if(temp < ans) {
					ans = temp;
				}
			}
		}

		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			int result = a_array[x-1]+b_array[y-1]-c;
			if(result<ans) {
				ans = result;
			}
		}
		System.out.println(ans);

	}

}