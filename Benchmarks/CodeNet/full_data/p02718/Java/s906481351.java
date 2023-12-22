import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 	int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;
			int p = 0;

			for (int i = 0;i<n ;i++ ) {
				a[i] = sc.nextInt();
				sum +=a[i];
			}

			for (int i = 0;i<n ;i++ ) {
				if (sum/(4*m)<=a[i]) {
					p++;
				}
			}

			if (p>=m) {
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}


	}
}
