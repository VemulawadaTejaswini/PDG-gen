import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int x = sc.nextInt();
			int sum = 0;
			int[] array = new int[n];
			for(int i = 0; i<n; i++) {
				array[i] = sc.nextInt();
				sum+=array[i];
			}
			sc.close();
			int min = Integer.MAX_VALUE;
			for(int i = 0;i<n;i++) {
				if(array[i]<min) {
					min = array[i];
				}
			}
			int res = (x-sum)/min;
			System.out.println(res+n);
		}
	public static void main(String[] args) {
		solve();

	}

}
