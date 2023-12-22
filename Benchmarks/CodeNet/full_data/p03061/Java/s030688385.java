import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] a1 = new int[n];
		int[] a2 = new int[n];

		a1[0] = sc1.nextInt();
		a2[0] = a1[0];
		int ans0 = a1[0];
		int ans1 = 1000000000;
		int ans2 = 1000000000;
		int num = n;
		int tmp = 0;

		if (n == 2) {
			a1[1] = sc1.nextInt();
			if (a1[0] > a1[1]) {
				System.out.println(a1[0]);
			}
			else {
				System.out.println(a1[1]);
			}
			sc1.close();
			return;
		}

		for ( int i = 1 ; i < n ; i++ ) {
			a1[i] = sc1.nextInt();
			a2[i] = a1[i];
			tmp = euclid( a1[i] , ans0 );
			//System.out.println(tmp);
			if ( tmp < ans0 ) {
				ans0 = tmp;
				num = i;
			}
		}

		if ( num > 1 ) {
			a1[num] = a1[num-1];
			a2[num-1] = a1[num-2];
		}
		else {
			a1[num] = a1[num+1];
			a2[num-1] = a1[num];
		}

		for ( int i = 0 ; i < n-1 ; i++ ) {
			tmp = euclid( a1[i] , a1[i+1] );
			if ( tmp < ans1 ) {
				ans1 = tmp;
			}
			tmp = euclid( a2[i] , a2[i+1] );
			if ( tmp < ans2 ) {
				ans2 = tmp;
			}
		}

		if (ans1 > ans2) {
			System.out.println(ans1);
		}
		else {
			System.out.println(ans2);
		}

		sc1.close();

	}

	static int euclid( int a, int b ) {
        if( a < b ) { int temp = a; a = b; b = temp; } //引数の大小入替
        if( b < 1 ) return -1;                         //0以下は非自然数

        if( a % b == 0 ) return b;
        return euclid( b, a % b );
    }
}
