import java.util.Scanner;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long a[] = new long[N];

		//long sum = 0;
		for(int i = 0;i<N;i++){
			a[i] = sc.nextLong();
			//sum += a[i];
		}

		//double beta = (double)sum/N - (double)(N + 1)/2;

		//long lowbeta = (long)Math.floor(beta);
		//long highbeta = (long)Math.ceil(beta);

		//long lowalpha = 0;
		//long highalpha = 0;

		long min = Long.MAX_VALUE;

		for(int i=0;i<N;i++){
			int x = calc(i,a,N);

			if(x < min){
				min = x;
			}else{
				break;
			}
		}
		System.out.println(min);
	}

	public static int calc(int beta, long[] a,int N){

		int alpha = 0;

		for(int i=0;i<N;i++){
			alpha += Math.abs(a[i] - i - 1 - beta);
		}

		return alpha;
	}
}