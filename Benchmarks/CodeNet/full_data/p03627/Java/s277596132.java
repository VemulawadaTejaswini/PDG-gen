import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(A);
		double s = 0;
		for(int i=n-1; i>=3; i--) {
			int a = A[i];
			int b = A[i-1];
			int c = A[i-2];
			int d = A[i-3];
			if(pd(a,b,c,d)) {
				double z = (a+b+c+d)/2.0;
				s = Math.sqrt((z-a)*(z-b)*(z-c)*(z-d));
				break;
			}
		}
		System.out.println(s);
	}
	
	static boolean pd(int a, int b, int c, int d) {
		if(a+b+c<d || a+c+d<b || a+b+d<c || b+c+d<a) return false;
		return true;
	}
}
