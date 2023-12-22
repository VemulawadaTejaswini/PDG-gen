import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		long[] A = new long[N];
		long ans = 1;

		for(int i = 0;i<N;i++) {
			A[i]=Long.parseLong(sc.next());
		}

		Arrays.sort(A);
		long m = 0;
		for(int i=0;i<N;i++) {



			long tmp = A[0];
			if(i ==0) {
				tmp=A[1];
			}

			boolean f = true;
			for(int j=0;j<N;j++){

				if(tmp ==1)break;

				if(tmp < ans){
					break;
				}
				if(A[j]<ans)  break;

				if(j !=i) {
					tmp = GCD(tmp,A[j]);
				}
			}
			if(ans<tmp){
				ans = tmp;
			}
		}

		System.out.println(ans);


	}

	static long GCD(long a,long b) {
		if(a>b) {
			long tmp;
	        while ((tmp = a % b) != 0) {
	            a = b;
	            b = tmp;
	        }
	        return b;
		}else {
			long tmp;
	        while ((tmp = b % a) != 0) {
	            b = a;
	            a = tmp;
	        }
	        return a;
		}
	}
}