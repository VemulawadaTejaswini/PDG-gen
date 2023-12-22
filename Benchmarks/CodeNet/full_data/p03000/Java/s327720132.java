import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int X=stdIn.nextInt();
		int L=0;
		int z=1,sum=0;
		while(z<=N){
			L=stdIn.nextInt();
			sum+=L;
			if(sum>X)
				break;
			z++;
		}
		System.out.println(z);
	}
}