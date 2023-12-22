import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int c=0,i,j,k,n,s;
k=sc.nextInt();
s=sc.nextInt();
for(i=0;i<=k;i++)
{
	for(j=0;j<=k;j++)
	{
		for(n=0;n<=k;n++)
		{
			if((i+j+n)==s)
              c++;
		}
	}

}

System.out.println(c);
	}
}
