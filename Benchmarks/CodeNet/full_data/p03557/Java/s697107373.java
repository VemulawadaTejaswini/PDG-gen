
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int res = 0;

	public static void main(String[] args) throws Exception {

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < a.length; i++)
			b[i] = sc.nextInt();
		for (int i = 0; i < a.length; i++)
			c[i] = sc.nextInt();

		System.out.println(helper(a, b, c));

	}

	private static long helper(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long[] A = new long[a.length];
		long[] B = new long[a.length];
		Arrays.fill(A, -1);
		Arrays.fill(B, -1);
		int j=a.length-1;
		for (int i = a.length-1; i >=0; i--) {
			for (; j >=0; j--) {
				if (a[j] < b[i]) {
					A[i] =j+1;
					break;
				}
			}
			if (j < 0)
				break;
		}
		j = 0;
		for (int i = 0; i < a.length; i++) {
			for (; j < b.length; j++) {
				if (c[j] > b[i]) {
					B[i] = a.length - j;
					break;
				}
			}
			if (j > b.length)
				break;
		}
		long res = 0;

		for (int i = 0; i < a.length; i++) {
			if(A[i]>0&&B[i]>0)
			res+=A[i]*B[i];
		}
		return res;
	}

	private static void out(int[] c) {
		for(int i=0;i<c.length;i++) 
			System.out.print(c[i]+" ");
		System.out.println();
	}
}