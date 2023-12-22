import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 	int k = sc.nextInt();
			int n = sc.nextInt();
			int[] a = new int[n+1];
			int sum = 0;
			int max = 0;
			a[n] = k;

			for (int i = 0;i<n ;i++ ) {
				a[i] = sc.nextInt();
			}

			for (int i = 0;i<n ;i++ ) {
				max = Math.max(max,a[i+1]-a[i]);
			}

			System.out.println(k-max-a[0]);
	}
}
