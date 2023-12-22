import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		long[] A=new long[N];
		long[] B=new long[N];
		long[] C=new long[N];
		long sum=0;
		int ans=0;
		

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			C[i] = A[i]-B[i];
		}
		for (int i = 0; i < N; i++) {
			sum=sum+C[i];
		}
		
		if(sum<0) {
			System.out.print("-1"); 
			}else {
				Arrays.sort(C);
long tar=0;
				for(int k=0;k<C.length;k++) {
					if(C[k]>=0)break;
					tar=tar+C[k];
					ans++;
				}
				for(int k=0;k<C.length;k++) {
					if(tar>=0)break;
					tar=tar+C[C.length-k-1];
					ans++;
		}
				System.out.print(ans); 
		
	}

	
	}
}


