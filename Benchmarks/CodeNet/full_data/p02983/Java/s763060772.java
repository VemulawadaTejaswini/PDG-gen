import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long L=stdIn.nextInt();
		long R=stdIn.nextInt();
		long min=2019,min2=2019,z=L;
		while(z<=R){
			if(z%2019<min)
				min=z%2019;
			z++;
		}z=L;
		while(z<=R){
			if(z%2019<min2&&z%2019!=min)
				min2=z%2019;
			z++;
		}
		System.out.println((min*min2)%2019);
	}
}