import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		char[] s_ch=s.toCharArray();
		char[] t_ch=t.toCharArray();
		char[] ans=new char[n*2];
		int j=0;
		
		for(int i=0;i<n;i++)
		{
			ans[j]=s_ch[i];
			j++;
			ans[j]=t_ch[i];
			j++;
		}
		
		String ans_s=String.valueOf(ans);
		System.out.println(ans_s);
		
		sc.close();
	}
}
