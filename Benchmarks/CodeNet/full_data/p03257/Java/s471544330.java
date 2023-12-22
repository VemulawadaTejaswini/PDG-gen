
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		long a=3;


		for (int i=0;i<n;++i){
			for (int j=0;j<n;++j){
				System.out.print(a+j);
				if(i!=n-1)System.out.print(" ");
			}
			System.out.println();
			a=a+2;
		}


	}
}