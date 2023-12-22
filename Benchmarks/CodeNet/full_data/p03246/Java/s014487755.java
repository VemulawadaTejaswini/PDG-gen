import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[100000+2];
		int[] B = new int[100000+2];
		
		int n = sc.nextInt();
		for (int i=1; i<=n; ++i){
			int x = sc.nextInt();
			if (i%2 == 1){
				A[x]++;
			} else {
				B[x]++;
			}
		}
		
		int mx1 = 0, mx2 = 0, valmx1=0, valmx2=0;
		for (int i=1; i<=100000; ++i){
			if (mx1 < A[i]){
				mx1 = A[i];
				valmx1 = A[i];
			}
			if (mx2 < B[i]){
				mx2 = B[i];
				valmx2 = B[i];
			}
		}
		if (valmx1 == valmx2){
			System.out.print( n/2 );
		} else {
			System.out.print( n/2 - mx1 + n/2 - mx2 );
		}
	}

}
