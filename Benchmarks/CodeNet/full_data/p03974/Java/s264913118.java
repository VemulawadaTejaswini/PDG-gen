import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int N = sc.nextInt();
			String[] s = new String[N];
			for(int i=0;i<N;i++)
			{
				s[i] = sc.next();
			}
			int N1 = sc.nextInt();
			int[] array = new int[N1];
			String[] std = new String[N1];
			for(int i=0;i<N1;i++)
			{
				array[i] = sc.nextInt();
				std[i] = sc.next();	
			}
			for(int i=0;i<N1;i++)
			{
				System.out.println(order(s,array[i],std[i]));
			}
		}
	
	}
	public static int order(String[] s,int k,String std)
	{
		int small = 1;
		String compare = s[k-1];
		for(int i=0;i<s.length;i++)
		{
			if(i == k-1)
			{
				continue;
			}
			if(!front(compare,s[i],std))
			{
				small++;
			}
		}
		return small;
	}
	public static boolean front(String s1,String s2,String std)
	{
		boolean flag = true;
		int n1 = s1.length();
		int n2 = s2.length();
		int i = 0;
		while(true)
		{
			if(index(s1.charAt(i),std) < index(s2.charAt(i),std))
				break;
			else if(index(s1.charAt(i),std) > index(s2.charAt(i),std))
			{
				flag = false;
				break;
			}
			else
				i++;
			if(i == n1 | i== n2)
			{
				if(n1 > n2)
				{
					flag = false;
					break;
				}
				else
					break;
			}
		}
		return flag;
	}
	public static int index(char x,String std)
	{
		int i = 0;
		while(x != std.charAt(i))
			i++;
		return i;
	}
}