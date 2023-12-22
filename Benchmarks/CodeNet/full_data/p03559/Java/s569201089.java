import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N+1];
		int B[]=new int[N];
		int ans[]=new int[N];
		int C[]=new int[N];
		int z=0;
		long key=0,cout=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<N;j++){
				if(i==0)
					A[j]=stdIn.nextInt();
				if(i==1)
					B[j]=stdIn.nextInt();
				if(i==2)
					C[j]=stdIn.nextInt();
			}
		}
		A[N]=1000000005;
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		for(int i=0;i<N;i++){
			while(z<N+1){
				if(A[z]>=B[i]){
					ans[i]=z;
					break;
				}
				z++;
			}
		}z=0;
		for(int i=0;i<N;i++){
			while(z<N+1){
				if(z==N&&B[z-1]<C[i]){
					key+=cout;
					break;
				}
				else
					if(z==N)
						break;
				if(B[z]>=C[i]){
					key+=cout;
					break;
				}
				cout+=ans[z];
				z++;
			}
		}
		System.out.println(key);
	}
}
