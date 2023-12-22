
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int A=input.nextInt();
		int B=input.nextInt();
		int K=input.nextInt();

		for(int i=0; i<K; i++)
		{
			if(i%2==0)
			{
				if(A%2!=0)
				{
					A--;
				}

				int temp=A/2;
				B+=temp;
				A=A/2;
			}
			else
			{
				if(B%2!=0)
					B--;

				int temp=B/2;
				A+=temp;
				B=B/2;
			}
		}

		System.out.println(A+" "+B);
	}



}

