import java.io.IOException;
import java.util.Scanner;
class Main
{

	static int n,m,k,end=0;
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();m=sc.nextInt();k=sc.nextInt();
		for(int i=0;end==0&&i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(m*i+(n-i)*j-i*j==k){end=1;break;}
			}
		}
		if(end==1){System.out.println("Yes");}
		else{System.out.println("No");}
	}

}
