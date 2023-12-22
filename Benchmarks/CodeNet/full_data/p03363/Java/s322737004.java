import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0;
		long sum=0,x=1,ans=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			sum+=A[z];
			A[z]=sum;
			if(A[z]==0)
				ans++;
			z++;
		}z=1;sum=1;
		Arrays.sort(A);
		while(z<N){
			if(A[z]!=A[z-1]){
				ans+=x-sum;
				x=0;sum=0;
			}
			sum++;x+=sum;
			z++;
		}
		ans+=x-sum;
		System.out.println(ans);
	}
}