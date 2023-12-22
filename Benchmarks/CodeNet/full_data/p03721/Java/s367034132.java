import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int a[][]=new int[N][2];
		int z=0;
		long ans=0;
		while(z<N){
			a[z][0]=stdIn.nextInt();
			a[z][1]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(a,(b, c) -> Integer.compare(b[0], c[0]));
		while(z<N){
			ans+=a[z][1];
			if(ans>=K){
				System.out.println(a[z][0]);
				break;
			}
			z++;
		}
	}
}