import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] h = new int[n];
		int count = 0;
		int max = 1;

		for (int i = 0;i<n ;i++ ) {
			h[i] = sc.nextInt();
		}

		for (int i = 0;i<n ;i++ ) {
			if (max<=h[i]) {
				count++;
				max = Math.max(h[i],max);
			}
		}

		System.out.println(count);


	}
}
