import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int K=scan.nextInt();
		int N=scan.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		int C[]=new int[N];
		int a=0;
		int total=0;
		int total2=0;
		for(int i=0;i<N;i++){
			A[i]=scan.nextInt();
		}
		for(int i=0;i<N;i++){
			B[i]=A[i]-K;
		}
		for(int i=0;i<N;i++){
			C[i]=A[i];
		}
		for(int i=0;i<N;i++){
			if(Math.abs(A[i])>Math.abs(B[i])){
				A[i]=B[i];
			}
		}
		for(int i=N-1;i>=1;i--){
			for(int j=i;j>=1;j--){
				if(A[j-1]>A[j]){
					a=A[j];
					A[j]=A[j-1];
					A[j-1]=a;
				}
			}
		}
		for(int i=0;i<N-1;i++){
			total+=A[i+1]-A[i];
		}
		for(int i=N-1;i>=1;i--){
			for(int j=i;j>=1;j--){
				if(C[j-1]>C[j]){
					a=C[j];
					C[j]=C[j-1];
					C[j-1]=a;
				}
			}
		}
		for(int i=0;i<N-1;i++){
			total2+=C[i+1]-C[i];
		}
		System.out.println(Math.min(total, total2));

	}

}
