
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a  = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] a_array = new int[a];
		int[] b_array = new int[b];
		int a_min = Integer.MAX_VALUE;
		int b_min = Integer.MAX_VALUE;
		int ans ;
		for(int i = 0; i < a; i++) {
			a_array[i] = sc.nextInt();
			if(a_array[i] < a_min) {
				a_min = a_array[i];
			}
		}
		for(int i = 0; i < b; i++) {
			b_array[i] = sc.nextInt();
			if(b_array[i] < b_min) {
				b_min = b_array[i];
			}
		}
		
		ans = a_min+b_min;

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