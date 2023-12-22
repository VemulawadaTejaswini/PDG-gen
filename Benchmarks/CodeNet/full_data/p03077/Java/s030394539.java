import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N;
		long[] A = new long[5];
//		long[] B = new long[6];
		long[] C = new long[5];
		long[] D = new long[6];
		long[] E = new long[6];
		long[] man = new long[6];
		long ans=0;
		N=sc.nextLong();
		for(int i = 0;i<5;i++) {
			A[i]=sc.nextLong();
		}
//		B[0]=-A[0];
//		for(int i = 1;i<5;i++) {
//			B[i]=A[i-1]-A[i];
//		}
//		B[5]=A[4];

		long now=A[0];
		long minc=Long.MAX_VALUE;
		for(int i = 0;i<5;i++) {
			C[i]=Math.min(now, A[i]);
			now=C[i];
			minc=Math.min(minc, now);
		}

		long k=N;
		D[0]=N;
		while(D[5]==0) {
			for(int i = 0;i<5;i++) {
				if(D[i]==0) {

				} else if(D[i]>=A[i]) {
					E[i+1]+=A[i];
					D[i]-=A[i];
				} else {
					E[i+1]+=D[i];
					D[i]=0;
				}
			}
			for(int i = 0;i<6;i++) {
				D[i]+=E[i];
				E[i]=0;
			}
			ans++;
		}

		boolean match = true;
		for(int i = 0;i<5;i++) {
			if(C[i]>D[i]) {
				match=false;
				break;
			}
		}
//		System.out.println(match);
		if(match) {
			long mid=0;
			for(int i = 0;i<5;i++) {
				mid+=C[i];
			}
			mid=N-mid;
			ans+=mid/minc;
			D[0]=N%A[0];
		}

		while(D[0]!=0||D[1]!=0||D[2]!=0||D[3]!=0||D[4]!=0) {
			for(int i = 0;i<5;i++) {
				if(D[i]==0) {

				} else if(D[i]>=A[i]) {
					E[i+1]+=A[i];
					D[i]-=A[i];
				} else {
					E[i+1]+=D[i];
					D[i]=0;
				}
			}
			for(int i = 0;i<6;i++) {
				D[i]+=E[i];
				E[i]=0;
			}
			ans++;
		}

//		for(int i = 0;i<6;i++) {
//			System.out.print(D[i]+", ");
//		}
//		System.out.println();
//		for(int i = 0;i<5;i++) {
//			System.out.print(C[i]+", ");
//		}
//		System.out.println();



		System.out.println(ans);
	}

}
