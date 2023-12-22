import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n , k = 0;
		int a, b, x = 0;
		n = stdin.nextInt();
		a = stdin.nextInt();
		b = stdin.nextInt();
		long[] A = new long[n];
		for (int i = 0; i < n; i++) {
			A[i] = stdin.nextInt();
		}
		int Tmax=1000000000;
		int Tmin=0;
		int T=0;
		//二分探索
		while(Tmax-Tmin>1){
			T=Tmin+(Tmax-Tmin)/2;
			 k=0;
			for(int i=0;i<n;i++){
				if(A[i]>b*T){
					k+=Math.ceil((double)(A[i]-b*T)/(double)(a-b));
				}
			}
			
			if(k>T){
				Tmin=T;
			}
			else if(k<=T){
				Tmax=T;
			}
		}
		System.out.println(Tmax);
	}

}