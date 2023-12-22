import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];
		Long[] AB = new Long[X*Y];
		Long[] ABC = new Long[Math.min(K,X*Y)*Z];
		for (int i=0;i<X;i++) {
			A[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<Y;i++) {
			B[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<Z;i++) {
			C[i]=Long.parseLong(sc.next());
		}
		int n=0;
		for (int i=0;i<X;i++) {
			for (int j=0;j<Y;j++) {
				AB[n]=A[i]+B[j];
				n++;
			}
		}
		Arrays.sort(AB,Comparator.reverseOrder());

		int m=0;
		for (int i=0;i<Math.min(K,X*Y);i++) {
			for (int j=0;j<Z;j++) {
				ABC[m]=AB[i]+C[j];
				m++;
			}
		}
		Arrays.sort(ABC,Comparator.reverseOrder());

		for (int i=0;i<K;i++) {
			System.out.println(ABC[i]);
		}
	}
}