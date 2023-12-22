import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		int a[]=new int[3];
		
		for(int i=0;i<a.length;i++)
			a[i]=input.nextInt();
		
		int N=a[0],A=a[1],B=a[2];
		
				if(N>A)
					System.out.println(A);
				else if(N<A)
					System.out.println(N);
	}

}

