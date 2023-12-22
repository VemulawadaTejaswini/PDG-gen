import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		long[] X = new long [m];
		for(int i=0;i<m;i++) {
			X[i] = Long.parseLong(sc.next());
		}
		sc.close();
		Arrays.sort(X);
		if(n>=m) {
			System.out.println(0);
			return;
		}

		if(X[0]<0) {
			for(int i=m-1;0<=i;i--) {
				X[i] += Math.abs(X[0]);
			}
		}else {
			for(int i=m-1;m<=i;i--) {
				X[i] -= Math.abs(X[0]);
				System.out.println(X[i]);
			}
		}

		//X[i+1]とX[i]の幅
		long[]widthX=new long [m-1];

		for(int i=0;i<m-1;i++) {
			widthX[i] = X[i+1]-X[i];
			//System.out.println(widthX[i]);
		}
		Arrays.sort(widthX);
		long tmp = 0;
		for(int i=0,j=widthX.length-1;i<j;i++,j--) {
			tmp = widthX[i];
			widthX[i]=widthX[j];
			widthX[j]=tmp;
		}
		for(int i=0;i<n;i++) {
			//System.out.println(widthX[i]);
		}


		long res = 0;

		for(int i=0;i<n-1;i++){
			res += widthX[i];
		}
		long sumwidthX = 0;
		for(int i=0;i<m-1;i++){
			sumwidthX += widthX[i];
			System.out.println(widthX[i]);
		}
		System.out.println(sumwidthX);
		res = sumwidthX-res;
		System.out.println(res);

	}

}
