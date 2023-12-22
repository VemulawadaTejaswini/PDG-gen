import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[100001];
		int z=0,y=0,max=0;
		while(z<N){
			y=stdIn.nextInt();
			a[y]++;
			z++;
		}z=1;
		while(z<100000-2){
			y=a[z]+a[z+1]+a[z+2];
			if(y>max)
				max=y;
			z++;
		}
		System.out.println(max);
	}
}