import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		double a[]=new double[N];
		double max=0;
		double min=200;
		int min2=0;
		double ir=1;
		int z=0;
		while(z<N){
			a[z]=stdIn.nextDouble();
			max+=a[z];
			z++;
		}z=0;
		max/=N;
		while(N-1>=0){
			if(a[N-1]-max<0)
				ir=-1;
			if((a[N-1]-max)*ir<=min){
				min=(a[N-1]-max)*ir;
				min2=N-1;
			}
			N--;
			ir=1;
		}
		System.out.println(min2);
	}

}