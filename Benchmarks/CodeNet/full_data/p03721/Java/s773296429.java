import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int a[]=new int[N];
		int b[]=new int[100001];
		int z=0,ans=0;
		while(z<N){
			a[z]=stdIn.nextInt();
			b[a[z]]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(a);
		while(z<N){
			ans+=b[a[z]];
			if(ans>=K){
				System.out.println(a[z]);
				break;
			}
			z++;
		}
	}
}