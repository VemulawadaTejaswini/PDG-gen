import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N,M;
		N=scan.nextInt();
		M=scan.nextInt();
		int A[]=new int[N];
		int i,j;
		for(i=0;i<N;i++){
			A[i]=scan.nextInt();
		}
		int max;
		for(i=0;i<M;i++){
			max=0;
			for(j=1;j<N;j++){
				if(A[max]<A[j]){
					max=j;
				}
			}
			A[max]/=2;
		}
		long total=0;
		for(i=0;i<N;i++){
			total+=A[i];
		}
		System.out.print(total);
	}
}