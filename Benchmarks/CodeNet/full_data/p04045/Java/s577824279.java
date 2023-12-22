//package AtCoder;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int k=sc.nextInt();
		boolean[] b=new boolean[10];
		//System.out.println(n);
		for(int i=0;i<k;i++)
		{
			b[sc.nextInt()]=true;
		}
		int smallest=-1;
		for(int i=0;i<10;i++)
		{
			if(b[i]==false)
			{
				smallest=i;
				break;
			}
		}
		
		boolean change=false;
		String ans="";
		for(int i=0;i<n.length();i++)
		{
			char c=n.charAt(i);
			int num=((int)c)-48;
			if(change==false)
			{
				if(b[num]==false)
				{
					ans=ans+num;
					continue;
				}
				else
					for(int j=num+1;j<=9;j++)
					{
						if(b[j]==false)
						{
							ans=ans+j;
							change=true;
							break;
						}
					}
			}
			else if(change==true)
			{
				ans=ans+smallest;
			}
		}
		if(ans.isEmpty())
		{
			int len=n.length();
			if(smallest!=0)
			{
				len+=1;
			}
			else
			{
				for(int i=1;i<10;i++)
				{
					if(b[i]==false)
					{
						ans=ans+i;
						break;
					}
				}
			}
			for(int i=0;i<len;i++)
			{
				ans=ans+smallest;
			}
		}
		System.out.println(ans);

	}

}
