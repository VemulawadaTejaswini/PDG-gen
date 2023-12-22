import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int h[]=new int[N];
		int z=0;
		int max=999999999;
		int y=0,ir=1;
		while(z<N){
			h[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(h);
		while(z<N){
			if(h[z+K-1]-h[z]<max)
				max=h[z+K-1]-h[z];
			z++;
			if(z+K-1==N)
				break;
		}
		System.out.println(max);
	}
}