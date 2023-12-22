import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int indexListW[][] = { {0 , 0 , 0} , { 0 , 1 , 2} , {0 , 1 , 2} , {1 , 1 , 1} , {0 , 1 , 2} , {2 , 2 , 2} , {0 , 1 , 2} ,{0 , 1 , 2} };
		int indexListH[][] = { {0 , 1 , 2} , { 0 , 0 , 0} , {0 , 1 , 2} , {0 , 1 , 2} , {1 , 1 , 1} , {0 , 1 , 2} , {2 , 2 , 2} ,{2 , 1 , 0} };

		int a[][] = new int[3][3];

		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		int n = scan.nextInt();

		for(int i = 0 ; i < n ; i++) {
			int b = scan.nextInt();
			for(int j = 0 ; j < 3 ; j++) {
				for(int k = 0 ; k < 3 ;k++) {
					if(a[j][k] == b) {
						a[j][k] = -1;
						break;
					}
				}
			}
		}

		for(int i = 0 ; i < 8 ; i++) {
			if(a[ indexListW[i][0] ][ indexListH[i][0] ] == -1 && a[ indexListW[i][1] ][ indexListH[i][1] ] == -1 && a[ indexListW[i][2] ][ indexListH[1][2] ] == -1 ) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");

	}
}
