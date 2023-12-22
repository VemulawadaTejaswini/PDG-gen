
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[a];
		int mina=0;
		int[] B = new int[b];
		int minb=0;
		int[] M = new int[m*3];
		for(int i=0; i<a; i++) {
			A[i] = sc.nextInt();
			mina = A[0];
			if(mina>A[i]) {
				mina = A[i];
			}
		}
		for(int i=0; i<b; i++) {
			B[i] = sc.nextInt();
			minb = B[0];
			if(minb>B[i]) {
				minb = B[i];
			}
		}
		for(int i=0; i<m*3; i++) {
			M[i] = sc.nextInt();
		}
		int min = mina + minb;
		
		for(int i=0; i<m*3; i+=3) {
			int coupon = A[M[i]-1] + B[M[i+1]-1] - M[i+2];
			if(min>coupon) {
				min = coupon;
			}
		}
		
		
		System.out.println(min);
	}

}
