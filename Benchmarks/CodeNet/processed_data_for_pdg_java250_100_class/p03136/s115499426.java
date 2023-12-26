public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int [a+1];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		int c=0;
		for(int j=0;j<a;j++)
		{
			c=c+b[j];
		}
		if(b[a]<c)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
