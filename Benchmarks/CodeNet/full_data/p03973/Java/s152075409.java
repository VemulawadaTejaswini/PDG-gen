import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++){
			A[i] = scan.nextLong();
		}

		long res = 0;
		long min = 0;

		for(int i=0;i<N;i++){
			if(i==0){
				res += A[i]-1;
				min = 1;
				continue;
			}
			if(min+1==A[i]){
				min = A[i];
			}else if(min+1<A[i]){
				res += (A[i]-1)/(min+1);
			}
		}
		System.out.println(res);
	}

}