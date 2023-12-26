public class Main {
	public static void main(String[] args) {
		Scanner ret = new Scanner(System.in);
		int a,b=0,i,c=0;
		String s;
		for(i=0;i<3;i++)
		{
			a=ret.nextInt();
			if(a==5)
			{
			 b++;
			}
			else if(a==7)
				c++;
		}
		if(b==2&&c==1)
		{
		 System.out.println("YES");
		}
		else
		 System.out.println("NO");
	}
}
