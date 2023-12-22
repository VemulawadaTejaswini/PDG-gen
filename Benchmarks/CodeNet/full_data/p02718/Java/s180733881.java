import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];

		int g = 0;
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
			g = g+a[i];
		}
		Arrays.sort(a);

		if ( a[n-m]*4*m >= g ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}