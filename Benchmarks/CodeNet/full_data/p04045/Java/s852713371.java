
import java.util.*;
public class Main
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [] n=new int [10];
	while(sc.hasNext())
	{
		
		Arrays.fill(n, 0);
		int a=sc.nextInt();
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int temp=sc.nextInt();
			n[temp]=1;
		}
		//System.out.println(a);
		int flag=1;
		int money=0;
		while(flag==1)
		{
			money=money+a;
			//System.out.println(money);
			String mo=Integer.toString(money);
			flag=0;
			for(int i=0;i<=9;i++)
			{
				String o=Integer.toString(i);
				if(n[i]==0)continue;
				if(mo.indexOf(o)>=0)
				{
					flag=1;break;
				}
			}

		}
		System.out.println(money);
	
	}
		
	}
		


}