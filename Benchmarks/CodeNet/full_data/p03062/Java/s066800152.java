import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
		}
		for(int i=0;i<N-1;i++) {
			if(A[i]<0&&A[i+1]<0) {
				A[i]*=-1;
				A[i+1]*=-1;
			}else if(A[i]<0&&A[i+1]>=0&&Math.abs(A[i])>=Math.abs(A[i+1])) {
				A[i]*=-1;
				A[i+1]*=-1;
			}
		}
		long sum=0;
		if(A.length%2==0) {
			for(int i=0;i<N;i++) {
				sum+=Math.abs(A[i]);
			}
		}else {
			for(int i=0;i<N;i++) {
				sum+=A[i];
			}
		}
		System.out.println(sum);
	}

}
