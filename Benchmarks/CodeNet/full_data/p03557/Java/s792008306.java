import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N+1];
		int B[][]=new int[N+1][2];
		int C[]=new int[N];
		int z=0,y=0,ans=0,sum=0;
		A[N]=1000000005;B[N][0]=1000000005;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N){
			B[z][0]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N){
			C[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(A);
		Arrays.sort(C);
		Arrays.sort(B, (a, b) -> Long.compare(a[0], b[0]));
		while(z<N){
			while(y<N+1){
				if(B[z][0]<=A[y]){
					B[z][1]=y;
					break;
				}
				y++;
			}
			z++;
		}z=0;y=0;
		while(z<N){
			while(y<N+1){
				if(C[z]<=B[y][0]){
					ans+=sum;
					break;
				}
				sum+=B[y][1];
				y++;
			}
			z++;
		}
		System.out.println(ans);
	}
}