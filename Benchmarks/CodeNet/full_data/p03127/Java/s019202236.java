import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.abc118C();
	}
}

class Calc{
	void abc118A() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b%a == 0) {
			System.out.println(a+b);
		}else {
			System.out.println(b-a);
		}
	}

	void abc118B() {
		Scanner sc = new Scanner(System.in);
		int like=0, cnt=0;
		boolean check = false;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] k = new int[n];
		int[][] food = new int[n][30];
		for(int i=0 ; i<n ; i++) {
			k[i] = sc.nextInt();
			for(int j=0 ; j<k[i] ; j++) {
				food[i][j] = sc.nextInt();
			}
		}
		for(int i=1 ; i<=m ; i++) {
			//縦列
			for(int j=0 ; j<n ; j++) {
				//横一列
				for(int p=0 ; p<k[j] ; p++) {
					if( i == food[j][p] ) {
						like ++;
					}
				}
			}
			if(like == n) {
				cnt++;
			}
			like = 0;
		}
		System.out.println(cnt);
	}

	void abc118C() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		int temp = a[0];
		for(int i=1 ; i<n ; i++) {
			temp = euclid(temp, a[i]);
		}
		System.out.println(temp);
	}

	int euclid(int a, int b) {
		int temp;
		while( (temp = a%b) != 0 ) {
			a = b;
			b = temp;
		}
		return b;
	}
}