import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		long C[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		for (int i=0;i<N;i++) {
			B[i] = sc.nextLong();
		}
		for (int i=0;i<N;i++) {
			C[i] = sc.nextLong();
		}
		long result =0;
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		int startB=0;
		for (int i=0;i<N;i++) {
			int startC=0;
			int position = Main.findBig(B, startB, A[i]);
			if (position==-1) {
				System.out.println(result);
				return;
			}
			startB = position;
			for (int j=position;j<N;j++) {
				int positionC= Main.findBig(C,startC,B[j]);
				if (positionC==-1) {
					System.out.println(result);
					return;
				}
				result =result+((long)N-(long)positionC);
				startC = positionC;
			}
		}
		System.out.println(result);
	}
	public static int findBig(long A[],int start,long target) {
		int end = A.length-1;
		int min = -1;
		while (end>=start) {
			int mid = (start+end)/2;
			if (A[mid]>target) {
				min = mid;
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return min;
	}
}