import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		for(long i=0L; i<N; i++) {
			long t=sc.nextLong()*100000000L+(i+1L);
			A[(int)i]=t;
		}
		Arrays.sort(A);
		for(int i=0; i<N-1; i++) {
			System.out.print(A[i]%100000000+" ");
		}
		System.out.println(A[N-1]%100000000);

	}
	public static void p(Object o) {
		System.out.println(o);
	}
}