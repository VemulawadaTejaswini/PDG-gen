import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N];
		int b[]=new int[100000];
		int z=0,max=0;
		while(z<N){
			a[z]=stdIn.nextInt();
			b[a[z]]++;
			z++;
		}z=1;
		while(z<99998){
			if(b[z]+b[z+1]+b[z+2]>max)
				max=b[z]+b[z+1]+b[z+2];
			z++;
		}
		System.out.println(max);
	}
}