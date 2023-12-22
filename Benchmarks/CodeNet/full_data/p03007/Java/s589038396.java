import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A [] = new int [N];
		for (int i=0; i<N; i++){
			A[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(A);
		
		if (N==2){
			System.out.println(A[0]-A[N-1]);
			System.out.println(A[0]+" "+A[N-1]);
		}
		else {
			//System.out.println(A[0]+" "+A[N-1]);
			int ans = A[0]-A[N-1];
			int [] x = new int [N];
			int [] y = new int [N];
			for (int i=1; i<N-2; i++){
				//System.out.println(ans+" "+A[N-1-i]);
				x[i]=ans;
				y[i]=A[N-1-i];
				ans=ans-A[N-1-i];
			}
			System.out.println(A[1]-ans);
			System.out.println(A[0]+" "+A[N-1]);
			for (int i=1; i<N-2; i++){
				System.out.println(x[i]+" "+y[i]);
			}
			System.out.println(A[1]+" "+ans);
		}
	}

}
