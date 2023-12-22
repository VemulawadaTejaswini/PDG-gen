import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		long sum = 0;
		for( int i=0; i<n ;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int count=0;
		for( int i=0 ; i<n ; i++ ) {
			if( a[i]* 4 * m >=sum )count++;
		}
		
		if ( count >= m )
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
